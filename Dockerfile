FROM openjdk:8
ADD target/spring-boot-docker-1.jar spring-boot-docker-1.jar
EXPOSE 8585
ENTRYPOINT ["java","-jar","spring-boot-docker-1.jar"]
