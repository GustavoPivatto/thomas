FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY target/thomas-0.0.1-SNAPSHOT.jar thomas-0.0.1-SNAPSHOT.jar
EXPOSE 25000
CMD ["java", "-jar","thomas-0.0.1-SNAPSHOTjar"]