FROM openjdk:18
ADD target/SpringDocker.jar SpringDocker.jar
ENTRYPOINT ["java","-jar", "/SpringDocker.jar"]