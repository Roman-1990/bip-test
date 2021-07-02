<a href="https://bip.ru/">
  <img src="https://bip.ru/static/assets/image/logo-bip.svg" alt="Лого bip.ru" title="Bip" align="right" height="60" />
</a>

#
# Сравните цены страховых и оформите полис ОСАГО онлайн на [bip.ru](https://bip.ru/)
## Наша цель — сделать лучший online-сервис по автострахованию ОСАГО и КАСКО.
Большой опыт работы с mobile и web продуктами — наше преимущество. Уже 7 лет мы создаем сервисы для автовладельцев и делаем это хорошо.

##Проводится проверка работоспособности сайта и внутреннего функционала

### Открывается главная страница:
<img src = "https://github.com/Roman-1990/bip-test/blob/master/src/test/resources/img/homepage.png">

### Проверка заголовка страницы:
<img src = "https://github.com/Roman-1990/bip-test/blob/master/src/test/resources/img/Page_title.gif">

### Проверка сервисов:
1) Калькулятор ОСАГО
   
   <img src = "https://github.com/Roman-1990/bip-test/blob/master/src/test/resources/img/test.mp4">
2) Коэффициенты ОСАГО

<img src = "https://github.com/Roman-1990/bip-test/blob/master/src/test/resources/img/test.mp4">
3) Карта штрафов ГИБДД

<img src = "https://github.com/Roman-1990/bip-test/blob/master/src/test/resources/img/map.png">

4) Журналы консоли не должны содержать текст "СЕРЬЕЗНЫЕ"



# USAGE examples

### For run remote tests need fill remote.properties or to pass value:

* browser (default chrome)
* browserVersion (default 89.0)
* browserSize (default 1920x1080)
* browserMobileView (mobile device name, for example iPhone X)
* remoteDriverUrl (url address from selenoid or grid)
* videoStorage (url address where you should get video)
* threads (number of threads)


Run tests with filled remote.properties:
```bash
gradle clean test
```

Run tests with not filled remote.properties:
```bash
gradle clean -DremoteDriverUrl=https://user1:1234@selenoid.autotests.cloud/wd/hub/ -DvideoStorage=https://selenoid.autotests.cloud/video/ -Dthreads=1 test
```

Serve report:
```bash
allure serve build/allure-results
```


For further development there are some example tests in src/test/java/cloud.autotests/tests/demowebshop
* remove @Disabled("...") annotation to run tests
```bash
gradle clean demowebshop
```

:heart: <a target="_blank" href="https://qa.guru">qa.guru</a><br/>
:blue_heart: <a target="_blank" href="https://t.me/qa_automation">t.me/qa_automation</a>


