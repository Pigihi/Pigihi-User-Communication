# User Communication Service

Service for handling all operations related to communicating with users

# Email

## APIs

| Functionality | REST Endpoint | Parameter | Body | Response |
| --- | --- | --- | --- | --- |
| Send Email | **POST** `/sendEmail` |     | JSON String | JSON String |

# Mobile

## APIs

## Configuration

Edit the properties of **application.yml** file

```yaml
# Eureka properties 
eureka:
  client:
    fetch-registry: true
    register-with-eureka: true
    service-url:
      defaultZone: address of the eureka server (Eg: http://localhost:8761/eureka)
  instance:
    hostname: specify the hostname here (Eg: localhost)

# Server properties
server:
  port: port in which the customer service is to run (Eg: 8096)

# Application properties
spring:
  application:
    name: name of the application (Eg: USER-COMMUNICATION-SERVICE)
# Mail properties
  mail:
    host: host address
    password: specify the password here
    port: specify the port here
    properties:
      mail:
        smtp:
          auto: true
          starttls:
            enable: true
    username: username with which the mail is to be sent
```

## Local Deployment
In Linux,

1. Open terminal and run `docker-compose up`
2. The application can be accessed at localhost:8096 (port 8096 is set in docker-compose)
