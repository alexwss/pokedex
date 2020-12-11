#############
### BUILD ###
#############
FROM maven:3.6.3-jdk-11 AS MAVEN_BUILD
WORKDIR /app
COPY . .
RUN ls
RUN mvn package -DskipTests

##################
### PRODUCTION ###
##################
FROM maslick/minimalka:jdk11
VOLUME /tmp	
ARG JAR_FILE=target/*.jar
ADD ${JAR_FILE} app.jar
RUN ls
EXPOSE 8080
RUN chmod +2 app.jar
CMD ["java", "-Djava.security.egd=file:/dev/./urandom ", "-jar", "/app.jar", "-Dserver.address=0.0.0.0"]