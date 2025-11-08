# 🎯 Java Object-Oriented Programming Exercises Pack 🚀

## 📖 Introduction

Welcome aspiring Java developers! 🌟 This exercise pack contains **20 carefully selected OOP exercises** that will take you from basic concepts to advanced implementations. Each exercise is designed to be **self-contained** and **comprehensive**, with detailed explanations to guide you through the implementation process.

### 🎯 How to Use This Pack

- **Choose ANY 2 exercises** that interest you the most
- Read the **complete instructions** before starting
- Plan your solution on paper first ✏️
- Implement one requirement at a time ✅
- Test each method as you go 🧪
- Don't be afraid to experiment and refactor! 💡

### 📚 Prerequisites

- Basic Java syntax knowledge
- Understanding of variables, methods, and control structures
- Eagerness to learn Object-Oriented Programming! 🌈

---

## 🏆 Exercise List

### 🏦 Exercise 1: Bank Account Management System

```java
/**
 * 🏦 BANK ACCOUNT MANAGEMENT SYSTEM
 * 
 * 📝 DESCRIPTION:
 * Create a complete bank account system that demonstrates encapsulation, 
 * validation, and basic banking operations. This exercise will teach you
 * how to protect data and implement business rules.
 * 
 * 🎯 LEARNING OBJECTIVES:
 * - Understand encapsulation with private fields
 * - Implement input validation
 * - Practice method design and error handling
 * - Learn to maintain object state consistency
 * 
 * 📋 REQUIREMENTS:
 * 
 * BankAccount Class:
 * ✅ Private fields:
 *    - accountNumber (String): unique identifier
 *    - accountHolder (String): customer name
 *    - balance (double): current account balance
 *    - accountType (String): "SAVINGS" or "CHECKING"
 * 
 * ✅ Constructor:
 *    - BankAccount(accountNumber, accountHolder, initialBalance, accountType)
 *    - Validate: initialBalance >= 0, accountType must be valid
 * 
 * ✅ Public Methods:
 *    - deposit(amount): Add money to account
 *      → Validate: amount must be positive
 *      → Return: success/failure message
 *    
 *    - withdraw(amount): Remove money from account
 *      → Validate: amount must be positive AND <= balance
 *      → Return: success/failure message
 *    
 *    - transfer(targetAccount, amount): Send money to another account
 *      → Validate: amount must be positive AND <= balance
 *      → Update both accounts
 *    
 *    - getAccountInfo(): Return formatted account details
 *    - getBalance(): Return current balance
 *    - getTransactionHistory(): Return list of transactions
 * 
 * ✅ Validation Rules:
 *    - No negative balances allowed
 *    - No negative transaction amounts
 *    - Account type must be valid
 * 
 * 🚀 EXTRA CHALLENGE:
 * - Add transaction history with timestamps
 * - Implement interest calculation for savings accounts
 * - Add overdraft protection for checking accounts
 * 
 * 💡 IMPLEMENTATION TIPS:
 * 1. Start by defining the class with private fields
 * 2. Implement constructor with validation
 * 3. Create getter methods first
 * 4. Implement deposit() with validation
 * 5. Implement withdraw() with balance check
 * 6. Add transfer() method last
 * 7. Test each method thoroughly
 */
 ```

### 🎓 Exercise 2: Student Grade Management System

```java
/**
 * 🎓 STUDENT GRADE MANAGEMENT SYSTEM
 * 
 * 📝 DESCRIPTION:
 * Build a system to manage student information and grades. This exercise
 * focuses on collections, calculations, and data management.
 * 
 * 🎯 LEARNING OBJECTIVES:
 * - Work with ArrayList and collections
 * - Implement calculation methods
 * - Practice data validation
 * - Learn to organize related data
 * 
 * 📋 REQUIREMENTS:
 * 
 * Student Class:
 * ✅ Private fields:
 *    - studentId (String): unique identifier
 *    - name (String): full name
 *    - grades (ArrayList<Double>): list of grade scores
 *    - department (String): major department
 * 
 * ✅ Constructor:
 *    - Student(studentId, name, department)
 *    - Initialize empty grades list
 * 
 * ✅ Public Methods:
 *    - addGrade(grade): Add a grade to student record
 *      → Validate: grade between 0.0 and 100.0
 *      → Return: success/failure message
 *    
 *    - removeGrade(index): Remove grade at specific position
 *      → Validate: index must be valid
 *    
 *    - calculateAverage(): Return average of all grades
 *      → Return 0.0 if no grades
 *    
 *    - getHighestGrade(): Return highest grade
 *    - getLowestGrade(): Return lowest grade
 *    - getGradeCount(): Return number of grades
 *    
 *    - getLetterGrade(): Return overall letter grade
 *      → A: 90-100, B: 80-89, C: 70-79, D: 60-69, F: 0-59
 *    
 *    - getStudentInfo(): Return formatted student information
 * 
 * ✅ Validation:
 *    - Grades must be between 0 and 100
 *    - Cannot remove from empty grades list
 *    - Student ID cannot be empty
 * 
 * 🚀 EXTRA CHALLENGE:
 * - Add course names for each grade
 * - Implement GPA calculation (4.0 scale)
 * - Add semester/year for each grade
 * - Create grade statistics summary
 * 
 * 💡 IMPLEMENTATION TIPS:
 * 1. Create Student class with basic fields
 * 2. Initialize ArrayList in constructor
 * 3. Implement addGrade() with validation
 * 4. Create calculation methods (average, highest, lowest)
 * 5. Implement letter grade conversion
 * 6. Test with various grade scenarios
 */
 ```
### 📚 Exercise 3: Library Book Management System

```java

/**
 * 📚 LIBRARY BOOK MANAGEMENT SYSTEM
 * 
 * 📝 DESCRIPTION:
 * Create a library system to manage books, track availability, and handle
 * borrowing operations. This exercise demonstrates object relationships
 * and state management.
 * 
 * 🎯 LEARNING OBJECTIVES:
 * - Understand object state management
 * - Implement boolean logic
 * - Practice collection management
 * - Learn to model real-world systems
 * 
 * 📋 REQUIREMENTS:
 * 
 * Book Class:
 * ✅ Private fields:
 *    - title (String): book title
 *    - author (String): author name
 *    - isbn (String): unique book identifier
 *    - isAvailable (boolean): availability status
 *    - currentBorrower (String): who has the book
 * 
 * ✅ Constructor:
 *    - Book(title, author, isbn)
 *    - Set isAvailable to true by default
 *    - Set currentBorrower to empty string
 * 
 * ✅ Public Methods:
 *    - borrowBook(borrowerName): Mark book as borrowed
 *      → Check: book must be available
 *      → Update: isAvailable = false, set currentBorrower
 *      → Return: success/failure message
 *    
 *    - returnBook(): Mark book as returned
 *      → Update: isAvailable = true, clear currentBorrower
 *      → Return: success message
 *    
 *    - getBookInfo(): Return formatted book information
 *    - isBookAvailable(): Return availability status
 *    - getCurrentBorrower(): Return who has the book
 * 
 * Library Class:
 * ✅ Private field:
 *    - books (ArrayList<Book>): collection of books
 * 
 * ✅ Public Methods:
 *    - addBook(book): Add book to library
 *    - removeBook(isbn): Remove book by ISBN
 *    - findBookByTitle(title): Search for books by title
 *    - findBookByAuthor(author): Search for books by author
 *    - getAvailableBooks(): Return list of available books
 *    - getBorrowedBooks(): Return list of borrowed books
 * 
 * 🚀 EXTRA CHALLENGE:
 * - Add due dates and overdue calculations
 * - Implement book reservations
 * - Add multiple copies of the same book
 * - Create genre categories
 * 
 * 💡 IMPLEMENTATION TIPS:
 * 1. Implement Book class first with basic properties
 * 2. Add borrow/return functionality
 * 3. Create Library class to manage multiple books
 * 4. Implement search methods
 * 5. Test borrowing and returning scenarios
 */
 ```

### 🛒 Exercise 4: E-Commerce Shopping Cart

```java
/**
 * 🛒 E-COMMERCE SHOPPING CART SYSTEM
 * 
 * 📝 DESCRIPTION:
 * Build a shopping cart system for an online store. This exercise focuses
 * on composition, collection management, and price calculations.
 * 
 * 🎯 LEARNING OBJECTIVES:
 * - Understand composition relationships
 * - Work with multiple classes
 * - Implement complex calculations
 * - Practice collection iteration
 * 
 * 📋 REQUIREMENTS:
 * 
 * Product Class:
 * ✅ Private fields:
 *    - productId (String): unique identifier
 *    - name (String): product name
 *    - price (double): product price
 *    - category (String): product category
 * 
 * ✅ Constructor:
 *    - Product(productId, name, price, category)
 *    - Validate: price must be positive
 * 
 * ✅ Public Methods:
 *    - getters for all fields
 *    - getProductInfo(): Return formatted product info
 * 
 * CartItem Class:
 * ✅ Private fields:
 *    - product (Product): the product
 *    - quantity (int): how many in cart
 * 
 * ✅ Constructor:
 *    - CartItem(product, quantity)
 *    - Validate: quantity must be positive
 * 
 * ✅ Public Methods:
 *    - getTotalPrice(): Return product price * quantity
 *    - updateQuantity(newQuantity): Update quantity
 *    - getCartItemInfo(): Return formatted item info
 * 
 * ShoppingCart Class:
 * ✅ Private field:
 *    - items (ArrayList<CartItem>): items in cart
 *    - customerName (String): who owns the cart
 * 
 * ✅ Public Methods:
 *    - addItem(product, quantity): Add product to cart
 *      → If product already in cart, update quantity
 *    
 *    - removeItem(productId): Remove item from cart
 *    - updateQuantity(productId, newQuantity): Update item quantity
 *    - getTotalPrice(): Calculate total cart value
 *    - getItemCount(): Return number of items in cart
 *    - clearCart(): Remove all items
 *    - getCartSummary(): Return formatted cart contents
 * 
 * 🚀 EXTRA CHALLENGE:
 * - Add inventory stock checking
 * - Implement discount codes
 * - Add shipping cost calculation
 * - Create wishlist functionality
 * 
 * 💡 IMPLEMENTATION TIPS:
 * 1. Start with Product class (simplest)
 * 2. Create CartItem to link Product with quantity
 * 3. Build ShoppingCart to manage multiple CartItems
 * 4. Implement add/remove/update operations
 * 5. Test cart calculations with multiple items
 */
 ```

### 👨‍💼 Exercise 5: Employee Management System

```java
/**
 * 👨‍💼 EMPLOYEE MANAGEMENT SYSTEM
 * 
 * 📝 DESCRIPTION:
 * Create an employee management system with salary calculations and
 * role-based information. This exercise introduces inheritance and
 * polymorphic behavior.
 * 
 * 🎯 LEARNING OBJECTIVES:
 * - Understand inheritance hierarchies
 * - Implement method overriding
 * - Practice polymorphic behavior
 * - Learn abstract classes and methods
 * 
 * 📋 REQUIREMENTS:
 * 
 * Abstract Employee Class:
 * ✅ Protected fields:
 *    - name (String): employee name
 *    - employeeId (String): unique ID
 *    - baseSalary (double): monthly salary
 * 
 * ✅ Constructor:
 *    - Employee(name, employeeId, baseSalary)
 *    - Validate: baseSalary must be positive
 * 
 * ✅ Abstract Methods:
 *    - calculateSalary(): Calculate total monthly salary
 *    - getRole(): Return employee role
 * 
 * ✅ Concrete Methods:
 *    - getEmployeeInfo(): Return basic employee info
 *    - applyRaise(percentage): Increase base salary
 * 
 * FullTimeEmployee Class (extends Employee):
 * ✅ Additional field:
 *    - bonus (double): annual bonus
 * 
 * ✅ Implement:
 *    - calculateSalary(): Return (baseSalary + bonus/12)
 *    - getRole(): Return "Full-Time Employee"
 * 
 * PartTimeEmployee Class (extends Employee):
 * ✅ Additional fields:
 *    - hoursWorked (int): monthly hours
 *    - hourlyRate (double): pay per hour
 * 
 * ✅ Implement:
 *    - calculateSalary(): Return hoursWorked * hourlyRate
 *    - getRole(): Return "Part-Time Employee"
 * 
 * Manager Class (extends FullTimeEmployee):
 * ✅ Additional field:
 *    - teamSize (int): number of team members
 * 
 * ✅ Implement:
 *    - calculateSalary(): Return baseSalary + bonus/12 + (teamSize * 100)
 *    - getRole(): Return "Manager"
 * 
 * 🚀 EXTRA CHALLENGE:
 * - Add department information
 * - Implement performance reviews
 * - Add employee promotion system
 * - Create team management functionality
 * 
 * 💡 IMPLEMENTATION TIPS:
 * 1. Start with abstract Employee class
 * 2. Implement FullTimeEmployee first
 * 3. Create PartTimeEmployee with different calculation
 * 4. Extend Manager from FullTimeEmployee
 * 5. Test polymorphism with Employee array
 */
 ```

### 🔢 Exercise 6: Math Utility Class

```java
/**
 * 🔢 MATH UTILITY CLASS
 * 
 * 📝 DESCRIPTION:
 * Create a utility class with static mathematical operations. This exercise
 * focuses on static methods, input validation, and utility class design.
 * 
 * 🎯 LEARNING OBJECTIVES:
 * - Understand static methods and fields
 * - Implement mathematical algorithms
 * - Practice input validation
 * - Learn utility class design patterns
 * 
 * 📋 REQUIREMENTS:
 * 
 * MathUtils Class:
 * ✅ Static Methods (all should be public static):
 * 
 *    - factorial(n): Calculate factorial of n
 *      → Validate: n must be non-negative
 *      → Return: n! or -1 for invalid input
 *    
 *    - isPrime(n): Check if number is prime
 *      → Validate: n must be positive
 *      → Return: true if prime, false otherwise
 *    
 *    - gcd(a, b): Find greatest common divisor
 *      → Use Euclidean algorithm
 *      → Return: GCD of a and b
 *    
 *    - lcm(a, b): Find least common multiple
 *      → Formula: lcm(a,b) = (a*b)/gcd(a,b)
 *      → Return: LCM of a and b
 *    
 *    - power(base, exponent): Calculate power
 *      → Handle positive and negative exponents
 *      → Return: base^exponent
 *    
 *    - fibonacci(n): Return nth Fibonacci number
 *      → Validate: n must be non-negative
 *      → Use iterative approach (not recursive)
 * 
 * ✅ Validation Rules:
 *    - All methods should validate inputs
 *    - Return appropriate error values for invalid inputs
 *    - Handle edge cases (like zero, negative numbers)
 * 
 * ✅ Utility Class Design:
 *    - Private constructor to prevent instantiation
 *    - All methods and fields should be static
 * 
 * 🚀 EXTRA CHALLENGE:
 * - Add statistical methods (mean, median, mode)
 * - Implement combinatorial functions (permutations, combinations)
 * - Add number theory functions (isPerfect, isArmstrong)
 * - Create math constant definitions (PI, E)
 * 
 * 💡 IMPLEMENTATION TIPS:
 * 1. Make constructor private
 * 2. Implement simplest methods first (like factorial)
 * 3. Use iterative approaches for better performance
 * 4. Test each method with various inputs
 * 5. Handle edge cases carefully
 */
 ```

### 🎵 Exercise 7: Music Playlist System

```java
/**
 * 🎵 MUSIC PLAYLIST SYSTEM
 * 
 * 📝 DESCRIPTION:
 * Create a music playlist management system with songs and playlists.
 * This exercise focuses on collection management and duration calculations.
 * 
 * 🎯 LEARNING OBJECTIVES:
 * - Work with time-based calculations
 * - Implement collection sorting
 * - Practice object composition
 * - Learn to manage related objects
 * 
 * 📋 REQUIREMENTS:
 * 
 * Song Class:
 * ✅ Private fields:
 *    - title (String): song title
 *    - artist (String): artist name
 *    - duration (int): duration in seconds
 *    - genre (String): music genre
 * 
 * ✅ Constructor:
 *    - Song(title, artist, duration, genre)
 *    - Validate: duration must be positive
 * 
 * ✅ Public Methods:
 *    - getFormattedDuration(): Return "MM:SS" format
 *    - getSongInfo(): Return formatted song information
 *    - getters for all fields
 * 
 * Playlist Class:
 * ✅ Private fields:
 *    - name (String): playlist name
 *    - songs (ArrayList<Song>): list of songs
 *    - createdBy (String): creator name
 * 
 * ✅ Constructor:
 *    - Playlist(name, createdBy)
 *    - Initialize empty songs list
 * 
 * ✅ Public Methods:
 *    - addSong(song): Add song to playlist
 *    - removeSong(title): Remove song by title
 *    - getTotalDuration(): Return total duration in seconds
 *    - getFormattedTotalDuration(): Return "HH:MM:SS" format
 *    - findSongsByArtist(artist): Return songs by specific artist
 *    - shuffle(): Randomize song order
 *    - getPlaylistInfo(): Return formatted playlist details
 * 
 * ✅ Calculation Methods:
 *    - getAverageSongDuration(): Return average duration
 *    - getLongestSong(): Return song with maximum duration
 *    - getShortestSong(): Return song with minimum duration
 * 
 * 🚀 EXTRA CHALLENGE:
 * - Add song ratings and favorites
 * - Implement playlist export functionality
 * - Add duplicate song prevention
 * - Create collaborative playlists
 * 
 * 💡 IMPLEMENTATION TIPS:
 * 1. Create Song class with duration formatting
 * 2. Build Playlist class to manage songs
 * 3. Implement duration calculation methods
 * 4. Add search and filter functionality
 * 5. Test with various playlist scenarios
 */
 ```

### 📱 Exercise 8: Contact Management System

```java
/**
 * 📱 CONTACT MANAGEMENT SYSTEM
 * 
 * 📝 DESCRIPTION:
 * Build a contact management system with validation and search capabilities.
 * This exercise focuses on data validation and collection management.
 * 
 * 🎯 LEARNING OBJECTIVES:
 * - Implement comprehensive input validation
 * - Practice regular expressions
 * - Learn collection search algorithms
 * - Understand data integrity
 * 
 * 📋 REQUIREMENTS:
 * 
 * Contact Class:
 * ✅ Private fields:
 *    - name (String): contact name
 *    - phone (String): phone number
 *    - email (String): email address
 *    - address (String): physical address
 * 
 * ✅ Constructor:
 *    - Contact(name, phone, email, address)
 *    - Validate all fields using validation methods
 * 
 * ✅ Validation Methods (private):
 *    - isValidPhone(phone): Check phone format
 *      → Format: XXX-XXX-XXXX (10 digits)
 *    
 *    - isValidEmail(email): Check email format
 *      → Must contain @ and .
 *      → Basic format validation
 *    
 *    - isValidName(name): Check name format
 *      → Not empty, only letters and spaces
 * 
 * ✅ Public Methods:
 *    - getContactInfo(): Return formatted contact info
 *    - updatePhone(newPhone): Update with validation
 *    - updateEmail(newEmail): Update with validation
 *    - getters for all fields
 * 
 * AddressBook Class:
 * ✅ Private field:
 *    - contacts (ArrayList<Contact>): list of contacts
 * 
 * ✅ Public Methods:
 *    - addContact(contact): Add new contact
 *    - removeContact(phone): Remove contact by phone
 *    - findContactByName(name): Search by name (partial match)
 *    - findContactByPhone(phone): Search by exact phone
 *    - updateContact(phone, newName, newEmail, newAddress): Update contact
 *    - getAllContacts(): Return all contacts
 *    - getContactCount(): Return number of contacts
 * 
 * 🚀 EXTRA CHALLENGE:
 * - Add contact groups/categories
 * - Implement contact import/export
 * - Add duplicate contact detection
 * - Create favorite contacts system
 * 
 * 💡 IMPLEMENTATION TIPS:
 * 1. Start with Contact class and validation methods
 * 2. Test validation with various inputs
 * 3. Create AddressBook to manage contacts
 * 4. Implement search functionality
 * 5. Test adding, removing, and updating contacts
 */
 ```

### 🏥 Exercise 9: Hospital Appointment System

```java
/**
 * 🏥 HOSPITAL APPOINTMENT SYSTEM
 * 
 * 📝 DESCRIPTION:
 * Create a hospital appointment scheduling system with doctors and patients.
 * This exercise focuses on date/time management and relationship modeling.
 * 
 * 🎯 LEARNING OBJECTIVES:
 * - Model complex real-world relationships
 * - Implement date/time logic
 * - Practice collection management
 * - Learn conflict detection
 * 
 * 📋 REQUIREMENTS:
 * 
 * Doctor Class:
 * ✅ Private fields:
 *    - doctorId (String): unique identifier
 *    - name (String): doctor name
 *    - specialization (String): medical specialty
 *    - availableSlots (ArrayList<String>): available time slots
 * 
 * ✅ Constructor:
 *    - Doctor(doctorId, name, specialization)
 *    - Initialize empty available slots
 * 
 * ✅ Public Methods:
 *    - addAvailableSlot(slot): Add time slot (format: "YYYY-MM-DD HH:MM")
 *    - removeAvailableSlot(slot): Remove time slot
 *    - isSlotAvailable(slot): Check if slot is free
 *    - getDoctorInfo(): Return formatted doctor info
 * 
 * Patient Class:
 * ✅ Private fields:
 *    - patientId (String): unique identifier
 *    - name (String): patient name
 *    - phone (String): contact phone
 *    - medicalHistory (ArrayList<String>): past appointments
 * 
 * ✅ Constructor:
 *    - Patient(patientId, name, phone)
 *    - Initialize empty medical history
 * 
 * Appointment Class:
 * ✅ Private fields:
 *    - appointmentId (String): unique identifier
 *    - doctor (Doctor): appointed doctor
 *    - patient (Patient): patient
 *    - dateTime (String): appointment time
 *    - status (String): "SCHEDULED", "COMPLETED", "CANCELLED"
 * 
 * ✅ Constructor:
 *    - Appointment(doctor, patient, dateTime)
 *    - Set status to "SCHEDULED"
 * 
 * ✅ Public Methods:
 *    - completeAppointment(): Mark as completed
 *    - cancelAppointment(): Mark as cancelled
 *    - getAppointmentInfo(): Return formatted info
 *    - reschedule(newDateTime): Change appointment time
 * 
 * Hospital Class:
 * ✅ Private fields:
 *    - doctors (ArrayList<Doctor>): list of doctors
 *    - patients (ArrayList<Patient>): list of patients
 *    - appointments (ArrayList<Appointment>): all appointments
 * 
 * ✅ Public Methods:
 *    - scheduleAppointment(doctorId, patientId, dateTime): Create appointment
 *      → Check: doctor must be available at that time
 *      → Check: no conflicting appointments
 *    
 *    - cancelAppointment(appointmentId): Cancel appointment
 *    - getDoctorAppointments(doctorId): Return doctor's appointments
 *    - getPatientAppointments(patientId): Return patient's appointments
 * 
 * 🚀 EXTRA CHALLENGE:
 * - Add appointment reminders
 * - Implement waitlist for popular doctors
 * - Add treatment notes to appointments
 * - Create billing system
 * 
 * 💡 IMPLEMENTATION TIPS:
 * 1. Start with Doctor and Patient classes
 * 2. Create Appointment to link them
 * 3. Build Hospital to manage everything
 * 4. Implement conflict detection
 * 5. Test scheduling scenarios
 */
 ```

### 💰 Exercise 10: Expense Tracker System

```java
/**
 * 💰 EXPENSE TRACKER SYSTEM
 * 
 * 📝 DESCRIPTION:
 * Build a personal expense tracker with categories and reporting.
 * This exercise focuses on data organization and calculations.
 * 
 * 🎯 LEARNING OBJECTIVES:
 * - Work with date-based data
 * - Implement category organization
 * - Practice financial calculations
 * - Learn reporting and statistics
 * 
 * 📋 REQUIREMENTS:
 * 
 * Expense Class:
 * ✅ Private fields:
 *    - expenseId (String): unique identifier
 *    - amount (double): expense amount
 *    - category (String): expense category
 *    - date (String): expense date (YYYY-MM-DD)
 *    - description (String): expense notes
 * 
 * ✅ Constructor:
 *    - Expense(amount, category, date, description)
 *    - Validate: amount must be positive
 *    - Auto-generate expenseId
 * 
 * ✅ Public Methods:
 *    - getExpenseInfo(): Return formatted expense info
 *    - getters for all fields
 * 
 * ExpenseTracker Class:
 * ✅ Private field:
 *    - expenses (ArrayList<Expense>): all expenses
 *    - categories (Set<String>): available categories
 * 
 * ✅ Constructor:
 *    - ExpenseTracker()
 *    - Initialize empty collections
 *    - Add default categories: ["Food", "Transport", "Entertainment", "Bills", "Other"]
 * 
 * ✅ Public Methods:
 *    - addExpense(amount, category, date, description): Add new expense
 *      → Validate: category must exist
 *      → Validate: amount must be positive
 *    
 *    - removeExpense(expenseId): Remove expense
 *    - getTotalExpenses(): Return sum of all expenses
 *    - getExpensesByCategory(category): Return expenses for category
 *    - getMonthlyExpenses(month, year): Return expenses for specific month
 * 
 * ✅ Reporting Methods:
 *    - getCategoryBreakdown(): Return map of category -> total amount
 *    - getMonthlySummary(month, year): Return monthly statistics
 *    - getTopCategories(limit): Return top spending categories
 *    - getAverageMonthlySpending(): Return average monthly spend
 * 
 * 🚀 EXTRA CHALLENGE:
 * - Add budget limits per category
 * - Implement expense trends analysis
 * - Add receipt image attachment (simulated)
 * - Create expense export functionality
 * 
 * 💡 IMPLEMENTATION TIPS:
 * 1. Create Expense class with basic properties
 * 2. Build ExpenseTracker to manage expenses
 * 3. Implement basic CRUD operations first
 * 4. Add reporting methods gradually
 * 5. Test with sample expense data
 */
 ```

### 🚗 Exercise 11: Car Rental System

```java
/**
 * 🚗 CAR RENTAL SYSTEM
 * 
 * 📝 DESCRIPTION:
 * Create a car rental management system with availability tracking and
 * pricing calculations. This exercise focuses on state management and
 * date calculations.
 * 
 * 🎯 LEARNING OBJECTIVES:
 * - Understand object state transitions
 * - Implement date-based calculations
 * - Practice rental business logic
 * - Learn availability management
 * 
 * 📋 REQUIREMENTS:
 * 
 * Vehicle Class:
 * ✅ Private fields:
 *    - vehicleId (String): unique identifier
 *    - make (String): manufacturer
 *    - model (String): model name
 *    - year (int): manufacturing year
 *    - rentalPrice (double): price per day
 *    - isAvailable (boolean): availability status
 * 
 * ✅ Constructor:
 *    - Vehicle(vehicleId, make, model, year, rentalPrice)
 *    - Set isAvailable to true by default
 * 
 * ✅ Public Methods:
 *    - rentVehicle(): Mark as rented
 *      → Check: vehicle must be available
 *      → Update: isAvailable = false
 *    
 *    - returnVehicle(): Mark as returned
 *      → Update: isAvailable = true
 *    
 *    - getVehicleInfo(): Return formatted vehicle info
 *    - calculateRentalCost(days): Return rentalPrice * days
 * 
 * Customer Class:
 * ✅ Private fields:
 *    - customerId (String): unique identifier
 *    - name (String): customer name
 *    - driverLicense (String): license number
 *    - phone (String): contact number
 * 
 * Rental Class:
 * ✅ Private fields:
 *    - rentalId (String): unique identifier
 *    - vehicle (Vehicle): rented vehicle
 *    - customer (Customer): renting customer
 *    - startDate (String): rental start (YYYY-MM-DD)
 *    - endDate (String): rental end (YYYY-MM-DD)
 *    - totalCost (double): calculated cost
 *    - status (String): "ACTIVE", "COMPLETED", "CANCELLED"
 * 
 * ✅ Constructor:
 *    - Rental(vehicle, customer, startDate, endDate)
 *    - Calculate total cost based on days
 *    - Set status to "ACTIVE"
 *    - Mark vehicle as rented
 * 
 * ✅ Public Methods:
 *    - completeRental(): Mark as completed
 *      → Update vehicle availability
 *    
 *    - calculateDuration(): Return rental days
 *    - getRentalInfo(): Return formatted rental info
 * 
 * RentalAgency Class:
 * ✅ Private fields:
 *    - vehicles (ArrayList<Vehicle>): available vehicles
 *    - customers (ArrayList<Customer>): registered customers
 *    - rentals (ArrayList<Rental>): all rentals
 * 
 * ✅ Public Methods:
 *    - addVehicle(vehicle): Add to fleet
 *    - registerCustomer(customer): Add customer
 *    - rentVehicle(vehicleId, customerId, startDate, endDate): Create rental
 *      → Check: vehicle must be available
 *      → Check: dates must be valid
 *    
 *    - returnVehicle(rentalId): Complete rental
 *    - getAvailableVehicles(): Return available vehicles
 *    - getCustomerRentals(customerId): Return customer's rental history
 * 
 * 🚀 EXTRA CHALLENGE:
 * - Add vehicle maintenance scheduling
 * - Implement late return fees
 * - Add insurance options
 * - Create vehicle search with filters
 * 
 * 💡 IMPLEMENTATION TIPS:
 * 1. Start with Vehicle and Customer classes
 * 2. Create Rental to connect them
 * 3. Build RentalAgency to manage operations
 * 4. Implement date validation and calculations
 * 5. Test rental scenarios
 */
 ```

### 🎮 Exercise 12: Game Character System

```java
/**
 * 🎮 GAME CHARACTER SYSTEM
 * 
 * 📝 DESCRIPTION:
 * Build a RPG-style character system with stats, inventory, and leveling.
 * This exercise focuses on game mechanics and character progression.
 * 
 * 🎯 LEARNING OBJECTIVES:
 * - Implement game mechanics
 * - Practice character progression
 * - Work with inventory management
 * - Learn combat calculations
 * 
 * 📋 REQUIREMENTS:
 * 
 * GameCharacter Class:
 * ✅ Private fields:
 *    - name (String): character name
 *    - level (int): character level
 *    - health (int): current health
 *    - maxHealth (int): maximum health
 *    - attackPower (int): damage capability
 *    - defense (int): damage reduction
 *    - experience (int): current XP
 *    - inventory (ArrayList<String>): carried items
 * 
 * ✅ Constructor:
 *    - GameCharacter(name)
 *    - Set level=1, health=100, maxHealth=100, etc.
 *    - Initialize empty inventory
 * 
 * ✅ Public Methods:
 *    - attack(target): Reduce target's health
 *      → Damage = this.attackPower - target.defense
 *      → Minimum damage = 1
 *    
 *    - takeDamage(amount): Reduce health
 *      → Health cannot go below 0
 *    
 *    - heal(amount): Restore health
 *      → Cannot exceed maxHealth
 *    
 *    - levelUp(): Increase level and stats
 *      → Required XP = level * 100
 *      → Increase maxHealth, attackPower, defense
 *    
 *    - addItem(item): Add to inventory
 *    - useItem(item): Use item from inventory
 *    - getCharacterInfo(): Return formatted character stats
 * 
 * ✅ Calculation Methods:
 *    - getRequiredExperience(): Return XP needed for next level
 *    - isAlive(): Return health > 0
 *    - getHealthPercentage(): Return health as percentage
 * 
 * 🚀 EXTRA CHALLENGE:
 * - Add character classes (Warrior, Mage, Archer)
 * - Implement equipment system
 * - Add special abilities
 * - Create save/load functionality
 * 
 * 💡 IMPLEMENTATION TIPS:
 * 1. Start with basic character properties
 * 2. Implement combat methods (attack, takeDamage)
 * 3. Add leveling system
 * 4. Create inventory management
 * 5. Test character progression
 */
 ```

### 📊 Exercise 13: Stock Portfolio Tracker

```java
/**
 * 📊 STOCK PORTFOLIO TRACKER
 * 
 * 📝 DESCRIPTION:
 * Create a stock portfolio management system with buying, selling, and
 * performance tracking. This exercise focuses on financial calculations
 * and portfolio management.
 * 
 * 🎯 LEARNING OBJECTIVES:
 * - Implement financial calculations
 * - Practice portfolio management
 * - Work with stock data
 * - Learn performance metrics
 * 
 * 📋 REQUIREMENTS:
 * 
 * Stock Class:
 * ✅ Private fields:
 *    - symbol (String): stock ticker symbol
 *    - name (String): company name
 *    - currentPrice (double): current stock price
 * 
 * ✅ Constructor:
 *    - Stock(symbol, name, currentPrice)
 *    - Validate: price must be positive
 * 
 * ✅ Public Methods:
 *    - updatePrice(newPrice): Update current price
 *    - getStockInfo(): Return formatted stock info
 *    - getters for all fields
 * 
 * StockHolding Class:
 * ✅ Private fields:
 *    - stock (Stock): the stock
 *    - quantity (int): number of shares
 *    - purchasePrice (double): price when bought
 * 
 * ✅ Constructor:
 *    - StockHolding(stock, quantity, purchasePrice)
 *    - Validate: quantity and price must be positive
 * 
 * ✅ Public Methods:
 *    - getCurrentValue(): Return quantity * currentPrice
 *    - getProfitLoss(): Return currentValue - costBasis
 *    - getProfitLossPercentage(): Return (profitLoss / costBasis) * 100
 *    - getCostBasis(): Return quantity * purchasePrice
 *    - getHoldingInfo(): Return formatted holding info
 * 
 * Portfolio Class:
 * ✅ Private fields:
 *    - holdings (ArrayList<StockHolding>): stock holdings
 *    - cashBalance (double): available cash
 *    - owner (String): portfolio owner
 * 
 * ✅ Constructor:
 *    - Portfolio(owner, initialCash)
 *    - Initialize empty holdings
 * 
 * ✅ Public Methods:
 *    - buyStock(stock, quantity, price): Purchase shares
 *      → Check: sufficient cash balance
 *      → Create new holding or update existing
 *      → Deduct cost from cash
 *    
 *    - sellStock(symbol, quantity): Sell shares
 *      → Check: sufficient shares owned
 *      → Remove holding or reduce quantity
 *      → Add proceeds to cash
 *    
 *    - getPortfolioValue(): Return total value (holdings + cash)
 *    - getTotalProfitLoss(): Return total P&L
 *    - getPortfolioSummary(): Return formatted portfolio info
 * 
 * 🚀 EXTRA CHALLENGE:
 * - Add transaction history
 * - Implement dividend tracking
 * - Add portfolio performance charts
 * - Create watchlist functionality
 * 
 * 💡 IMPLEMENTATION TIPS:
 * 1. Create Stock class with basic properties
 * 2. Build StockHolding to track purchases
 * 3. Implement Portfolio to manage holdings
 * 4. Add buy/sell operations with validation
 * 5. Test portfolio calculations
 */
 ```

### 🍽️ Exercise 14: Restaurant Order Management

```java
/**
 * 🍽️ RESTAURANT ORDER MANAGEMENT SYSTEM
 * 
 * 📝 DESCRIPTION:
 * Build a restaurant order management system with menu, orders, and
 * kitchen tracking. This exercise focuses on order processing and
 * restaurant operations.
 * 
 * 🎯 LEARNING OBJECTIVES:
 * - Model restaurant operations
 * - Implement order processing
 * - Practice kitchen workflow
 * - Learn table management
 * 
 * 📋 REQUIREMENTS:
 * 
 * MenuItem Class:
 * ✅ Private fields:
 *    - itemId (String): unique identifier
 *    - name (String): item name
 *    - description (String): item description
 *    - price (double): item price
 *    - category (String): "Appetizer", "Main Course", "Dessert", "Beverage"
 *    - preparationTime (int): minutes to prepare
 * 
 * ✅ Constructor:
 *    - MenuItem(itemId, name, description, price, category, preparationTime)
 *    - Validate: price and preparationTime must be positive
 * 
 * Table Class:
 * ✅ Private fields:
 *    - tableNumber (int): table identifier
 *    - capacity (int): maximum guests
 *    - isOccupied (boolean): occupancy status
 *    - currentOrder (Order): current table order
 * 
 * OrderItem Class:
 * ✅ Private fields:
 *    - menuItem (MenuItem): the menu item
 *    - quantity (int): how many ordered
 *    - specialInstructions (String): customer requests
 * 
 * Order Class:
 * ✅ Private fields:
 *    - orderId (String): unique identifier
 *    - tableNumber (int): which table
 *    - items (ArrayList<OrderItem>): ordered items
 *    - status (String): "PENDING", "PREPARING", "READY", "SERVED"
 *    - orderTime (String): when ordered
 * 
 * ✅ Public Methods:
 *    - addItem(menuItem, quantity, instructions): Add to order
 *    - removeItem(itemId): Remove from order
 *    - calculateTotal(): Return order total
 *    - getEstimatedPreparationTime(): Return max preparation time
 *    - updateStatus(newStatus): Change order status
 * 
 * Restaurant Class:
 * ✅ Private fields:
 *    - menu (ArrayList<MenuItem>): restaurant menu
 *    - tables (ArrayList<Table>): restaurant tables
 *    - orders (ArrayList<Order>): all orders
 * 
 * ✅ Public Methods:
 *    - addMenuItem(item): Add to menu
 *    - occupyTable(tableNumber): Mark table as occupied
 *    - freeTable(tableNumber): Mark table as available
 *    - createOrder(tableNumber): Start new order for table
 *    - getPendingOrders(): Return orders not yet served
 *    - getTableStatus(tableNumber): Return table status
 * 
 * 🚀 EXTRA CHALLENGE:
 * - Add kitchen display system
 * - Implement order modifications
 * - Add payment processing
 * - Create reservation system
 * 
 * 💡 IMPLEMENTATION TIPS:
 * 1. Start with MenuItem and Table classes
 * 2. Create OrderItem and Order for order management
 * 3. Build Restaurant to coordinate everything
 * 4. Implement table and order status tracking
 * 5. Test restaurant workflow
 */
 ```

### 🎯 Exercise 15: Quiz Application System

```java
/**
 * 🎯 QUIZ APPLICATION SYSTEM
 * 
 * 📝 DESCRIPTION:
 * Create a quiz application with questions, scoring, and results.
 * This exercise focuses on quiz logic and user interaction simulation.
 * 
 * 🎯 LEARNING OBJECTIVES:
 * - Implement quiz logic
 * - Practice scoring systems
 * - Work with different question types
 * - Learn results calculation
 * 
 * 📋 REQUIREMENTS:
 * 
 * Question Class (Abstract):
 * ✅ Protected fields:
 *    - questionText (String): the question
 *    - points (int): question value
 * 
 * ✅ Constructor:
 *    - Question(questionText, points)
 * 
 * ✅ Abstract Methods:
 *    - checkAnswer(answer): Validate user answer
 *    - getCorrectAnswer(): Return correct answer
 *    - displayQuestion(): Show question to user
 * 
 * MultipleChoiceQuestion Class (extends Question):
 * ✅ Additional fields:
 *    - options (ArrayList<String>): answer choices
 *    - correctOptionIndex (int): which option is correct
 * 
 * ✅ Implement:
 *    - checkAnswer(answer): Compare with correct option
 *    - getCorrectAnswer(): Return correct option text
 *    - displayQuestion(): Show question with options
 * 
 * TrueFalseQuestion Class (extends Question):
 * ✅ Additional field:
 *    - correctAnswer (boolean): true or false
 * 
 * ✅ Implement:
 *    - checkAnswer(answer): Compare boolean values
 *    - getCorrectAnswer(): Return "True" or "False"
 *    - displayQuestion(): Show true/false question
 * 
 * Quiz Class:
 * ✅ Private fields:
 *    - quizName (String): quiz title
 *    - questions (ArrayList<Question>): quiz questions
 *    - timeLimit (int): minutes to complete
 * 
 * ✅ Public Methods:
 *    - addQuestion(question): Add to quiz
 *    - startQuiz(): Begin quiz session
 *    - calculateScore(answers): Calculate total score
 *    - getQuizSummary(): Return quiz information
 * 
 * QuizResult Class:
 * ✅ Private fields:
 *    - playerName (String): who took quiz
 *    - score (int): points earned
 *    - maxScore (int): total possible points
 *    - answers (Map<Question, String>): user answers
 * 
 * ✅ Public Methods:
 *    - calculatePercentage(): Return score percentage
 *    - getGrade(): Return letter grade
 *    - getResultDetails(): Return detailed results
 * 
 * 🚀 EXTRA CHALLENGE:
 * - Add timer functionality
 * - Implement different difficulty levels
 * - Add question categories
 * - Create quiz statistics
 * 
 * 💡 IMPLEMENTATION TIPS:
 * 1. Start with abstract Question class
 * 2. Implement different question types
 * 3. Create Quiz to manage questions
 * 4. Build QuizResult for scoring
 * 5. Test with sample quizzes
 */
 ```

### 🏨 Exercise 16: Hotel Management System

```java
/**
 * 🏨 HOTEL MANAGEMENT SYSTEM
 * 
 * 📝 DESCRIPTION:
 * Build a comprehensive hotel management system with rooms, bookings,
 * and guest services. This exercise focuses on hotel operations and
 * reservation management.
 * 
 * 🎯 LEARNING OBJECTIVES:
 * - Model hotel operations
 * - Implement booking system
 * - Practice room management
 * - Learn guest services
 * 
 * 📋 REQUIREMENTS:
 * 
 * Room Class:
 * ✅ Private fields:
 *    - roomNumber (String): room identifier
 *    - roomType (String): "Single", "Double", "Suite"
 *    - pricePerNight (double): nightly rate
 *    - amenities (ArrayList<String>): room features
 *    - isAvailable (boolean): availability status
 * 
 * ✅ Constructor:
 *    - Room(roomNumber, roomType, pricePerNight)
 *    - Set isAvailable to true
 *    - Initialize amenities list
 * 
 * ✅ Public Methods:
 *    - addAmenity(amenity): Add room feature
 *    - getRoomInfo(): Return formatted room info
 *    - calculateStayCost(nights): Return total cost
 * 
 * Guest Class:
 * ✅ Private fields:
 *    - guestId (String): unique identifier
 *    - name (String): guest name
 *    - phone (String): contact number
 *    - email (String): email address
 *    - loyaltyPoints (int): reward points
 * 
 * Booking Class:
 * ✅ Private fields:
 *    - bookingId (String): unique identifier
 *    - guest (Guest): booking guest
 *    - room (Room): booked room
 *    - checkInDate (String): arrival date
 *    - checkOutDate (String): departure date
 *    - totalCost (double): stay cost
 *    - status (String): "CONFIRMED", "CHECKED_IN", "CHECKED_OUT"
 * 
 * ✅ Constructor:
 *    - Booking(guest, room, checkInDate, checkOutDate)
 *    - Calculate total cost
 *    - Set status to "CONFIRMED"
 *    - Mark room as unavailable
 * 
 * ✅ Public Methods:
 *    - checkIn(): Mark guest as checked in
 *    - checkOut(): Mark guest as checked out
 *    - getBookingDuration(): Return stay length in days
 *    - getBookingInfo(): Return formatted booking info
 * 
 * Hotel Class:
 * ✅ Private fields:
 *    - name (String): hotel name
 *    - rooms (ArrayList<Room>): hotel rooms
 *    - guests (ArrayList<Guest>): registered guests
 *    - bookings (ArrayList<Booking>): all bookings
 * 
 * ✅ Public Methods:
 *    - addRoom(room): Add to inventory
 *    - registerGuest(guest): Add to guest list
 *    - makeBooking(guestId, roomNumber, checkIn, checkOut): Create booking
 *      → Check: room must be available for dates
 *    
 *    - checkInGuest(bookingId): Process check-in
 *    - checkOutGuest(bookingId): Process check-out
 *    - getAvailableRooms(checkIn, checkOut): Return available rooms
 *    - getHotelOccupancy(): Return occupancy percentage
 * 
 * 🚀 EXTRA CHALLENGE:
 * - Add room service orders
 * - Implement billing system
 * - Add housekeeping status
 * - Create loyalty program
 * 
 * 💡 IMPLEMENTATION TIPS:
 * 1. Start with Room and Guest classes
 * 2. Create Booking to connect them
 * 3. Build Hotel to manage operations
 * 4. Implement date validation and availability
 * 5. Test booking scenarios
 */
 ```

### 📅 Exercise 17: Task Management System

```java
/**
 * 📅 TASK MANAGEMENT SYSTEM
 * 
 * 📝 DESCRIPTION:
 * Create a task management system with projects, tasks, and team assignments.
 * This exercise focuses on project management and task tracking.
 * 
 * 🎯 LEARNING OBJECTIVES:
 * - Implement task management
 * - Practice project organization
 * - Work with deadlines and priorities
 * - Learn team collaboration
 * 
 * 📋 REQUIREMENTS:
 * 
 * Task Class:
 * ✅ Private fields:
 *    - taskId (String): unique identifier
 *    - title (String): task name
 *    - description (String): task details
 *    - priority (String): "LOW", "MEDIUM", "HIGH"
 *    - status (String): "TODO", "IN_PROGRESS", "COMPLETED"
 *    - dueDate (String): deadline (YYYY-MM-DD)
 *    - assignedTo (String): assigned team member
 * 
 * ✅ Constructor:
 *    - Task(title, description, priority, dueDate)
 *    - Set status to "TODO"
 *    - Auto-generate taskId
 * 
 * ✅ Public Methods:
 *    - assignTo(teamMember): Assign task
 *    - updateStatus(newStatus): Change status
 *    - isOverdue(): Check if past due date
 *    - getTaskInfo(): Return formatted task info
 * 
 * Project Class:
 * ✅ Private fields:
 *    - projectId (String): unique identifier
 *    - name (String): project name
 *    - description (String): project details
 *    - tasks (ArrayList<Task>): project tasks
 *    - teamMembers (ArrayList<String>): project team
 *    - startDate (String): project start
 *    - endDate (String): project deadline
 * 
 * ✅ Constructor:
 *    - Project(name, description, startDate, endDate)
 *    - Initialize empty tasks and team
 * 
 * ✅ Public Methods:
 *    - addTask(task): Add to project
 *    - removeTask(taskId): Remove from project
 *    - addTeamMember(member): Add to team
 *    - getCompletedTasks(): Return completed tasks
 *    - getProgressPercentage(): Return completion percentage
 *    - getProjectInfo(): Return formatted project info
 * 
 * TaskManager Class:
 * ✅ Private fields:
 *    - projects (ArrayList<Project>): all projects
 *    - allTasks (ArrayList<Task>): all tasks
 * 
 * ✅ Public Methods:
 *    - createProject(projectData): Create new project
 *    - createTask(projectId, taskData): Add task to project
 *    - getTasksByAssignee(assignee): Return person's tasks
 *    - getOverdueTasks(): Return overdue tasks
 *    - getTasksByPriority(priority): Return filtered tasks
 *    - getWorkloadReport(): Return team workload
 * 
 * 🚀 EXTRA CHALLENGE:
 * - Add task dependencies
 * - Implement time tracking
 * - Add file attachments
 * - Create project templates
 * 
 * 💡 IMPLEMENTATION TIPS:
 * 1. Start with Task class with status management
 * 2. Create Project to organize tasks
 * 3. Build TaskManager to coordinate everything
 * 4. Implement filtering and reporting
 * 5. Test with sample projects and tasks
 */
 ```

### 🎫 Exercise 18: Event Management System

```java
/**
 * 🎫 EVENT MANAGEMENT SYSTEM
 * 
 * 📝 DESCRIPTION:
 * Build an event management system with tickets, venues, and attendee tracking.
 * This exercise focuses on event planning and ticket management.
 * 
 * 🎯 LEARNING OBJECTIVES:
 * - Implement event management
 * - Practice ticket handling
 * - Work with capacity limits
 * - Learn attendee tracking
 * 
 * 📋 REQUIREMENTS:
 * 
 * Event Class:
 * ✅ Private fields:
 *    - eventId (String): unique identifier
 *    - name (String): event name
 *    - description (String): event details
 *    - date (String): event date (YYYY-MM-DD)
 *    - time (String): event time
 *    - venue (Venue): event location
 *    - ticketPrice (double): ticket cost
 *    - totalTickets (int): maximum capacity
 *    - soldTickets (int): tickets sold
 * 
 * ✅ Constructor:
 *    - Event(name, description, date, time, venue, ticketPrice, totalTickets)
 *    - Set soldTickets to 0
 * 
 * ✅ Public Methods:
 *    - sellTickets(quantity): Sell tickets
 *      → Check: enough tickets available
 *      → Update: soldTickets
 *    
 *    - getAvailableTickets(): Return remaining tickets
 *    - isSoldOut(): Check if no tickets left
 *    - getEventRevenue(): Return total revenue
 *    - getEventInfo(): Return formatted event info
 * 
 * Venue Class:
 * ✅ Private fields:
 *    - venueId (String): unique identifier
 *    - name (String): venue name
 *    - address (String): location
 *    - capacity (int): maximum people
 *    - amenities (ArrayList<String>): venue features
 * 
 * Attendee Class:
 * ✅ Private fields:
 *    - attendeeId (String): unique identifier
 *    - name (String): attendee name
 *    - email (String): contact email
 *    - tickets (ArrayList<Ticket>): purchased tickets
 * 
 * Ticket Class:
 * ✅ Private fields:
 *    - ticketId (String): unique identifier
 *    - event (Event): the event
 *    - attendee (Attendee): ticket holder
 *    - purchaseDate (String): when bought
 *    - seatNumber (String): assigned seat
 * 
 * EventManager Class:
 * ✅ Private fields:
 *    - events (ArrayList<Event>): all events
 *    - venues (ArrayList<Venue>): available venues
 *    - attendees (ArrayList<Attendee>): registered attendees
 * 
 * ✅ Public Methods:
 *    - createEvent(eventData): Create new event
 *    - registerAttendee(attendeeData): Add attendee
 *    - purchaseTickets(eventId, attendeeId, quantity): Sell tickets
 *    - getEventAttendees(eventId): Return event attendees
 *    - getPopularEvents(): Return events with most sales
 *    - getVenueSchedule(venueId): Return venue bookings
 * 
 * 🚀 EXTRA CHALLENGE:
 * - Add different ticket types (VIP, Standard)
 * - Implement waitlist for sold-out events
 * - Add event categories and filtering
 * - Create promotional discounts
 * 
 * 💡 IMPLEMENTATION TIPS:
 * 1. Start with Event and Venue classes
 * 2. Create Attendee and Ticket for ticket management
 * 3. Build EventManager to coordinate operations
 * 4. Implement ticket sales with capacity checks
 * 5. Test event scenarios
 */
 ```

### 📈 Exercise 19: Sales Analytics System

```java
/**
 * 📈 SALES ANALYTICS SYSTEM
 * 
 * 📝 DESCRIPTION:
 * Create a sales analytics system with products, sales records, and
 * performance reporting. This exercise focuses on data analysis and
 * business intelligence.
 * 
 * 🎯 LEARNING OBJECTIVES:
 * - Implement sales tracking
 * - Practice data analysis
 * - Work with sales metrics
 * - Learn reporting generation
 * 
 * 📋 REQUIREMENTS:
 * 
 * Product Class:
 * ✅ Private fields:
 *    - productId (String): unique identifier
 *    - name (String): product name
 *    - category (String): product category
 *    - price (double): selling price
 *    - cost (double): production cost
 * 
 * ✅ Constructor:
 *    - Product(productId, name, category, price, cost)
 *    - Validate: price > cost
 * 
 * ✅ Public Methods:
 *    - getProfitMargin(): Return (price - cost) / price * 100
 *    - getProductInfo(): Return formatted product info
 * 
 * Sale Class:
 * ✅ Private fields:
 *    - saleId (String): unique identifier
 *    - product (Product): sold product
 *    - quantity (int): units sold
 *    - saleDate (String): sale date (YYYY-MM-DD)
 *    - salesperson (String): who made sale
 * 
 * ✅ Constructor:
 *    - Sale(product, quantity, saleDate, salesperson)
 *    - Auto-generate saleId
 * 
 * ✅ Public Methods:
 *    - getSaleAmount(): Return product.price * quantity
 *    - getProfit(): Return (product.price - product.cost) * quantity
 *    - getSaleInfo(): Return formatted sale info
 * 
 * SalesAnalytics Class:
 * ✅ Private fields:
 *    - products (ArrayList<Product>): all products
 *    - sales (ArrayList<Sale>): all sales
 * 
 * ✅ Public Methods:
 *    - addProduct(product): Add to catalog
 *    - recordSale(sale): Add sale record
 *    - getTotalRevenue(): Return sum of all sales
 *    - getTotalProfit(): Return sum of all profits
 * 
 * ✅ Reporting Methods:
 *    - getSalesByProduct(productId): Return product sales
 *    - getSalesByCategory(category): Return category sales
 *    - getSalesByDateRange(startDate, endDate): Return filtered sales
 *    - getTopProducts(limit): Return best-selling products
 *    - getSalespersonPerformance(): Return sales by person
 *    - getMonthlySalesReport(month, year): Return monthly summary
 * 
 * 🚀 EXTRA CHALLENGE:
 * - Add sales targets and performance
 * - Implement sales forecasting
 * - Add customer segmentation
 * - Create visual reports
 * 
 * 💡 IMPLEMENTATION TIPS:
 * 1. Start with Product class with profit calculations
 * 2. Create Sale to track individual transactions
 * 3. Build SalesAnalytics for data management
 * 4. Implement various reporting methods
 * 5. Test with sample sales data
 */
 ```

### 🎉 Exercise 20: Social Media Platform Core

```java
/**
 * 🎉 SOCIAL MEDIA PLATFORM CORE
 * 
 * 📝 DESCRIPTION:
 * Build the core functionality of a social media platform with users,
 * posts, comments, and interactions. This exercise focuses on social
 * features and user engagement.
 * 
 * 🎯 LEARNING OBJECTIVES:
 * - Implement social features
 * - Practice user interaction
 * - Work with content management
 * - Learn social algorithms
 * 
 * 📋 REQUIREMENTS:
 * 
 * User Class:
 * ✅ Private fields:
 *    - userId (String): unique identifier
 *    - username (String): display name
 *    - email (String): user email
 *    - friends (ArrayList<User>): user connections
 *    - posts (ArrayList<Post>): user posts
 * 
 * ✅ Constructor:
 *    - User(userId, username, email)
 *    - Initialize empty friends and posts
 * 
 * ✅ Public Methods:
 *    - addFriend(user): Add connection
 *    - removeFriend(userId): Remove connection
 *    - createPost(content): Create new post
 *    - getFriendCount(): Return number of friends
 *    - getUserInfo(): Return formatted user info
 * 
 * Post Class:
 * ✅ Private fields:
 *    - postId (String): unique identifier
 *    - content (String): post content
 *    - author (User): who posted
 *    - timestamp (String): when posted
 *    - likes (ArrayList<User>): who liked
 *    - comments (ArrayList<Comment>): post comments
 * 
 * ✅ Constructor:
 *    - Post(content, author)
 *    - Set timestamp to current time
 *    - Initialize empty likes and comments
 * 
 * ✅ Public Methods:
 *    - addLike(user): Add like
 *    - removeLike(userId): Remove like
 *    - addComment(comment): Add comment
 *    - getLikeCount(): Return number of likes
 *    - getPostInfo(): Return formatted post info
 * 
 * Comment Class:
 * ✅ Private fields:
 *    - commentId (String): unique identifier
 *    - content (String): comment text
 *    - author (User): who commented
 *    - timestamp (String): when commented
 * 
 * SocialMedia Class:
 * ✅ Private fields:
 *    - users (ArrayList<User>): all users
 *    - posts (ArrayList<Post>): all posts
 * 
 * ✅ Public Methods:
 *    - registerUser(userData): Create new user
 *    - createPost(userId, content): User creates post
 *    - likePost(userId, postId): User likes post
 *    - commentOnPost(userId, postId, content): User comments
 *    - getNewsFeed(userId): Return recent posts from friends
 *    - getUserTimeline(userId): Return user's posts
 *    - getPopularPosts(): Return most liked posts
 * 
 * 🚀 EXTRA CHALLENGE:
 * - Add post sharing
 * - Implement direct messaging
 * - Add user profiles with photos
 * - Create content moderation
 * 
 * 💡 IMPLEMENTATION TIPS:
 * 1. Start with User class with friend management
 * 2. Create Post with like and comment functionality
 * 3. Build Comment for user interactions
 * 4. Implement SocialMedia to coordinate everything
 * 5. Test social interactions
 */
 ```
## 🎯 Final Instructions

### ✅ Your Mission:
Choose **ANY 2 exercises** from this pack that interest you the most! 

### 🚀 Implementation Steps:
1. **Read Carefully**: Understand all requirements before coding
2. **Plan Your Approach**: Design your class structure on paper
3. **Start Simple**: Implement basic functionality first
4. **Test Thoroughly**: Verify each method works correctly
5. **Refactor**: Improve your code as you learn more

### 💡 Pro Tips:
- Don't rush - understanding is more important than speed
- Experiment with different approaches
- Ask for help when stuck
- Celebrate your progress! 🎉

### 📞 Need Help?
Remember: The best programmers are those who know how to research and learn independently. Use documentation, online resources, and don't be afraid to experiment!

**Happy Coding!** 🚀✨

---
