<a href="https://bip.ru/">
  <img src="https://bip.ru/static/assets/image/logo-bip.svg" alt="Лого bip.ru" title="Bip" align="right" height="60" />
</a>

___

### Для разработки автотестов использовались технологии и инструменты:

| IntelliJ IDEA | Java | Gradle | Junit5 | Selenide |
|:------:|:----:|:----:|:------:|:------:|
| <img src="https://github.com/Roman-1990/bip-test/blob/master/img/logo/Intelij_IDEA.png" width="40" height="40"> | <img src="https://github.com/Roman-1990/bip-test/blob/master/img/logo/Java.png" width="40" height="40"> | <img src="https://github.com/Roman-1990/bip-test/blob/master/img/logo/Gradle.png" width="40" height="40"> | <img src="https://github.com/Roman-1990/bip-test/blob/master/img/logo/JUnit5.png" width="40" height="40"> | <img src="https://github.com/Roman-1990/bip-test/blob/master/img/logo/Selenide.png" width="40" height="40"> |

| GitHub | Jenkins | Selenoid | Allure Report | Allure TestOps | Telegram | Jira |
|:------:|:----:|:----:|:------:|:------:|:--------:|:------:|
| <img src="https://github.com/Roman-1990/bip-test/blob/master/img/logo/Github.png" width="40" height="40"> | <img src="https://github.com/Roman-1990/bip-test/blob/master/img/logo/Jenkins.png" width="40" height="40"> | <img src="https://github.com/Roman-1990/bip-test/blob/master/img/logo/Selenoid.png" width="40" height="40"> | <img src="https://github.com/Roman-1990/bip-test/blob/master/img/logo/Allure_Report.png" width="40" height="40"> | <img src="https://github.com/Roman-1990/bip-test/blob/master/img/logo/AllureTestOps.png" width="40" height="40"> | <img src="https://github.com/Roman-1990/bip-test/blob/master/img/logo/Telegram.png" width="40" height="40"> | <img src="https://github.com/Roman-1990/bip-test/blob/master/img/logo/Jira.png" width="40" height="40"> |

___

#
#
# Сравните цены страховых и оформите полис ОСАГО онлайн на [bip.ru](https://bip.ru/)
## Наша цель — сделать лучший online-сервис по автострахованию ОСАГО и КАСКО.
Большой опыт работы с mobile и web продуктами — наше преимущество. Уже 7 лет мы создаем сервисы для автовладельцев и делаем это хорошо.
_____________________________________________________________________________________


## Проводится проверка работоспособности сайта и внутреннего функционала
## UI Тесты
* Калькулятор ОСАГО
* Коэффициенты ОСАГО
* Карта штрафов ГИБДД
* Журналы консоли не должны содержать текст "SEVERE"

### Открывается главная страница:
<img src = "https://github.com/Roman-1990/bip-test/blob/master/img/homepage.png">

### Проверка заголовка страницы:
<img src = "https://github.com/Roman-1990/bip-test/blob/master/img/Page_title.gif">

### Проверка сервисов:
1) Калькулятор ОСАГО
   
   <img src = "https://github.com/Roman-1990/bip-test/blob/master/img/test.gif">
2) Коэффициенты ОСАГО

<img src = "https://github.com/Roman-1990/bip-test/blob/master/img/Coefficients.png">
3) Карта штрафов ГИБДД

<img src = "https://github.com/Roman-1990/bip-test/blob/master/img/map.png">

4) Журналы консоли не должны содержать текст "SEVERE"

## API Тесты
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
  
  <img src = "https://github.com/Roman-1990/bip-test/blob/master/img/optionsJenkins.png">

Запуск тестов с заполненными local.properties:
```bash
gradle clean test
```
<img src = "https://github.com/Roman-1990/bip-test/blob/master/img/terminal.gif">

Запускайте тесты с незаполненными локальными свойствами:
```bash
gradle clean -DremoteDriverUrl=https://user1:1234@selenoid.autotests.cloud/wd/hub/ -DvideoStorage=https://selenoid.autotests.cloud/video/ -Dthreads=1 test
```


## :robot:Отправка уведомления о прохождении тестов в <img src = "https://starchenkov.pro/qa-guru/img/skills/Telegram.svg" width = "30">

<img src = "https://github.com/Roman-1990/bip-test/blob/master/img/telegrambot.png">

Подавайте отчет allure report:
```bash
allure serve build/allure-results
```

## Анализируй результаты через Allure Reports: <a href ="https://jenkins.autotests.cloud/job/bip-test/7/allure/#suites/389c19e545ecb9bf8310362676e286fe/3420db8c7e063d62/">

1) Просмотр последнего скриншота; :eyes: :framed_picture:
2) Просмотр источника страницы; :eyes:
3) Просмотр лога в консоли; :eyes:
4) Просмотр видео прохождения теста; :eyes: :film_strip:
   </a>
<img src = "https://github.com/Roman-1990/bip-test/blob/master/img/allure.png">


## Типы тестов (ручные, автоматизированные) в Allure TestOps

<img src = "https://github.com/Roman-1990/bip-test/blob/master/img/AllureTestOps.png">



## Визуализация пройденных тестов в Allure TestOps
<img src = "https://github.com/Roman-1990/bip-test/blob/master/img/grafana.png">

## Визуализация тест кейсов в Allure TestOps
<img src = "https://github.com/Roman-1990/bip-test/blob/master/img/test_cases.PNG">

## Разнообразие дашбордов для визуализации самого необходимого

* Показатель прохождения тестов 
<img src = "https://github.com/Roman-1990/bip-test/blob/master/img/automation.PNG"> 
* Показатель прохождения сессий
<img src = "https://github.com/Roman-1990/bip-test/blob/master/img/stages.PNG">
* Показатель авторов тестов
<img src = "https://github.com/Roman-1990/bip-test/blob/master/img/users test.PNG">

## Интеграция с Jira
Отображение тест-кейсов
<img src = "https://github.com/Roman-1990/bip-test/blob/master/img/Jira.PNG">
