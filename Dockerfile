FROM amazoncorretto:17.0.6
ARG JAR_FILE=build/libs/ecr-demo-*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]