FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY target/deploy_render-1.0.0.jar deploy_render-1.0.0.jar
EXPOSE 25000
CMD ["java", "-jar","deploy_render-1.0.0.jar"]