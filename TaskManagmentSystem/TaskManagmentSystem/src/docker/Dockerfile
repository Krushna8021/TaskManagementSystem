# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the project files into the container
COPY target/task-management-system-0.0.1-SNAPSHOT.jar /app/task-management-system.jar

# Expose the port the app runs on
EXPOSE 8089

# Run the application
ENTRYPOINT ["java", "-jar", "task-management-system.jar"]

