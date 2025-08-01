# 🚀 Foro Hub - API REST para gestión de tópicos

Una API REST robusta desarrollada con Spring Boot para la gestión de un foro de discusión, permitiendo crear, leer, actualizar y eliminar tópicos.

---

## 📚 Descripción del Proyecto

`Foro Hub - API REST` es un servicio backend diseñado para proporcionar una interfaz programática completa para la creación, lectura, actualización y eliminación de tópicos.

El proyecto se adhiere a una arquitectura en capas clara, promoviendo la modularidad, la mantenibilidad y la escalabilidad. Incorpora principios de Clean Code y buenas prácticas de diseño de APIs REST, con un fuerte enfoque en la seguridad mediante la autenticación basada en JWT y el hashing de contraseñas. La gestión del esquema de la base de datos se realiza de forma automatizada y controlada con Flyway.

---

## ✨ Características Principales

* **Gestión Completa de Tópicos (CRUD):**
    * Creación de nuevos tópicos con título, mensaje, autor (usuario registrado) y curso.
    * Detalle de un tópico específico por ID.
    * Actualización de tópicos existentes (título, autor, mensaje, curso).
    * Eliminación de tópicos.
* **Autenticación y Autorización Segura:**
    * **Spring Security:** Framework robusto para la seguridad de la aplicación.
    * **JSON Web Tokens (JWT):** Autenticación sin estado para proteger los endpoints de la API.
    * **Hashing de Contraseñas:** Las contraseñas se almacenan de forma segura utilizando BCrypt.
* **Validación de Datos:**
    * Uso de `jakarta.validation` para asegurar la integridad y el formato de los datos de entrada.
* **Manejo de Errores Global:**
    * Respuestas HTTP estandarizadas (`400 Bad Request`, `403 Forbidden`, `404 Not Found`, `500 Internal Server Error`) para una comunicación clara con el cliente.
* **Gestión de Base de Datos con Flyway:**
    * Control de versiones del esquema de la base de datos para un despliegue y mantenimiento consistentes.

---

## 🛠️ Tecnologías Utilizadas

* **Lenguaje:** Java 17+
* **Framework:** Spring Boot 3
* **Base de Datos:** MySQL
* **ORM:** Spring Data JPA / Hibernate
* **Migraciones DB:** Flyway
* **Seguridad:** Spring Security, JWT (JSON Web Tokens)
* **Validación:** Jakarta Validation (Bean Validation)
* **Herramienta de Construcción:** Maven

---
