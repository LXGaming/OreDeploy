# OreDeploy

[![Build Status](https://travis-ci.org/LXGaming/OreDeploy.svg?branch=master)](https://travis-ci.org/LXGaming/OreDeploy)
[![License](https://lxgaming.github.io/badges/License-Apache%202.0-blue.svg)](https://www.apache.org/licenses/LICENSE-2.0)
[![Patreon](https://lxgaming.github.io/badges/Patreon-donate-yellow.svg)](https://www.patreon.com/lxgaming)
[![Paypal](https://lxgaming.github.io/badges/Paypal-donate-yellow.svg)](https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=CZUUA6LE7YS44&item_name=OreDeploy+(from+GitHub.com))

## Setup
### [SpongePowered/Ore](https://ore.spongepowered.org/)
Create an Ore API Key with the permission `create_version`.

### [Travis CI](https://travis-ci.com/)
![Travis Environment Variables](https://lxgaming.github.io/images/oredeploy/travis-environment-variables.png)
Add your Ore API Key as a environment variable, make sure you specify the `master` branch and ensure `Display value in build log` is disabled.

### Project
Add the [Deploy Script](https://raw.githubusercontent.com/LXGaming/OreDeploy/master/scripts/deploy) to your project.
Copy the `deploy` and `env` sections of the [.travis.yml](https://raw.githubusercontent.com/LXGaming/OreDeploy/master/.travis.yml) into your own and make sure to change the environment variables to match your setup.

## License
OreDeploy is licensed under the [Apache 2.0](https://www.apache.org/licenses/LICENSE-2.0) license.
