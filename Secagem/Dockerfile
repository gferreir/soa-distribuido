FROM openjdk:8-jdk-alpine
LABEL maintainer="Guilherme Fereira"
ADD target/Secagem-0.0.1.jar app.jar
EXPOSE 8084
ENTRYPOINT ["java", "-jar", "/app.jar"]