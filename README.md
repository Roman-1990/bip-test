<a href="https://bip.ru/">
  <img src="https://bip.ru/static/assets/image/logo-bip.svg" alt="Лого bip.ru" title="Bip" align="right" height="60" />
</a>
### Для разработки автотестов использовались технологии и инструменты:
<p align="left">
<img height="40" width="40" src="images/GitHub.svg" alt="git">
<img height="40" width="40" src="https://raw.githubusercontent.com/r2ff/r2ff/1cd5ac320c63eada404ddab3cfe71b4fbb5e73b0/svg/java-logo.svg" alt="java">
<img height="40" width="40" src="https://raw.githubusercontent.com/r2ff/r2ff/1cd5ac320c63eada404ddab3cfe71b4fbb5e73b0/svg/gradle-logo.svg" alt="gradle">
<img height="40" width="40" src="https://raw.githubusercontent.com/r2ff/r2ff/1cd5ac320c63eada404ddab3cfe71b4fbb5e73b0/svg/junit5-logo.svg" alt="junit5">
<img height="40" width="40" src="https://raw.githubusercontent.com/r2ff/r2ff/3294e25e72c2949bd7027cd3d297b619dae42719/svg/selenide-logo.svg" alt="selenide">
<img height="40" width="40" src="https://user-images.githubusercontent.com/84721020/131733118-67426995-f58b-4f2d-89ce-ab59f0c4a9bc.png" alt="rest-assured">
<img height="40" width="40" src="https://raw.githubusercontent.com/r2ff/r2ff/1cd5ac320c63eada404ddab3cfe71b4fbb5e73b0/svg/jenkins-logo.svg" alt="jenkins">
<img height="40" width="40" src="https://raw.githubusercontent.com/r2ff/r2ff/88f137e2bed8e2b9aa3048dd41d68c6adb4a0522/svg/selenoid-logo.svg" alt="selenoid">
<img height="40" width="40" src="https://raw.githubusercontent.com/r2ff/r2ff/54b7b71e5ab15cea6bc453babf179c93c8b136b2/svg/allure-Report-logo.svg" alt="allure">
<img height="40" width="40" src="https://raw.githubusercontent.com/r2ff/r2ff/b40f0e55529c51f4234b8c12c6b769ae6d4b9f9c/svg/allure-ee-logo.svg" alt="allure-testops">
</p>
#
#
# Сравните цены страховых и оформите полис ОСАГО онлайн на [bip.ru](https://bip.ru/)
## Наша цель — сделать лучший online-сервис по автострахованию ОСАГО и КАСКО.
Большой опыт работы с mobile и web продуктами — наше преимущество. Уже 7 лет мы создаем сервисы для автовладельцев и делаем это хорошо.
_____________________________________________________________________________________


## Проводится проверка работоспособности сайта и внутреннего функционала
## UI
### Открывается главная страница:
<img src = "https://github.com/Roman-1990/bip-test/blob/master/src/test/resources/img/homepage.png">

### Проверка заголовка страницы:
<img src = "https://github.com/Roman-1990/bip-test/blob/master/src/test/resources/img/Page_title.gif">

### Проверка сервисов:
1) Калькулятор ОСАГО
   
   <img src = "https://github.com/Roman-1990/bip-test/blob/master/src/test/resources/img/test.gif">
2) Коэффициенты ОСАГО

<img src = "https://github.com/Roman-1990/bip-test/blob/master/src/test/resources/img/Coefficients.png">
3) Карта штрафов ГИБДД

<img src = "https://github.com/Roman-1990/bip-test/blob/master/src/test/resources/img/map.png">

4) Журналы консоли не должны содержать текст "SEVERE"

## API
1) Доступность сервиса "Калькулятор ОСАГО"

## Используемые параметры (по умолчанию) для запуска через Jenkins

### Для запуска удаленных тестов необходимо заполнить remote.properties или передать значение:

* browser (default chrome)
* browserVersion (default 91.0)
* browserSize (default 1920x1080)
* browserMobileView (mobile device name, for example iPhone X)
* remoteDriverUrl (selenoid.autotests.cloud)
* videoStorage (url address where you should get video)
* threads (number of threads)
  
  <img src = "https://github.com/Roman-1990/bip-test/blob/master/src/test/resources/img/optionsJenkins.png">

Запуск тестов с заполненными local.properties:
```bash
gradle clean test
```
<img src = "https://github.com/Roman-1990/bip-test/blob/master/src/test/resources/img/terminal.gif">

Запускайте тесты с незаполненными локальными свойствами:
```bash
gradle clean -DremoteDriverUrl=https://user1:1234@selenoid.autotests.cloud/wd/hub/ -DvideoStorage=https://selenoid.autotests.cloud/video/ -Dthreads=1 test
```


## :robot:Отправка оповещения о прохождении теста в <img src = "https://starchenkov.pro/qa-guru/img/skills/Telegram.svg" width = "30">

<img src = "https://github.com/Roman-1990/bip-test/blob/master/src/test/resources/img/telegrambot.png">

Подавайте отчет allure report:
```bash
allure serve build/allure-results
```

## Анализ результатов через Allure Reports: <a href ="https://jenkins.autotests.cloud/job/bip-test/7/allure/#suites/389c19e545ecb9bf8310362676e286fe/3420db8c7e063d62/">

1) Просмотр последнего скриншота; :eyes: :framed_picture:
2) Просмотр источника страницы; :eyes:
3) Просмотр лога в консоли; :eyes:
4) Просмотр видео прохождения теста; :eyes: :film_strip:
   </a>
<img src = "https://github.com/Roman-1990/bip-test/blob/master/src/test/resources/img/allure.png">


## Разнообразие тестов (ручной, автоматизированный) в Allure TestOps

<img src = "https://github.com/Roman-1990/bip-test/blob/master/src/test/resources/img/AllureTestOps.png">



## Визуализация итогов пройденных тестов в Allure TestOps
<img src = "https://github.com/Roman-1990/bip-test/blob/master/src/test/resources/img/grafana.PNG">

## Визуализация тест кейсов в Allure TestOps
<img src = "https://github.com/Roman-1990/bip-test/blob/master/src/test/resources/img/test cases.PNG">

## Разнообразие дашбордов

* Показатель прохождения тестов 
<img src = "https://github.com/Roman-1990/bip-test/blob/master/src/test/resources/img/automation.PNG"> 
* Показатель прохождения сессий
<img src = "https://github.com/Roman-1990/bip-test/blob/master/src/test/resources/img/stages.PNG">
* Показатель авторов тестов
<img src = "https://github.com/Roman-1990/bip-test/blob/master/src/test/resources/img/users test.PNG">

## Интеграция с Jira
Отображение тест-кейсов
<img src = "https://github.com/Roman-1990/bip-test/blob/master/src/test/resources/img/Jira.PNG">
