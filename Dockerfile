FROM openjdk:8
EXPOSE 8080
ADD target/springboot-mongo-atlas-validation.jar springboot-mongo-atlas-validation.jar
ENTRYPOINT ["java","-jar","/springboot-mongo-atlas-validation.jar"]