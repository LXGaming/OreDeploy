/*
 * Copyright 2019 Alex Thomson
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.lxgaming.oredeploy;

import com.google.inject.Inject;
import org.slf4j.Logger;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameConstructionEvent;
import org.spongepowered.api.plugin.Plugin;

@Plugin(
        id = OreDeploy.ID,
        name = OreDeploy.NAME,
        version = OreDeploy.VERSION,
        description = OreDeploy.DESCRIPTION,
        authors = {OreDeploy.AUTHORS},
        url = OreDeploy.WEBSITE
)
public class OreDeploy {
    
    public static final String ID = "oredeploy";
    public static final String NAME = "OreDeploy";
    public static final String VERSION = "${version}";
    public static final String DESCRIPTION = "Automated deployment to SpongePowered/Ore";
    public static final String AUTHORS = "LX_Gaming";
    public static final String SOURCE = "https://github.com/LXGaming/OreDeploy";
    public static final String WEBSITE = "https://lxgaming.github.io/";
    
    private static OreDeploy instance;
    
    @Inject
    public Logger logger;
    
    @Listener
    public void onConstruction(GameConstructionEvent event) {
        instance = this;
        getLogger().info("{} v{} constructed", OreDeploy.NAME, OreDeploy.VERSION);
    }
    
    public static OreDeploy getInstance() {
        return instance;
    }
    
    public Logger getLogger() {
        return logger;
    }
}