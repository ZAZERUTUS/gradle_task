# 2 задание по курсам по java backend разработке
## Gradle 

<details><summary>Задание</summary>

### Task
- Установить Gradle
- Проект должен быть совместим с java 17
- Создать файл.jar, например, «utils-1.3.5.jar»
-Манифест файл должен содержать имя и версию вашего .jar файла 
-В вашем .jar файле должен быть class StringUtils с методом boolean isPositiveNumber(String str)
-Написать один unit test для проверки этого метода (использовать JUnit 5).
-Заполнить и отправить форму


### Дополнительно:
- Сделать gradle плагин, который также опубликовать и подключить к проекту, например плагин по формированию отчёта
- Создать мульти-модульный проект с двумя модулями: core, api
- В модуле core должен быть class Utils с методом boolean isAllPositiveNumbers(String… str)
- Использовать utils-1.3.5.jar сделанный на предыдущих этапах, для возможности переиспользовать метод boolean isPositiveNumber(String str) в модуле core
- В модуле api должен быть class App с методом main.
- Из модуля api в методе main вызвать Utils.isAllPositiveNumbers("12", "79")
- Написать один unit test для проверки этого метода boolean isAllPositiveNumbers(String… str)(использовать JUnit 5).

</details>

### Описание реализации

В проекте реализовано 2 подмодуля core (core core_jar) для различной реализации зависимостей. 
В первом случае импортится проект а во втором копирется таской jar файл для дальнейшего его использования в проекте.
В маин классе происходит запуск непосредственно 2 вариантов.
<br>
Тесты реализованы в каждом пекете (Частично был копипаст так как не было указано расположение тестов)

### Запуск

#### Локальный

Для запуска проекта необходимо выполнить комманду ``` gradle run ``` 


#### В контейнере

В корне проекта находится dockerfile со всеми зависимостями. Для его запуска необходимо пробросить директорию 

Windows: ``` docker run --rm -v cd:/tests -it test bash ``` 
<br>
Linux: ``` docker run --rm -v $PWD:/tests -it testb bash ``` 
<br>
После выполнить комманду из локального запуска в открывшимся терминале контейнера