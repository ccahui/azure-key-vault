# Usar una imagen base que tenga Maven y JDK 17
FROM maven:3.8.4-openjdk-17-slim AS builder

# Establecer el directorio de trabajo
WORKDIR /app

# Copiar el archivo pom.xml y el directorio src (solo si es necesario)
COPY pom.xml /app
COPY src /app/src

# Ejecutar la compilación del proyecto y generar el JAR, sin ejecutar las pruebas
RUN mvn clean package -DskipTests

# Etapa de runtime: Usamos una imagen base con JDK 17 para ejecutar el JAR
FROM openjdk:17-slim

ENTRYPOINT ["top", "-b"]