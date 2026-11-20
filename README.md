# Слой DAO с Hibernate

Приложение ищет пользователей по городу через `EntityManager`.

Запустите PostgreSQL командой `docker compose up -d`, затем приложение командой `mvn spring-boot:run`.

Пример запроса: `GET http://localhost:8080/persons/by-city?city=Moscow`
