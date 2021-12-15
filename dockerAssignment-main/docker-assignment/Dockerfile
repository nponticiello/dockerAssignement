# define base docker image
FROM openjdk:11
ADD target/springboot-docker-demo-0.0.1-SNAPSHOT.jar springboot-docker-demo.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","springboot-docker-demo.jar", "--server.port=8085"]