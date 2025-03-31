# 📚 Java Exercises

## 📄 Description
This project contains three Java exercises that focus on data structures, exception handling, and unit testing using JUnit.

## 💻 Technologies Used
- Java
- JUnit
- Maven

## 📋 Requirements
- Java JDK 8 or higher
- Maven
- JUnit 5

---

# 🏆 Exercise 1: Library Management

## 📖 Description
Create a Java class that manages a collection of books in a library. The class should allow adding books, retrieving the book list, obtaining a book by its position, adding a book at a specific position, and removing a book by title.

### ✅ Functionalities:
- Add books to the collection.
- Retrieve the full book list.
- Get the title of a book given its position.
- Insert a book at a specific position.
- Remove a book by title.

### 🛠️ Unit Tests (JUnit):
- Verify that the book list is not null after creating a new object.
- Confirm that the list has the expected size after inserting multiple books.
- Ensure that the list contains a specific book in its correct position.
- Check that there are no duplicate book titles in the list.
- Validate that a book title can be retrieved given a specific position.
- Ensure that adding a book correctly modifies the list.
- Confirm that removing a book decreases the list size.
- Verify that the list remains alphabetically sorted after adding or removing a book.

---

# 🏆 Exercise 2: DNI Calculation

## 📖 Description
Create a class named `CalculoDni` that calculates the letter of a Spanish DNI given its numeric part as a parameter.

### ✅ Functionalities:
- Implement a method that receives a DNI number and returns the corresponding letter.

### 🛠️ Unit Tests (JUnit):
- Use parameterized testing to validate the method with a predefined set of 10 DNI numbers.
- Ensure that the calculation is correct for all cases.

---

# 🏆 Exercise 3: Exception Handling

## 📖 Description
Create a class with a method that throws an `ArrayIndexOutOfBoundsException`.

### ✅ Functionalities:
- Implement a method that intentionally accesses an invalid index in an array.

### 🛠️ Unit Tests (JUnit):
- Verify that the exception is correctly thrown.
- Ensure that the method fails gracefully and does not crash the application.

---

## ▶️ Execution
1. Compile the project using Maven:
   ```sh
   mvn clean compile
   ```
2. Run the unit tests:
   ```sh
   mvn test
   ```

---

## 🤝 Contributions
Contributions are welcome! Please follow these steps:
1. Fork the repository.
2. Create a new branch:
   ```sh
   git checkout -b feature/NewFeature
   ```
3. Commit your changes:
   ```sh
   git commit -m "Add New Feature"
   ```
4. Push the changes:
   ```sh
   git push origin feature/NewFeature
   ```
5. Submit a pull request.

---

## 🌐 Deployment
This project is designed for local execution and testing.

Enjoy coding! 🚀

