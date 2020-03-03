FROM adoptopenjdk/openjdk13

ARG JAR_FILE=build/libs/demo-rest-api-0.0.1-SNAPSHOT.jar
ARG PROPS_FOLDER=build/libs/resources

WORKDIR /opt/app

COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","app.jar"]
