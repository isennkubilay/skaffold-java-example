#!/bin/bash

set -e  # Exit immediately if a command exits with a non-zero status

# Run Maven package
mvn clean package --offline

# Build the Docker image
docker build -t my-java-app-image .



# Push the Docker image to the private registry
docker push my-java-app-image

