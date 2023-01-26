FROM maven:3.8.4-openjdk-8-slim

WORKDIR ~

ADD ./target/reserve-0.0.1-SNAPSHOT.jar  ./reserve.jar
	
ENTRYPOINT ["java", "-jar"]

CMD ["reserve.jar","--spring.profiles.active=k8s"]

EXPOSE 8072