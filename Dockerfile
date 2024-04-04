FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY target/thomas-1.0.0.jar thomas-1.0.0.jar
EXPOSE 25000
CMD ["java", "-jar","deploy_render-1.0.0.jar"]