User Story:
As a health enthusiast, I want to calculate my BMI using a REST service, so that I can track my progress towards my fitness goals.

Readme:

BMI Service
This is a REST-based server implemented in Java using Spring Boot. The service provides a single route for calculating the BMI based on weight and height inputs.

Routes
Calculate BMI
GET /api/bmi?weight={weight}&height={height}

Calculates the BMI based on the provided weight (in kilograms) and height (in meters), and returns the result as a decimal number with 2 decimal points.

Parameters
weight (required): The weight in kilograms.
height (required): The height in meters.
Example
GET /api/bmi?weight=80&height=1.85

Response:   "bmi": 23.37

Running the Service
To run the service, you will need to have Java 11 or later installed on your system.

Clone this repository to your local machine.
Open a terminal in the project directory.
Run the following command to start the service:
./mvnw spring-boot:run
The service should now be running on http://localhost:8080.
Testing the Service
To test the service, you can use a web browser or a tool like curl to make requests to the API. Here are some example requests:
GET http://localhost:8080/api/bmi?weight=80&height=1.85
Running Unit Tests
To run the unit tests for the service, you can use the following command:
./mvnw test

GITLINK:https://github.com/Tayyibjk/BMI