FROM openjdk:8
EXPOSE 8080
ADD target\java-eight-concepts.jar java-eight-concepts.jar
ENTRYPOINT ["java","-jar","/java-eight-concepts.jar"]