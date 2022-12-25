# Vehicle Service Management System

This is a simple GUI desktop application made using `Java Swing` framework to manage and log activities in a Vehicle Service Center.  
  
This project was made part of the `KTU Database Management Systems Lab - (CSL333)` project.


# Getting Started 

To run this project make sure you have the following tools installed and configured :

* [JDK 19](https://www.oracle.com/in/java/technologies/downloads/)  
* [Mysql](https://www.mysql.com/downloads/)  

# Installation

1. Download the `jar file` and the `sql file` from here
```
https://github.com/devadathanmb/vehicle-service-management-system/releases/tag/v1.0
```
2. Make sure you have created a user named `sqluser` with no password (ie, empty string as password) to run the project.

3. Create and setup the database in `mysql` using the below code :
```sql
CREATE DATABASE serviceDB;
USE serviceDB;
source <path to the dump.sql file> # Provide the full path to the dump.sql file here
```
4. Run the application using : 
```bash
java -jar <path to the .jar file> # Provide the path to the downloaded jar file here
```

# Contributors :
Devadathan M B  
Asif J  
Rishi Raj K  
Eldose Joy  

# Tools used :
-- [MYSQL Community Server](https://www.mysql.com/)  
-- [Apache Netbeans 16](https://netbeans.apache.org/)  
-- [JDK 19](https://www.oracle.com/java/technologies/javase/jdk19-archive-downloads.html)  
-- [Mysql-Java Connectivity Driver](https://dev.mysql.com/downloads/connector/j/)  


