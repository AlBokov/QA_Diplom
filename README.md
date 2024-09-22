# Дипломный проект профессии «Тестировщик ПО»

## Запуск приложения
1. Запустить необходимые базы данных   
Параметры для запуска хранятся в файле `docker-compose.yml`.   
Для запуска необходимо ввести в терминале команду: `docker-compose up`

2. Для подключения БД к СУТ в новой вкладке терминала ввести следующую команду в зависимости от базы данных:

* `java "-Dspring.datasource.url=jdbc:mysql://localhost:3306/mysql" -jar artifacts/aqa-shop.jar` - для базы данных MySQL
* `java -Dspring.datasource-postgresql.url=jdbc:postgresql://localhost:5432/app -jar artifacts/aqa-shop.jar` - для базы данных PostgreSQL

3. Приложение должно запуститься по адресу http://localhost:8080/

## Запуск тестов
В новой вкладке терминала ввести команду в зависимости от запущенной БД в п.2 Запуска:
* `./gradlew clean test -DdbUrl=jdbc:mysql://localhost:3306/mysql` - для MySQL
* `./gradlew clean test -DdbUrl=jdbc:postgresql://localhost:5432/postgres` - для PostgreSQL

## Формирование отчета AllureReport
В новой вкладке терминала или нажав двойной Ctrl ввести команду:

`.\gradlew allureServe` 

# Документация

[План автоматизации тестирования веб-формы сервиса покупки туров интернет-банка](https://github.com/AlBokov/QA_Diplom/blob/main/documents/TestAutomationPlanning.md)

