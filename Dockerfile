FROM amazoncorretto:21.0.2

WORKDIR /app/geo-service

COPY target/geo-service-0.0.1-SNAPSHOT.jar geo-service.jar

ENTRYPOINT java $JAVA_OPTS -jar geo-service.jar
