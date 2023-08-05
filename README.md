# OreDeploy

[![License](https://img.shields.io/github/license/LXGaming/OreDeploy?label=License&cacheSeconds=86400)](https://github.com/LXGaming/OreDeploy/blob/master/LICENSE)

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
OreDeploy is licensed under the [Apache 2.0](https://github.com/LXGaming/OreDeploy/blob/master/LICENSE) license.