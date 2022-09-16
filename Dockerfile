FROM openjdk:latest
LABEL maintainer="javaguides.net"
EXPOSE 8088
ADD UserRegistrationModule1-0.0.1-SNAPSHOT.jar new-registration-image.jar
ENTRYPOINT ["java", "-jar", "new-registration-image.jar"]
