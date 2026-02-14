# Stage 1: build the jar
FROM maven:3.9.4-eclipse-temurin-17 AS build
WORKDIR /workspace

# copy only the files needed for a Maven build to leverage layer caching
COPY pom.xml ./
COPY src ./src

# build the application (skip tests for speed; remove -DskipTests to run tests)
RUN mvn -B -DskipTests package

# Stage 2: run the jar
FROM eclipse-temurin:17-jre-jammy
WORKDIR /app

# Copy the packaged jar from the build stage. We use a wildcard to match versioned names.
COPY --from=build /workspace/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/app.jar"]

