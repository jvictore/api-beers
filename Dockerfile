FROM maven:3.5.2-jdk-8-alpine AS maven_builder
WORKDIR /app
COPY . /app
RUN mvn clean package install -DskipTests

# MY IMAGE
FROM openjdk:8-alpine
WORKDIR /app

RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring

COPY --from=maven_builder /app/target/*.jar app.jar

#ARG JAR_FILE=build/*
#COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","/app/app.jar"]