# 🎓 Student Management System (Spring Core + Spring JDBC)

A simple Student Management System built using **Spring Core** and **Spring JDBC** to understand Dependency Injection, Layered Architecture, and CRUD operations with MySQL.

---

## 🚀 Technologies Used

- Java 17
- Spring Framework 6
- Spring Core
- Spring JDBC
- MySQL 8
- Maven
- Eclipse IDE

---

## 📚 Concepts Covered

### Spring Core
- IoC Container
- Dependency Injection
- Constructor Injection
- @Component
- @Service
- @Repository
- @Controller
- @Autowired
- @Primary
- @Qualifier
- Bean Scope (Singleton & Prototype)
- Bean Lifecycle
- Java Configuration (@Configuration & @Bean)
- Component Scanning
- Layered Architecture

### Spring JDBC
- DataSource
- DriverManagerDataSource
- JdbcTemplate
- RowMapper
- SQL Parameter Binding
- CRUD Operations
- MySQL Integration
- Exception Handling by JdbcTemplate

---

## ✨ Features

- Register Student
- View Student
- Update Student
- Delete Student
- Layered Architecture
- Spring-managed Beans
- Database Connectivity using JdbcTemplate
- MySQL CRUD Operations

---

## 📂 Project Structure

```
src
│
├── controller
│      StudentController
│
├── service
│      StudentService
│      StudentServiceImpl
│
├── repository
│      StudentRepository
│      StudentRepositoryImpl
│
├── mapper
│      StudentRowMapper
│
├── model
│      Student
│
├── config
│      AppConfig
│
└── App.java
```

---

## 🏗️ Architecture

```
                App
                 │
                 ▼
          StudentController
                 │
                 ▼
          StudentService
                 │
                 ▼
       StudentRepository
                 │
                 ▼
          JdbcTemplate
                 │
                 ▼
            MySQL Database
```

---

## 🗄️ Database Schema

```sql
CREATE TABLE student(
    id INT PRIMARY KEY,
    name VARCHAR(20),
    department VARCHAR(30),
    marks DOUBLE
);
```

---

## 📌 CRUD Operations

### ➜ Create

```java
jdbcTemplate.update(sql,
        student.getId(),
        student.getName(),
        student.getDepartment(),
        student.getMarks());
```

### ➜ Read

```java
jdbcTemplate.queryForObject(
        sql,
        new StudentRowMapper(),
        id);
```

### ➜ Update

```java
jdbcTemplate.update(
        sql,
        student.getName(),
        student.getDepartment(),
        student.getMarks(),
        student.getId());
```

### ➜ Delete

```java
jdbcTemplate.update(sql, id);
```

---

## 🧠 Spring JDBC Flow

```
Application
      │
      ▼
Controller
      │
      ▼
Service
      │
      ▼
Repository
      │
      ▼
JdbcTemplate
      │
      ▼
DataSource
      │
      ▼
MySQL Database
```

---

## 📖 What I Learned

- Spring Bean Management
- Dependency Injection
- Java-based Configuration
- Database Connectivity using DataSource
- CRUD Operations using JdbcTemplate
- Mapping ResultSet using RowMapper
- Layered Architecture
- Separation of Concerns
- Spring JDBC Best Practices

---

## 🔮 Future Enhancements

- Spring MVC
- Spring Boot
- REST API
- Spring Data JPA
- Hibernate
- Spring Security (JWT)
- Validation
- Exception Handling
- Logging
- Swagger Documentation

---

## 👨‍💻 Author

**Bhuvanesh**

Java Full Stack Developer (Learning Journey)

---

⭐ If you found this project useful, feel free to star the repository.