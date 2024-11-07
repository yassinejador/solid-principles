# SOLID Principles in Java

This repository demonstrates the application of the SOLID principles in Java. Each folder represents a different principle being applied to real-world examples in the code.

## Table of Contents

1. [Single Responsibility Principle](#single-responsibility-principle)
2. [Open-Closed Principle](#open-closed-principle)
3. [Liskov Substitution Principle](#liskov-substitution-principle)
4. [Interface Segregation Principle](#interface-segregation-principle)
5. [Dependency Inversion Principle](#dependency-inversion-principle)

---

## Single Responsibility Principle

### Description:
The **Single Responsibility Principle** (SRP) is applied to printer classes. Each class should have only one reason to change, focusing on a single responsibility.

### Key Changes:
- Refactored printer classes to separate concerns, such as document formatting and printing, into individual classes.

---

## Open-Closed Principle

### Description:
The **Open-Closed Principle** (OCP) is applied to discount classes. This principle states that a class should be open for extension but closed for modification.

### Key Changes:
- Introduced polymorphism and abstract classes for discounts, enabling the addition of new discount types without altering the existing code base.

---

## Liskov Substitution Principle

### Description:
The **Liskov Substitution Principle** (LSP) is applied to the `Bird` class hierarchy. Subclasses should be substitutable for their parent classes without altering the correctness of the program.

### Key Changes:
- Refined the `Bird` class hierarchy to ensure that derived classes (e.g., `Ostrich`, `Sparrow`) can be used interchangeably with the base `Bird` class without causing errors or unexpected behavior.

---

## Interface Segregation Principle

### Description:
The **Interface Segregation Principle** (ISP) is applied to the `Bird` class hierarchy. Instead of a single, large interface, it's broken down into smaller, more specific interfaces for relevant subclasses.

### Key Changes:
- Split the `Bird` class into multiple interfaces, such as `Flyable`, allowing birds to implement only the actions they need.

---

## Dependency Inversion Principle

### Description:
The **Dependency Inversion Principle** (DIP) is applied to a payment and data processing system. The goal is to decouple high-level modules (e.g., payment services) from low-level modules (e.g., data processing), relying on abstractions rather than concrete implementations.

### Key Changes:
- Introduced interfaces for payment methods and data processing to allow easy swapping of implementations without modifying the high-level logic.

---

## Contributing

Feel free to fork the repository and submit pull requests with improvements, bug fixes, or enhancements!
