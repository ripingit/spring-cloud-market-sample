# Spring Cloud Sample



## Config-server

Start the server:

     ./gradlew :config-server:bootRun
     
     
at browser:
     
     http://localhost:8888
     

build docker:
     
     ./gradlew :config-server:buildDocker
     
     
## Discovery-server

Start the server:

     ./gradlew :discovery-server:bootRun
     
     
at browser:
     
     http://localhost:8888
     

build docker:
     
     ./gradlew :discovery-server:buildDocker     
     
     
참고
     
     https://github.com/spring-cloud-samples/configserver
     http://callistaenterprise.se/blogg/teknik/2015/04/10/building-microservices-with-spring-cloud-and-netflix-oss-part-1/
     http://callistaenterprise.se/blogg/teknik/2015/05/20/blog-series-building-microservices/
     https://spring.io/guides/gs/spring-boot-docker/