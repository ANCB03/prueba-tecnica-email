FROM openjdk:17-slim


WORKDIR /app

COPY target/email-0.0.1-SNAPSHOT.jar /app/email.jar

EXPOSE 3000

CMD ["java", "-jar", "/app/email.jar"]