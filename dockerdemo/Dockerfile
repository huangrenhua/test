FROM java:8-jdk-alpine
WORKDIR /home
ADD ./dockerdemo.jar dockerdemo.jar
EXPOSE 8081
VOLUME ["/home"]
ENTRYPOINT ["java","-jar","dockerdemo.jar",">","dockerdemo.log","&"]