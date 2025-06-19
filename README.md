

# 📝 User Registration Page with Custom Validation (Spring Boot + MySQL)

This is a beginner-friendly Spring Boot web application that demonstrates:

- User registration using a simple form
- Custom annotations to validate email and password confirmation
- Form validation with meaningful error messages
- Data storage in a MySQL database
- Frontend integration with Thymeleaf
- Built with IntelliJ IDEA

---

## 🔧 Features

✅ Custom Email & Confirm Email Validation  
✅ Password Confirmation with Strength Check  
✅ Server-side form validation using Bean Validation (`@Valid`)  
✅ Duplicate Email Check before saving  
✅ Clean, modular project structure (MVC)  
✅ MySQL Database integration  
✅ Thymeleaf-based responsive UI

---

## 📸 Screenshots

_(Add screenshots of your registration and success pages here if you'd like!)_

---

## 🛠️ Tech Stack

- Java 17
- Spring Boot 3.x
- Spring Data JPA
- Spring Validation
- Thymeleaf
- Lombok
- MySQL
- Maven

---

## 🚀 How to Run the Project

### 🗂️ 1. Clone the Repo

```bash
git clone https://github.com/rootAvadhut/registerationPageWithCustomValidation.git
cd registerationPageWithCustomValidation
````

### ⚙️ 2. Configure MySQL

Make sure your MySQL server is running and update the credentials in:

```properties
# src/main/resources/application.properties

spring.datasource.url=jdbc:mysql://localhost:3306/registration_db
spring.datasource.username=root
spring.datasource.password=root
```

Create the `registration_db` database manually if not using auto-create.

---

### ▶️ 3. Run the App

```bash
./mvnw spring-boot:run
```

Or click the green **Run** button in IntelliJ.

Open your browser:

```
http://localhost:8080/register
```

---

## 🧪 Custom Annotations Used

### 1. `@EmailMatch`

Ensures that `email` and `confirmEmail` fields match.

### 2. `@PasswordMatch`

Checks:

* `password` and `confirmPassword` match
* Password length is > 5
* Not using weak passwords like `12345`, `qwerty`, etc.

---

## 📁 Project Structure

```
src
├── controller         # Handles web requests
├── model              # User entity
├── repository         # Spring Data JPA interface
├── validation         # Custom annotations and validators
├── templates          # Thymeleaf HTML files
└── application.properties
```

---

## 💡 Future Improvements

* Add login functionality
* Use BCrypt to hash passwords
* Add remember-me or email verification
* Dockerize the application
* Add test cases (JUnit + Mockito)

---

## 🙋‍♂️ Author

**Avadhut Shinde**
📫 [LinkedIn](https://www.linkedin.com/in/avadhut-shinde-a4732a1b4/)
📦 GitHub: [@rootAvadhut](https://github.com/rootAvadhut)

---

## ⭐ Show Some Love

If you found this project helpful, consider giving it a ⭐ on GitHub!
Happy coding! 😊

````

---

### ✅ What To Do Next

1. Create a file in your repo root: `README.md`  
2. Paste the above content  
3. Commit and push:
```bash
git add README.md
git commit -m "Add README.md with project overview"
git push origin main
````

Let me know when it’s live — I’ll check it and help if you'd like to add screenshots or badges too! 🚀
