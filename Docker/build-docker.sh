#!/usr/bin/env bash
cd ..
gradle build -x test --stacktrace

cd Doccker
rm -rf build
mkdir build
cp ../build/libs/processing-batch-0.0.1-SNAPSHOT.jar build
cd Doccker


docker stop batch-processing
docker rm -vf batch-processing
docker build -t mars/batch-processing:v$1 .
docker run -d -p 9000:8080 --name batch-processing mars/batch-processing:v$1
docker ps -a
