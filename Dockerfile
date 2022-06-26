FROM openjdk:8
EXPOSE 8080
ADD target\JavaEightConcepts.jar JavaEightConcepts.jar
ENTRYPOINT ["java","-jar","/JavaEightConcepts.jar"]