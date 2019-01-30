FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 9000
MAINTAINER manuel.ruiz@meltsan.com
ARG JAR_FILE=build/processing-batch-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} processing-batch.jar
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/processing-batch.jar"]