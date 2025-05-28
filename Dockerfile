FROM eclipse-temurin:24-jdk

COPY target/demo-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8086

ENTRYPOINT ["java", "-jar", "/app.jar"]
