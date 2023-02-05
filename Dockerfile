FROM amazoncorretto:17.0.6
ARG JAR_FILE=:
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]