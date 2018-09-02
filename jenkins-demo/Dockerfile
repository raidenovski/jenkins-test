FROM maven:3.5-jdk-8-onbuild AS builder

FROM anapsix/alpine-java:8u172b11_jdk
COPY --from=builder /usr/src/app/target/*.jar /opt/app.jar

EXPOSE 8080
CMD java -jar $JAVA_OPTS /opt/app.jar

