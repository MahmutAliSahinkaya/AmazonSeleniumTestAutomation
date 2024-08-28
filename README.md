# Selenium Test Automation Project with POM Design
This project is a simple Selenium test automation framework using the Page Object Model (POM) design pattern. It demonstrates basic test steps such as navigating to the home page, searching for a product, adding the product to the cart, and verifying if the product is added to the cart. 

## Prerequisites
- Java JDK 8 or higher
- Maven
- ChromeDriver

## Setup
1. Clone the repository
2. Navigate to the project directory
3. Ensure you have the correct version of ChromeDriver installed and update the path in BaseTest.java if necessary.

## Running the tests

To run the tests, execute the following Maven command:

```
mvn clean test
```

## Test Steps
1. Go to Home Page: Navigate to the Amazon home page.
2. Search for a Product: Use the search box to search for a product (e.g., "Laptop").
3. Add Product to Cart: Select a product from the search results and add it to the cart.
4. Go to Cart and Check if the Product is Added: Navigate to the cart and verify if the product is added.
