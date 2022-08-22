FROM gradle:7.5-jdk11 AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build --no-daemon

FROM openjdk:11

EXPOSE 8080

RUN mkdir /advice-generator

COPY --from=build /home/gradle/src/build/libs/*.jar /advice-generator/

ENTRYPOINT ["java", "-jar","/advice-generator/advice-generator-0.0.1-SNAPSHOT.jar"]
