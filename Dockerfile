# Use OpenJDK 8 as the base image
FROM openjdk:8-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file from the target directory to the container
COPY ./target/*.jar app.jar

# Expose a default application port (adjust if necessary)
EXPOSE 8080

# Run the JAR file with Java
CMD ["java", "-jar", "app.jar"]