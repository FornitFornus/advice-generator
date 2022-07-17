FROM openjdk:11
ADD build/libs/advice-generator-0.0.1-SNAPSHOT.jar .
EXPOSE 8080
CMD java -jar advice-generator-0.0.1-SNAPSHOT.jar