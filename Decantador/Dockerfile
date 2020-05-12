FROM openjdk:8-jdk-alpine
LABEL maintainer="Guilherme Fereira"
ADD target/Decantador-0.0.1.jar app.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "/app.jar"]