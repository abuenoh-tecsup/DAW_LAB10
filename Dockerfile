FROM eclipse-temurin:24-jdk

WORKDIR /app

COPY target/PRJ_CRUD_SPRING_BOOT_MONGODB-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8086

ENTRYPOINT ["java", "-jar", "/app.jar"]
