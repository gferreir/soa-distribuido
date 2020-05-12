FROM openjdk:8-jdk-alpine
LABEL maintainer="Guilherme Fereira"
ADD target/Reator-0.0.1.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "/app.jar"]