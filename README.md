# Spring Cloud Market Sample

[![Build Status](https://travis-ci.org/utsman/spring-cloud-market-sample.svg?branch=master)](https://travis-ci.org/utsman/spring-cloud-market-sample)
[![codecov](https://codecov.io/gh/utsman/spring-cloud-market-sample/branch/master/graph/badge.svg)](https://codecov.io/gh/utsman/spring-cloud-market-sample)

## How to run

    $ docker-compose up
    
#### endpoints
    
- http://localhost:8888/statistics-service/default - Config Server
- http://localhost:8761 - Eureka Dashboard
- http://localhost:9000/bestseller - Demo Api
- http://localhost:8765/statistics/bestseller - Zuul Route    
- http://localhost:9999/hystrix - Hystrix Dashboard  
    
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