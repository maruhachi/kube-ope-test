#!/bin/bash
echo "${DOCKER_PASSWD" | docker login -u ${DOCKER_USER} --password-stdin
docker build --tag maruahchi/kube-app:${TRAVIS_COMMIT_ID} .
docker push maruhachi/kube-app