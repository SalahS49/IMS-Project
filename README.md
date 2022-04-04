Coverage: 50.1%
QA Project Inventory Management System(IMS)

This is my IMS project which is to build an application that an end user can interact with via a CLI (Command Line Interface).The objective is to create an application with utilisation of supporting tools, methodologies and technologies that encapsulate all fundamental modules covered during training.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

What things you need to install the software and how to install them

```
GIT
GitHub
Jira
MySQL
Java
Maven
JUnit
Mockito
```

### Installing

A step by step series of how to run the jar file that tell you how to get a development env running

```
configured MySQL database
db.url=jdbc:mysql://localhost:3306/<your_db>
db.user=<username>
db.password=<password>

```


```
```


## Running the tests

Tests are ran by forking from GitHub and sending over to gitbash to be cloned

```
Git clone https://github.com/SalahS49/IMS-Project.git
```

### Unit Tests 

The Unit Tests test the functionality of the Source codes. The code tested was the Customer, Item and Order classes and all their DAO and Controller classes.

```
```

### Integration Tests 

```
```

### And coding style tests

Explain what these tests test and why

```
```

## Deployment

For this project, this would be the database I created on MySQL which was connected to my Eclipse IDE. This will be run on

```
drop schema ims;

CREATE SCHEMA IF NOT EXISTS `ims`;

USE `ims` ;

CREATE TABLE IF NOT EXISTS `ims`.`customers` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `first_name` VARCHAR(40) DEFAULT NULL,
    `surname` VARCHAR(40) DEFAULT NULL,
    PRIMARY KEY (`id`)
);

drop table ims.customers;

CREATE TABLE IF NOT EXISTS `ims`.`items` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(40) DEFAULT NULL,
    `price` decimal(6,2) DEFAULT NULL,
    PRIMARY KEY (`id`)
);

drop table ims.items;

CREATE TABLE IF NOT EXISTS `ims`.`orders` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `customer_id` bigint DEFAULT NULL unique,
    `name` VARCHAR(40) DEFAULT NULL,
    `date_ordered` date DEFAULT NULL,
    PRIMARY KEY (`id`)
);```


drop table ims.orders;

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Versioning

We use [SemVer](http://semver.org/) for versioning.

## Authors

* **Chris Perrins** - *Initial work* - [christophperrins](https://github.com/christophperrins)
* **Salah Salah** - *Final work* [SalahS49] (https://github.com/SalahS49/IMS-Project)

## License

This project is licensed under the MIT license - see the [LICENSE.md](LICENSE.md) file for details 

*For help in [Choosing a license](https://choosealicense.com/)*

## Acknowledgments

* Hat tip to anyone whose code was used
* Inspiration
* etc
