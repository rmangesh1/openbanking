# Project: Openbanking REST API

Openbanking rest api. Contains 3 modules,
* openbanking-client
* openbanking-domain
* openbanking-service

## Information

GET, PATCH, POST service for customer resource.

### Installing steps
```
1.Checkout the project
2.cd .. to openbanking/openbanking-service
2.mvn clean install
3.mvn spring-boot:run (Or run OpenBankingApplication.java)
 
Access the rest-api at,
http://localhost:9000/customers
 
Rest api authentication,
username : user
password : password
```

### Hosted On-AWS
```
The rest-api is hosted on AWS Elastic beanstalk at,   
http://openbanking.us-east-2.elasticbeanstalk.com/
```

## Author
Mangesh Rananavare