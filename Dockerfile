FROM openjdk:17
COPY target/spring-with-github-actions-0.0.1-SNAPSHOT.jar spring-github-actions.jar
ENTRYPOINT ["java", "-jar", "spring-github-actions.jar"]