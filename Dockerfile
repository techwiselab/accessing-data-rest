# Build stage
FROM maven:3.9-amazoncorretto-17 AS build
WORKDIR /build
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

#
# Package stage
#
FROM --platform=linux/arm64 mcr.microsoft.com/openjdk/jdk:17-ubuntu
WORKDIR /app
COPY --from=build /build/target/*.jar /app/app.jar
EXPOSE 8080
CMD ["java", "-jar", "/app/app.jar"]

# docker build -t accessing-data-rest:1.1 .
# docker run -p 8080:8080 accessing-data-rest:1.1