#FROM openjdk:8-jdk-alpine
FROM ubuntu:16.04

# Install Java
RUN apt-get update
RUN apt-get install -y default-jdk
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]