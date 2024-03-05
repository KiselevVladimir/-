# Проект
Этот проект является примером RESTful веб-сервиса на Spring Boot. Веб-сервис принимает POST запросы на эндпоинт /dummyEndpoint, парсит JSON тело 
запроса и отвечает новым JSON объектом с данными из запроса.
## Установка
1. Убедитесь, что у вас установлен Java Development Kit (JDK) версии 8 или выше.
2. Склонируйте репозиторий с помощью команд

git clone https://github.com/KiselevVladimir/-/tree/master

## Запуск

1. Соберите проект с помощью команды Maven:

mvn clean install

2. Запустите приложение:

java -jar target/demo-0.0.1-SNAPSHOT.jar


3. Веб-сервис будет доступен по адресу http://localhost:8080.

## Использование

Отправьте POST запрос на http://localhost:8080/dummyEndpoint с JSON телом вида:

```json
{
"message": "Hello"
}
В ответ вы получите JSON объект с данными из вашего запроса:

json

{
  "message": "Received: Hello"
}
