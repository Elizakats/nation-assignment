# nation-assignment

This repository contains an assignment for a Fullstack Software Engineer job opening. It consists of a client and a server. 

The project is about nations' populations. The assignment requirements can be found in [assignment.pdf](https://github.com/Elizakats/nation-assignment/blob/main/assignment.pdf).

Note that the third screen has not be created.

## Repository structure
```
.
├── client                  # Client
├── server                  # Server
├── LICENSE
└── README.md
```
## Server
The server provides a REST API for countries and relevant statistics.

Build with Maven v3.8.6 on Java 8 with Spring Framework

Server connects to a MySQL Database. In order to launch you need pass the enviroment variables below:
- DB_HOST
- DB_PORT
- DB_NAME
- DB_USERNAME
- DB_PASSWORD

You may initialize your database with [nation.sql](https://github.com/Elizakats/nation-assignment/blob/main/server/docs/nation.sql)

## Client
The client is an Angular/Typescript application rendering 3 screens. 

Build with Node v14.17.5, npm V6.14.14 on Angular 14.1

## Screenshots
![image](https://user-images.githubusercontent.com/61798933/182027542-f7bf6aa5-238f-4a3f-a134-cc6587272c0c.png)
![image](https://user-images.githubusercontent.com/61798933/182027557-ff87be2d-d4b5-4568-bf0e-e068d0d5d618.png)
![image](https://user-images.githubusercontent.com/61798933/182027561-47254425-9dab-471e-9bef-cbf93423f9a6.png)
![image](https://user-images.githubusercontent.com/61798933/182027577-a93e93d1-f0c5-4dc8-a1c8-7437f3d4409d.png)





