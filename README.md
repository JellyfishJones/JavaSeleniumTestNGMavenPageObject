# JavaSeleniumTestNGMavenPageObject
Page object model ui automation framework: Umbuntu OS, Eclipse, Java, Selenium, TestNG, Maven, Page Object Model

Setup + Configuration + Build and Run Options:
1) Install Eclipse IDE on Ubuntu OS
2) Download 64 bit Selenium web drivers: Chromium and Geckodriver
3) Create new Maven Project in Eclipse IDE
4) In the Setup Path update location of web driver on your local sandbox
5) On the solution > right click > select 'Run Maven Clean' 
6) Click 'Project' drop down menu on Eclipse IDE select 'Project Clean'
7) On the solution > right click > select 'Run Maven Test'

***Make sure to update your web driver path on your local sandbox
***Example: Ubuntu OS

System.setProperty("webdriver.gecko.driver", "/home/orblivion/Desktop/Automation/Drivers//geckodriver");
