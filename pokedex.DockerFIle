#############
### BUILD ###
#############
FROM maven:3.5.2-jdk-8-alpine AS MAVEN_BUILD
WORKDIR /app
COPY . .
RUN ls
RUN mvn package -DskipTests

##################
### PRODUCTION ###
##################
FROM openjdk:8-jdk-alpine
VOLUME /tmp	
ARG JAR_FILE=target/*.jar
ADD ${JAR_FILE} app.jar
CMD ["java", "-Djava.security.egd=file:/dev/./urandom" , "-jar", "/app.jar", "-Dserver.address=0.0.0.0" ]