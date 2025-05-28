# Usamos una imagen base con OpenJDK 24
FROM eclipse-temurin:24-jdk

# Directorio de la app en el contenedor
WORKDIR /app

# Copiamos el JAR construido (ajusta el nombre si es distinto)
COPY target/PRJ_CRUD_SPRING_BOOT_MONGODB-0.0.1-SNAPSHOT.jar app.jar

# Exponemos el puerto 8086 que usas en tu properties
EXPOSE 8086

# Comando para ejecutar la app
ENTRYPOINT ["java", "-jar", "app.jar"]
