FROM openjdk:8-jdk-alpine
LABEL maintainer="Guilherme Fereira"
ADD target/Tanques-0.0.1.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.jar"]