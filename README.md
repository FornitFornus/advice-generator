# advice-generator

Read advice from endpoint


## Run docker container:
Require: java11  
Clone the advice-generator api.  

### Create image: 
 docker build . -t advice-generator

### Run image:
 docker run -p 8080:8080 advice-generator

### Rest endpoint:
localhost:8080/advice

### Html:
localhost:8080/adviceHtml

