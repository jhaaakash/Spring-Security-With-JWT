# Spring Security with JWT Token Demo

This project demonstrates a simple authentication and authorization system using Spring Security in a Spring Boot application with JWT Token Based Security.

## Running the Project

To run the project, you can use the Gradle Wrapper provided in the repository. Follow these steps:

1. Open a terminal.

2. Navigate to the root directory of the project where the `build.gradle` file is located.

3. Run the following command:   
    `./gradlew bootrun`

## AuthController

The `AuthController` class defines endpoints for user authentication and registration.

- `/register`: Endpoint for user registration. Upon successful registration, generates a JWT token.
- `/login`: Endpoint for user login. Upon successful authentication, generates a JWT token.

## Request Objects

### AuthRequest

- `email`: User's email address.
- `password`: User's password.

### RegisterRequest

- `name`: User's name.
- `email`: User's email address.
- `password`: User's password.
- `role`: User's role. Default role is USER if not specified.

## Response Objects

### AuthResponse

- `message`: Success message
- `accessToken`: JWT Access Token

## SpringsecuritydemoApplication

This class is the main entry point of the application.

- `/`: Endpoint for welcoming authenticated users.
- `/admins`: Endpoint for welcoming authenticated users with ADMIN role.

## PreAuthorize Annotation

- `@PreAuthorize("hasAuthority('ADMIN')")`: Restricts access to the `/admins` endpoint to users with the ADMIN role.
