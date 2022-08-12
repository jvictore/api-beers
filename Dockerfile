FROM maven:3.5.3-jdk-8-alpine as maven_builder
WORKDIR /build
COPY pom.xml .
RUN mvn dependency:go-offline

COPY src/ /build/src/
RUN mvn clean package install -DskipTests

# MY IMAGE
FROM openjdk:8-alpine
WORKDIR /app

RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring

COPY --from=maven_builder /build/target/*.jar /app/app.jar

#ARG JAR_FILE=build/*
#COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","/app/app.jar"]