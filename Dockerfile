FROM fabric8/java-jboss-openjdk8-jdk:1.3.1
ENV JAVA_APP_DIR=/deployments
EXPOSE 8080
COPY booster-1.0.0-SNAPSHOT.jar /deployments
ENTRYPOINT ["java","-jar","booster-1.0.0-SNAPSHOT.jar"]
