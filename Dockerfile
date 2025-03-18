# Use OpenJDK as the base image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy all files from the project
COPY . /app

# Ensure Maven wrapper is executable
RUN chmod +x /app/mvnw

# Install dependencies and build the project
RUN /app/mvnw clean package -DskipTests

# Expose the application port
EXPOSE 8080

# Run the built JAR file
CMD ["java", "-jar", "target/demo-0.0.1-SNAPSHOT.jar"]

