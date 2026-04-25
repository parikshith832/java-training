package SchoolManagementSystem;

import java.util.Scanner;
import java.sql.*;

public class schoolManagementSystem {
    private static final String url = "jdbc:mysql://localhost:3306/School_management_system";
    private static final String username = "root";
    private static final String password = "root123";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("School Management System");
                System.out.println("1. Get Admission");
                System.out.println("2. View Admission");
                System.out.println("3. Get Registration ID");
                System.out.println("4. update Admission");
                System.out.println("5. delete Admission");
                System.out.println("6. Exit");
                int choice = scanner.nextInt();
            }
            switch (choice) {
                case 1:
                    getAdmission(connection, scanner);
                    break;
                case 2:
                    viewAdmission(connection);
                    break;
                case 3:
                    getRegistratiom(connection, scanner);
                    break;
                case 4:
                    update(connection, scanner);
                    break;
                case 5:
                    delete(connection, scanner);
                    break;
                case 6:
                    exit();
                    scanner.close();
                    return;
                default:
                    System.out.println("Wrong choice");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void getAdmission(Connection connection, Scanner scanner) {
        try {
            scanner.nextLine();
            System.out.println("Enter the Student name:");
            String studentname = scanner.nextLine();
            System.out.println("Enter the Branch name:");
            String branch = scanner.nextLine();
            System.out.println("Enter the address:");
            String address = scanner.nextLine();
            System.out.println("Enter the contact number:");
            String contactNumber = scanner.next();

            String sql = "INSERT INTO reservation (student_name , branch_name, address,contact) VALUES ('"
                    + studentname + "', " + branch + ", '" + address + "', " + contactNumber + ", '" + "')";

            Statement statement = connection.createStatement();
            int rows = statement.executeUpdate(sql);

            if (rows > 0) {
                System.out.println("Admission Successful");

            } else {
                System.out.println("Admission Failed");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void viewAdmission(Connection connection) {
        try {
            String sql = "SELECT admission_id, student_name , branch_name, address,contact, admission_date FROM students";

            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            System.out.println("\nCurrent Reservations:");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("reservation_id") + " | " +
                                rs.getString("guest_name") + " | " +
                                rs.getInt("room_number") + " | " +
                                rs.getString("contact_number") + " | " +
                                rs.getTimestamp("reservation_date")
                );
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
