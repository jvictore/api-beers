#!/usr/bin/env bash

docker-compose down
docker image rmi -f demo-api:latest
docker build -t demo-api:latest .
#sed -i "s|demo_image|demo-api:latest|g" docker-compose.yml
docker-compose up -d

PURPLE='\033[0;35m'
printf "${PURPLE}Deploy finish\n"
