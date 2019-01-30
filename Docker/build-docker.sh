#!/usr/bin/env bash
cd ..
gradle build -x test --stacktrace

cd Docker
rm -rf build
mkdir build
cp ../build/libs/processing-batch-0.0.1-SNAPSHOT.jar build
cd Doccker


docker stop batch-example
docker rm -vf batch-example

# Creamos la imagen
docker build -t mars/batch:v$1 .

# Creamos el contenedor a partir de la imagen creada.
docker run -d -p 9000:8080 --name batch-example mars/batch:v$1
docker ps -a
