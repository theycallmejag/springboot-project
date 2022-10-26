FROM openjdk:11-slim

RUN mkdir /opt/app

WORKDIR /opt/app

ADD ./example.smallest-0.0.3-SNAPSHOT.jar /opt/app/example.jar

EXPOSE 8080

RUN ["chmod", "+x", "/opt/app/example.jar"]

ENTRYPOINT ["java" , "-jar" , "example.jar"]
