#FROM openjdk:8-jdk-alpine
FROM ubuntu:16.04

# Install Java
RUN apt-get update
RUN apt-get install -y default-jdk
RUN apt-get install -y xvfb
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
CMD (service xvfb start; export DISPLAY=:10;)
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]