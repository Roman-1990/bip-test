<a href="https://bip.ru/">
  <img src="https://bip.ru/static/assets/image/logo-bip.svg" alt="Лого bip.ru" title="Bip" align="right" height="60" />
</a>
### Для разработки автотестов использовались технологии и инструменты:

| Java | Gradle | Junit5 | Selenide | IntelliJ IDEA |
|:------:|:----:|:----:|:------:|:------:|:--------:|
| <img src="https://github.com/Roman-1990/bip-test/blob/master/src/test/resources/img/logo/Java.png" width="40" height="40"> | <img src="https://github.com/Roman-1990/bip-test/blob/master/src/test/resources/img/logo/Gradle.png" width="40" height="40"> | <img src="https://github.com/Roman-1990/bip-test/blob/master/src/test/resources/img/logo/Junit5.png" width="40" height="40"> | <img src="https://github.com/Roman-1990/bip-test/blob/master/src/test/resources/img/logo/Selenide.png" width="40" height="40"> | <img src="https://github.com/Roman-1990/bip-test/blob/master/src/test/resources/img/logo/Intelij_IDEA.png" width="40" height="40"> |

| GitHub | Jenkins | Selenoid | Allure Report | Allure TestOps | Telegram |
|:--------:|:-------------:|:---------:|:-------:|:--------:|
| <img src="https://github.com/Roman-1990/bip-test/blob/master/src/test/resources/img/logo/Github.png" width="40" height="40"> | <img src="https://github.com/Roman-1990/bip-test/blob/master/src/test/resources/img/logo/Jenkins.png" width="40" height="40"> | <img src="https://github.com/Roman-1990/bip-test/blob/master/src/test/resources/img/logo/Selenoid.png" width="40" height="40"> | <img src="https://github.com/Roman-1990/bip-test/blob/master/src/test/resources/img/logo/Allure_Report.png" width="40" height="40"> | <img src="https://github.com/Roman-1990/bip-test/blob/master/src/test/resources/img/logo/AllureTestOps.png" width="40" height="40"> | <img src="https://github.com/Roman-1990/bip-test/blob/master/src/test/resources/img/logo/Telegram.png" width="40" height="40"> |

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
