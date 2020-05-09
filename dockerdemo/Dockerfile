FROM java:8-jdk-alpine
WORKDIR /home
ADD ./dockerdemo-0.0.1-SNAPSHOT.jar dockerdemo.jar
EXPOSE 8081
VOLUME ["/home"]
ENTRYPOINT ["java","-jar","dockerdemo.jar",">","dockerdemo.log","&"]