# Car Project 🚗⚙️ — Spring Boot & Dependency Injection

A small Spring Boot project that demonstrates **Dependency Injection (DI)** and clean separation of concerns in a simple car domain.  
The car does not create its dependencies directly — instead, components (e.g., an engine) are **injected**, making the design more modular, testable, and easy to extend.

---

## 🎯 Goal
Show how to design a small system using:
- **Spring Boot** and DI
- **Service layer** / basic layered structure
- **Custom exceptions** and error handling
- A simple **console-based simulation**

---

## 🧩 Key Concepts Demonstrated
- **Dependency Injection:** swap implementations (e.g., different engine behaviors) without changing the car logic
- **OOP principles:** clear responsibilities and encapsulation
- **Separation of concerns:** domain vs. services vs. application entry point
- **Custom exceptions:** explicit failure cases (invalid state / invalid operation)

---

## 🏗️ High-Level Structure
- `domain/` (or model classes): core entities (Car, Engine, etc.)
- `service/`: business logic and operations
- `exception/`: custom exceptions
- `CarprojectApplication.java`: application entry point

*(Folder names may vary — see `src/` for the exact structure.)*

---

## ▶️ How to Run
### Option 1: Run from IDE
Open the project and run:
- `CarprojectApplication.java`

### Option 2: Run with Maven Wrapper
```bash
# Windows
mvnw.cmd spring-boot:run

# macOS / Linux
./mvnw spring-boot:run
