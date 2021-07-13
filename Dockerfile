FROM adoptopenjdk/openjdk11:alpine-jre
VOLUME /app
ADD target/stocktrades-1.0.jar stocktrades-1.0.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "stocktrades-1.0.jar"]
