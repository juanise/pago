#!/usr/bin/env sh

IMAGE="twcammaster.uv.es/proyecto1-api-pago"
TAG="latest"

#############################################
# - TWCAM, 06/2019
#############################################

  echo "Creating ${IMAGE}..."

  docker build -t $IMAGE:$TAG .