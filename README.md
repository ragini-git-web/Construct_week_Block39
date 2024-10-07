# REST Assured API Testing Project

## Introduction

This project demonstrates API testing using REST Assured in Java.  It interacts with the JSONPlaceholder API (https://app.beeceptor.com/mock-server/json-placeholder) to perform various HTTP requests (GET, POST, PUT, DELETE) and validate the responses. The goal is to showcase the capabilities of REST Assured for automated API testing.

## Project Type

Backend



## Directory Structure

```
rest-assured-api-testing/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── example/
│   │               └── apitest/
│   │                   └── ... (Test classes)
│   └── test/
│       └── java/
│           └── com/
│               └── example/
│                   └── apitest/
│                       └── ... (Test classes)
└── pom.xml
```




## Features

- Automated GET requests for retrieving blog posts and comments.
- Automated POST request for simulating a failed login attempt.
- Automated POST request for successful login and JWT token retrieval (if applicable, depends on API).
- Automated GET request to retrieve API metadata.
- Comprehensive assertions to validate status codes and response data.
- Clear logging of test results.

## Design Decisions or Assumptions

- The JSONPlaceholder API is used as a target for testing.  If the API changes significantly, the tests will need to be updated.
-  Error handling is implemented to gracefully manage potential issues (e.g., network errors, unexpected response codes).
-  Assertions focus on validating status codes and basic response structure.  More detailed data validation can be added as needed.


## Installation & Getting Started

1. **Install Java:** Ensure you have a JDK (Java Development Kit) installed.
2. **Install Maven:**  Download and install Apache Maven.
3. **Clone the Repository:** Clone this repository to your local machine.
4. **Build the Project:** Navigate to the project directory in your terminal and run: `mvn clean install`
5. **Run the Tests:** Run the tests using `mvn test`.  The output will show the results of each test case, including any failures.


## Usage

The project is designed for execution via the Maven command line.  No further user interaction is required beyond running the `mvn test` command.


## Credentials

N/A - The JSONPlaceholder API used does not require authentication for the specified tasks, except potentially for the JWT token generation (which is explicitly tested as a scenario).


## APIs Used

- **JSONPlaceholder API:** https://app.beeceptor.com/mock-server/json-placeholder


## API Endpoints

The specific endpoints used will depend on the JSONPlaceholder API's structure but will generally include:

- `/posts`:  GET request to retrieve blog posts.
- `/posts/{id}`: GET request to retrieve a specific blog post by ID.
- `/comments`: GET request to retrieve blog comments.
- `/comments/{id}`: GET request to retrieve a specific comment by ID.
- `/login`: POST request for login attempts (both successful and failed).


**Example (GET /posts):**

* **Request:**  GET /posts
* **Response (Example):**
```json
[
    {
    "userId": 1,
    "id": 1,
    "title": "Introduction to Artificial Intelligence",
    "body": "Learn the basics of Artificial Intelligence and its applications in various industries.",
    "link": "https://example.com/article1",
    "comment_count": 8
  },
  // ... more posts
]
```


## Technology Stack

- **Java:** The programming language.
- **Maven:** Build automation tool.
- **REST Assured:** Java library for testing RESTful APIs.
- **JUnit (or similar):** Testing framework (implied, but should be specified in `pom.xml`).
- **Log4j or similar:** Logging library (implied).
