FROM openjdk:17-ea-11-jdk-slim
COPY build/libs/gateway-1.0.jar GatewayService.jar
ENTRYPOINT ["java","-jar","GatewayService.jar"]