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

 <h4> 
	🚧  Project in development...  🚧
</h4>
	
## Objective:
<h4> 
	The objective of this project is to develop a modern API based on microservices. The project is an API which you can interact to store, list, update and remove the beers you have already been tried.

  To authenticate the API we'll use JWT Auth, we'll get the token via the login route. The users information are stored in a MySQL Docker Container, and the beer information in a different MongoDB Docker Container.
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

# IGNORE ALL THE BELOW INFORMATION, ALL OF IT IS ABOUT MY ANOTHER PROJECT THAT I'VE COPIED THE README
## Pre-requisites:

Before starting you need to have installed the following tools:
[Git](https://git-scm.com), [Python 3](https://www.python.org/downloads/), [Docker](https://docs.docker.com/desktop/), [Docker Compose](https://docs.docker.com/compose/). It is algo useful to have an API Tool like [Postman](https://www.postman.com/downloads/) to interact with the API.

## How-to-run

```bash
# Clone this repo
$ git clone https://github.com/jvictore/api-my-books.git

# Enter the cloned project folder 
$ cd api-my-books

# Just in case you already have a compose running, drop it
$ docker-compose down

# Build the project
$ docker-compose build --no-cache

# Initialize the application
$ docker-compose up -d
```
The Flask REST API will initialize on port 5000.
Access the application by <http://localhost:5000/>

You'll need the auth user/password, that by default is:
	
- User:     user
	
- Password: 1234
	
To use the API you can open Postman and import the collection located in: 
	
- api-my-books/add-ons/Api-my-books.postman_collection.json

The API format can be viewed after import the collection in postman.
	
## How-to-terminate
```bash
# Once you have use the application you have to terminate it
# Use the Docker Compose to do it
$ docker-compose down
```
	
<div>
