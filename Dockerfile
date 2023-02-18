FROM openjdk:17-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 9003
ENTRYPOINT ["java","-jar","/app.jar"]