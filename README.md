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
    hostname: specify the hostname of service here (Eg: localhost)

# Server properties
server:
  port: port in which the user communication service is to be run (Eg: 8096)

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

Service Registry should be started for successful execution of all queries.

In application.yml file, change the properties

| Property | Value | Example |
| --- | --- | --- |
| eureka_hostname | hostname of eureka server | service-registry |
| service_hostname | hostname of service (try to use the same as in docker-compose) | user-communication-service |

### Using Docker

Create docker bridge network: `docker network create -d bridge pigihi-network`

docker-compose can be used to run the application and the corresponding mongodb instance

1.  Go to project folder
2.  Open terminal and run `docker-compose up`
3.  The application can be accessed at localhost:8096 (port 8096 is set in docker-compose)

To run only the application

1.  Go to project folder
2.  Open terminal and run `docker build .`
3.  Run `docker run -p 8096:8096 docker_image_name`
4.  The application can be accessed at localhost:8096

### Using Gradle

MongoDB should be run seperately and the configurations should be updated in application.yml

1.  Go to project folder
2.  Open terminal and run `./gradlew build`
3.  Run `./gradlew bootRun`

* * *
