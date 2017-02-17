# Spring Cloud Market Sample

## How to run

    $ docker-compose up
    
#### endpoints
    
- http://localhost:8888/statistics-service/docker - Config Server
- http://localhost:8761 - Eureka Dashboard
- http://localhost:9000/statistics/bestseller - Demo Api    
    
#### Rebuild and create Image in all sub-projects
    
    $ ./gradlew buildDocker -Platest
    
#### Run individual sub-project

Start the server:

     ./gradlew :${sub-project}:bootRun
     

Build docker:
     
     ./gradlew :${sub-project}:buildDocker
     
     
Push image:
     
     ./gradlew :${sub-project}:buildDocker -Ppush
     

Run image: 

     docker run -p ${port}:${port} -d utsman/spring-cloud-market-sample-${sub-project} 