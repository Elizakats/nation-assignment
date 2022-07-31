# nation-assignment

This repository contains an assignment for a Fullstack Software Engineer job opening. It consists of a client and a server. 
The project is about nations' populations.

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

Build with Maven v3.8.6 on Java 8.

Server connects to a MySQL Database. In order to launch you need pass the enviroment variables below:
- DB_HOST
- DB_PORT
- DB_NAME
- DB_USERNAME
- DB_PASSWORD

## Client
The client is an Angular application rendering 3 screens.

Build with Node v14.17.5, npm V6.14.14 on Angular 14.1
