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
 <a href="#description">Description</a> •
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
<br>
</h4>

## Description:

We have 6 Docker containers in this project, they are:
- MySQL
- MongoDB
- MongoExpress
- Adminer
- MvnBuilder
- Api

To authenticate the API we'll use JWT Auth, we'll get the token via the login route. 
The users information are stored in a MySQL Docker container, and the beer information in a different MongoDB Docker container. 
To interact with the databases we'll have another two containers: Adminer and Mongo-Express.

There is a MvnBuilder container that uses a dependency cache so that the application does not take long to start. 
After that, our built application is sent to the main container that runs the API on port 5000.
Because of this way of building, your local Java version isn't relevant for this project, you may not even have Java installed.


## Features:.
### Tools:
- [x] Login to get the Token.
- [x] Validate login/password.
- [ ] Add Kubernetes to the project.
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
- [Docker](https://docs.docker.com/desktop/)
- [Docker Compose](https://docs.docker.com/compose/)
	
It is also useful to have an API Tool like [Postman](https://www.postman.com/downloads/) to interact with the API.

## How-to-run

```bash
# Clone this repo
$ git clone https://github.com/jvictore/api-beers.git

# Enter the cloned project folder 
$ cd api-beers

# That's the script you run to initialize everything, is just that simple.
$ bash run_docker.sh
```
The Spring REST API will initialize on port 5000. Communicate with the application by <http://localhost:5000/>

The API requests format can be viewed in postman after import the collection located in: 
	
- api-beers/add-ons/api-beers.postman_collection.json

<b>If you choose to use postman</b>, you just have to add a new user and login using that new username/password, the login route will generate a token to authenticate (after successfully logging in, postman will automatically inherit the token to all the routes).


<b>If you choose another method to interact with the API</b>, you'll need the auth user/password to get a JWT Token, so let's add a new user sending a POST to the route '/user/add' with the following body:
```json
{
    "login": "SOMELOGIN",
    "password": "SOMEPASSWORD"
}
```

Now you have to send a POST to the route '/login' with the same body of the '/user/add' route explained above. This request will return a token to authenticate, this token is of the type 'Bearer token', and will be used in all routes.

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
