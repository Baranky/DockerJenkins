FROM openjdk:21
ADD target/jenkins-0.0.1-SNAPSHOT.jar demo
ENTRYPOINT ["java","-jar","demo"]