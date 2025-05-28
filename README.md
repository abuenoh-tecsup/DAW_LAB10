# PRJ\_CRUD\_SPRING\_BOOT\_MONGODB

Aplicación CRUD de alumnos utilizando Spring Boot y MongoDB. Permite listar, registrar, editar y eliminar alumnos, con integración de formularios web mediante Thymeleaf.

### 🚀 Tecnologías usadas

`Spring Boot` • `MongoDB Atlas` • `Thymeleaf` • `Maven` • `Docker` • `Render` • `Java 17`

### 📦 Instalación local

1. Clonar el repositorio
2. Configurar la URI de conexión en el archivo `.env` o como variable de entorno:

```bash
MONGODB_URI=your_mongodb_connection_string
```

3. Ejecutar con Maven Wrapper:

```bash
./mvnw spring-boot:run
```

> 💡 Si estás usando **IntelliJ IDEA**, puedes correr el proyecto directamente con el botón "Run" o con `Shift + F10`.

### 🐳 Docker

```bash
docker build -t crud-alumnos .
docker run -p 8086:8086 -e MONGODB_URI="your_mongodb_uri" crud-alumnos
```

### 🌐 Aplicación desplegada

👉 [https://daw-lab10.onrender.com/listar-alumnos](https://daw-lab10.onrender.com/listar-alumnos)
