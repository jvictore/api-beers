# API Beers
<a href="https://www.oracle.com/br/java/technologies/javase/javase8-archive-downloads.html">
<img src="https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white">
</a>

<a href="https://spring.io/projects/spring-boot">
<img src="https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white">
</a>

<a href="https://hub.docker.com/_/mysql">
<img src="https://img.shields.io/badge/mysql-%2300f.svg?style=for-the-badge&logo=mysql&logoColor=white">
</a>

<a href="https://hub.docker.com/_/mongo">
<img src="https://img.shields.io/badge/MongoDB-%234ea94b.svg?style=for-the-badge&logo=mongodb&logoColor=white">
</a>

<a href="https://docs.docker.com/desktop/">
<img src="https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white">
</a>

## Spring REST API to register all beers that have already been tried.

<div align="left">
 <a href="#objective">Objective</a> •
 <a href="#features">Features</a> • 
 <a href="#pre-requisites">Pre-Requisites</a> • 
 <a href="#how-to-run">How to run</a> • 
 <a href="#how-to-terminate">How to terminate</a> •
 <a href="#access-the-databases">Access the Databases</a> •

 <h4> 
	🚧  Project in development...  🚧
</h4>
	
## Objective:
<h4> 
	The objective of this project is to develop a modern API based on microservices. The project is an API which you can interact to store, list, update and remove the beers you have already been tried.
<br><br>
	
  To authenticate the API we'll use JWT Auth, we'll get the token via the login route. The users information are stored in a MySQL Docker Container, and the beer information in a different MongoDB Docker Container. To interact with the databases we'll have another two containers: Mongo-Express and Adminer.
</h4>

## Features:
### Tools:
- [x] Login to get the Token.
- [x] Validate login/password.
### Beers:
- [x] Get all beers.
- [x] Get one specific beer by id.
- [x] Add new beer.
- [x] Update a beer by id.
- [x] Remove a beer by id.
### Users:
- [x] Get all users.
- [x] Get one specific user by login.
- [x] Add new user.
- [x] Remove user.

## Pre-requisites:

Before starting you need to have installed the following tools:<br>
- [Git](https://git-scm.com) (Optional, you may want to manually download the project)
- [Java 8](https://www.oracle.com/br/java/technologies/javase/javase8-archive-downloads.html) ( :warning: Be sure you are using the correct version :warning: )
- [Docker](https://docs.docker.com/desktop/)
- [Docker Compose](https://docs.docker.com/compose/)
- [Maven](https://maven.apache.org/download.cgi). 
	
It is algo useful to have an API Tool like [Postman](https://www.postman.com/downloads/) to interact with the API.

## How-to-run

```bash
# Clone this repo
$ git clone https://github.com/jvictore/api-beers.git

# Enter the cloned project folder 
$ cd api-beers

$ bash run_docker.sh
```
The Spring REST API will initialize on port 8080. Communicate with the application by <http://localhost:8080/>

You'll need the auth user/password to get a JWT Token, so let's add a new user sending a POST to the route '/user/add' with the following body:
```json
{
    "login": "SOMELOGIN",
    "password": "SOMEPASSWORD"
}
```	
The API requests format can be viewed in postman after import the collection located in: 
	
- api-beers/add-ons/api-beers.postman_collection.json

## Access-the-databases
To facilitate the visualization of the databases mentinoned above, we can access:
- Mongo-Express	: http://localhost:8081/
- Adminer	: http://localhost:9090/
	
	
## How-to-terminate
```bash
# Once you have use the application you have to terminate it
# Use the Docker Compose to do it
$ docker-compose down
```
	
<div>
