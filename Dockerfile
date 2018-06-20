FROM centos:7
MAINTAINER maruhachi
RUN yum install -y java-1.8.0-openjdk-headless java-1.8.0-openjdk-devel java-1.8.0-openjdk java-1.8.0-openjdk-debug
ENV JAVA_HOME=/usr/lib/jvm/java-1.8.0-openjdk
ADD target/app.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.jar"]
