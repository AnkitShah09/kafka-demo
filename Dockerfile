FROM openjdk:17-oracle
ARG JAR_FILE=target/kafka-demo.jar
ADD ${JAR_FILE} /
ENTRYPOINT ["java", "-jar", "kafka-demo.jar"]