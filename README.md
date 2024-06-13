# Fantasy Fittings

Fantasy Fittings is a comprehensive application designed to manage a cosplay renting shop. It helps streamline the process of renting, managing inventory, registering users, and maintaining transaction records.

## Features

- **User Registration and Authentication**: Secure user registration and login functionality.
- **Inventory Management**: Add, edit, delete, and view cosplay costumes and accessories.
- **Renting System**: Efficiently manage the renting process including checking availability, booking, and returns.
- **Transaction Records**: Maintain detailed records of all transactions for auditing and reporting purposes.
- **User Interface**: Intuitive and user-friendly interface for both admin and customers.

## Getting Started

### Prerequisites

- **Java Development Kit (JDK)**: Make sure you have JDK installed. You can download it from [here](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
- **MySQL Database**: Install MySQL for database support. You can download it from [here](https://dev.mysql.com/downloads/).
- **NetBeans IDE** (optional but recommended): Download from [here](https://netbeans.apache.org/download/index.html).

### Installation

1. **Clone the Repository**:
    ```sh
    git clone https://github.com/yourusername/FantasyFittings.git
    cd FantasyFittings
    ```

2. **Database Setup**:
    - Create a MySQL database for the application.
    - Import the database schema from the provided SQL file:
      ```sh
      mysql -u yourusername -p yourdatabase < schema.sql
      ```

3. **Configure Database Connection**:
    - Update the `koneksiDB` class with your MySQL database credentials.

4. **Build and Run the Application**:
    - Open the project in NetBeans (or your preferred IDE).
    - Build and run the project.

## Usage

### User Registration

1. Open the application.
2. Click on the "Register" button.
3. Fill in the registration form with the required details.
4. Submit the form to create a new user account.

### Login

1. Open the application.
2. Enter your username and password.
3. Click on the "Login" button to access the application.

### Managing Inventory

1. After logging in as an admin, navigate to the inventory management section.
2. Add new cosplay items by filling in the item details.
3. Edit or delete existing items as needed.

### Renting a Cosplay

1. Browse the available cosplay items.
2. Select the item you want to rent.
3. Check the availability and proceed with the booking.
4. Complete the renting process and record the transaction.

## Contributing

We welcome contributions! Please fork the repository and submit pull requests for any features, improvements, or bug fixes.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Contact

For any questions or support, please open an issue or contact us at support@fantasyfittings.com.

---

**Fantasy Fittings** - Manage your cosplay renting shop with ease!
