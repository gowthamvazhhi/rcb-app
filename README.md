# Royal Challengers Bangalore (RCB) Spring Boot Application

## Overview
This is a Spring Boot web application showcasing the Royal Challengers Bangalore (RCB) IPL team with their logo and team information.

## Features
- ✨ Beautiful, modern UI with RCB team colors (Red & Gold)
- 🏏 Displays team logo and comprehensive team information
- 📱 Responsive design for all devices
- 🎨 Premium animations and glassmorphism effects

## Team Information
- **Team:** Royal Challengers Bangalore (RCB)
- **Founded:** 2008
- **Home Ground:** M. Chinnaswamy Stadium, Bangalore
- **Captain:** Faf du Plessis
- **Coach:** Andy Flower
- **IPL Titles:** 0
- **Team Motto:** Play Bold

## Prerequisites
- Java 17 or higher
- Maven 3.6 or higher

## How to Run

### Option 1: Using Maven
```bash
cd rcb-app
mvn spring-boot:run
```

### Option 2: Build and Run JAR
```bash
cd rcb-app
mvn clean package
java -jar target/rcb-app-1.0.0.jar
```

## Access the Application
Once running, open your browser and navigate to:
```
http://localhost:8080
```

## Project Structure
```
rcb-app/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/ipl/rcb/
│       │       ├── RcbApplication.java
│       │       └── controller/
│       │           └── RcbController.java
│       └── resources/
│           ├── static/
│           │   ├── css/
│           │   │   └── style.css
│           │   └── images/
│           │       └── rcb-logo.png
│           ├── templates/
│           │   └── index.html
│           └── application.properties
└── pom.xml
```

## Technologies Used
- Spring Boot 3.2.2
- Spring Web
- Thymeleaf Template Engine
- Maven
- HTML5/CSS3

## Motto
**Ee Sala Cup Namde!** 🏏
