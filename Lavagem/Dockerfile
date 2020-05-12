FROM openjdk:8-jdk-alpine
LABEL maintainer="Guilherme Fereira"
ADD target/Lavagem-0.0.1.jar app.jar
EXPOSE 8083
ENTRYPOINT ["java", "-jar", "/app.jar"]