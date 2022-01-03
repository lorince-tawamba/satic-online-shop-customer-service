# For Java 8, try this
FROM openjdk:8-jdk-alpine

# Add maintainer info
LABEL maintainer="TAWAMBA KOUAKAM Lorince <lorince.tawamba@gmail.com>"

# Refer to Maven build -> finalName
ARG JAR_FILE=target/*.jar

# Changed the working directory to /opt/app
WORKDIR /opt/app

# Add a volume pointing /tmp
VOLUME /tmp

# Expose some tcp/udp ports
EXPOSE 8081

# Copy target/*.jar to /opt/app/app.jar
COPY ${JAR_FILE} app.jar

# java -jar /opt/app/app.jar
ENTRYPOINT ["java","-jar","app.jar"]


