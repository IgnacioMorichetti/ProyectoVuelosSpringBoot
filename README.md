# ProyectoVuelos

Sistema de reservas de vuelos desarrollado con Spring Boot 3, JPA, MySQL y frontend estático en HTML/CSS/JS.

## Stack

- Java 21
- Spring Boot 3.2.5
- Spring Data JPA + Hibernate
- MySQL 8
- HTML / CSS / JavaScript (vanilla)

## Requisitos previos

- JDK 21
- MySQL corriendo en `localhost:3306`

## Configuración y ejecución

**1. Crear la base de datos en MySQL:**

```sql
CREATE DATABASE vuelos_db;
```

**2. Ajustar las credenciales en `src/main/resources/application.properties` si es necesario:**

```properties
spring.datasource.username=root
spring.datasource.password=mysql
```

**3. Correr la aplicación desde IntelliJ o con Maven:**

```bash
./mvnw spring-boot:run
```

Al iniciar, Hibernate crea las tablas automáticamente y el archivo `data.sql` carga los datos de prueba. No se requiere ningún paso adicional.

## Acceso

- **Frontend:** http://localhost:8080
- **API REST:** http://localhost:8080/api/v1/{entidad}

## Endpoints disponibles

Cada entidad expone los siguientes endpoints:

| Método | URL | Descripción |
|--------|-----|-------------|
| GET | `/api/v1/{entidad}` | Lista todos los registros |
| GET | `/api/v1/{entidad}/page` | Lista paginada |
| GET | `/api/v1/{entidad}/{id}` | Busca por ID |
| POST | `/api/v1/{entidad}` | Crea un nuevo registro |
| PUT | `/api/v1/{entidad}/{id}` | Actualiza un registro |
| DELETE | `/api/v1/{entidad}/{id}` | Elimina un registro |

Entidades disponibles: `ciudades`, `aerolineas`, `aeropuertos`, `aviones`, `asientos`, `pilotos`, `usuarios`, `vuelos`, `tarifas`, `reservas`, `consultas`.

## Estructura del proyecto

```
com.example.vuelos/
├── entities/       Entidades JPA
├── repositories/   Interfaces Spring Data JPA
├── services/       Lógica de negocio
└── controllers/    Endpoints REST
```

Todas las capas heredan de clases base genéricas (`BaseRepository`, `BaseService`, `BaseServiceImpl`, `BaseController`, `BaseControllerImpl`) que proveen el CRUD completo sin código repetido.
