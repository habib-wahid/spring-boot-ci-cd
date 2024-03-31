FROM openjdk:17

WORKDIR .

COPY target/spring-with-github-actions-0.0.1-SNAPSHOT.jar spring-github-actions.jar

EXPOSE 8080

ENTRYPOINT["java", "-jar", "spring-github-actions.jar"]