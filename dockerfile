FROM openjdk:21-jdk-alpine

WORKDIR /customer

COPY build/libs/customer-0.0.1-SNAPSHOT.jar /customer/customer-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "/customer/customer-0.0.1-SNAPSHOT.jar"]

EXPOSE 8080
