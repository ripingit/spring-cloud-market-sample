# Spring Cloud Sample


## Start




## Config-server

Start the server:

     ./gradlew :config-server:bootRun
     
     
At browser:
     
     http://localhost:8888
     

Build docker:
     
     ./gradlew :config-server:buildDocker
     
     
Push Image:
     
     ./gradlew :config-server:buildDocker -Ppush
     
     
## Discovery-server


Start the server:

     ./gradlew :discovery-server:bootRun
     
     
At browser:
     
     http://localhost:8888
     

Build docker:
     
     ./gradlew :discovery-server:buildDocker
     
     
Push Image:
     
     ./gradlew :discovery-server:buildDocker -Ppush     
     