FROM openjdk:8-jre-slim

WORKDIR /usr/share/suman

ADD /target/container-test-tests.jar container-test.jar
ADD  /target/libs libs

ADD pom.xml pom.xml
ENV BROWSER = chrome
ENV POMM  = cucumberextentreport
ENV SELENIUM_HUB = http://192.168.33.10:4444

ENTRYPOINT java -cp container-test.jar:libs/* -DseleniumHubHost=$SELENIUM_HUB -Dbrowser=$BROWSER CucumberOptions.TestRunner  /usr/share/suman/$POMM
