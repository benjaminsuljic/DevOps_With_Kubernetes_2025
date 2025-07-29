FROM openjdk:17-jdk-slim

WORKDIR /app

COPY src/LogOutput.java .

RUN javac LogOutput.java

CMD ["java", "LogOutput"] 