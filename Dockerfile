FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY ./thomas-0.0.1.jar thomas-0.0.1.jar
EXPOSE 25000
CMD ["java", "-jar","thomas-0.0.1.jar"]