# Skaffold Java Example

## Description

This repository contains an example of a Java application developed with Skaffold.

## Prerequisites

- Java 11 or higher
- Docker
- Skaffold

## Getting Started

1. Clone the repository
2. Navigate to the project directory
3. `chmod +x download_maven_dependencies.sh`
4. `./download_maven_dependencies.sh`
5. Run `skaffold dev --trigger=manual --default-repo <local-registry:8080>` to start the application

## Usage

This repository is created for a Java offline development environment in kubernetes.