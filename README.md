# Item Lookup

This app is part of a proof of concept that deploys microservices, packaged as Docker images,
to a [Lattice](http://lattice.cf/) instance running locally.

This service will return item information based on a SKU.

## Building Docker images

The Docker images are built using a Gradle plugin and can be created by running `./gradlew build buildDocker`.
Prerequisites for building Docker images are:

* [Boot2docker](http://boot2docker.io/) installed locally
* A [DockerHub](https://hub.docker.com/) login

Before running the buildDocker command in a terminal window, you must have the 3 boot2docker env variables 
set in that window (see `docker up` for details). You also need to be logged in to DockerHub via `docker login`.

## Deploying to Lattice

See the [Lattice walkthrough](http://lattice.cf/docs/getting-started/) for details on how to use Lattice.
You can use the `bin/deploy-to-lattice.sh <DockerHub tag>` script to deploy Docker containers pushed to DockerHub to your
local Lattice installation.
