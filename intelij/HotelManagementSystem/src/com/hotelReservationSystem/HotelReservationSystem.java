package com.hotelReservationSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class HotelReservationSystem {

    private static final String url = "jdbc:mysql://localhost:3306/hotel_reservation_system";
    private static final String username = "root";
    private static final String password = "root123";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, username, password);
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("\nHotel Reservation System");
                System.out.println("1. Reserve Room");
                System.out.println("2. View Reservations");
                System.out.println("3. Get Room Number");
                System.out.println("4. Update Reservation");
                System.out.println("5. Delete Reservation");
                System.out.println("6. Exit");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1 -> reserveRoom(connection, scanner);
                    case 2 -> viewReservation(connection);
                    case 3 -> getRoomNumber(connection, scanner);
                    case 4 -> updateReservation(connection, scanner);
                    case 5 -> deleteReservation(connection, scanner);
                    case 6 -> {
                        exit();
                        scanner.close();
                        return;
                    }
                    default -> System.out.println("Invalid choice");
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void reserveRoom(Connection connection, Scanner scanner) {
        try {
            scanner.nextLine();

            System.out.println("Enter the guest name:");
            String guestName = scanner.nextLine();

            System.out.println("Enter the room number:");
            int roomNumber = scanner.nextInt();

            System.out.println("Enter the contact number:");
            String contactNumber = scanner.next();

            String sql = "INSERT INTO reservation (guest_name, room_number, contact_number) VALUES ('"
                    + guestName + "', " + roomNumber + ", '" + contactNumber + "')";

            Statement statement = connection.createStatement();
            int rows = statement.executeUpdate(sql);

            if (rows > 0) {
                System.out.println("Reservation Successful");
                System.out.println();
            } else {
                System.out.println("Reservation Failed");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void viewReservation(Connection connection) {
        try {
            String sql = "SELECT reservation_id, guest_name, room_number, contact_number, reservation_date FROM reservation";

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

    private static void getRoomNumber(Connection connection, Scanner scanner) {
        try {
            System.out.println("Enter Reservation ID:");
            int reservationId = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter Guest Name:");
            String guestName = scanner.nextLine();

            String sql = "SELECT room_number FROM reservation WHERE reservation_id = "
                    + reservationId + " AND guest_name = '" + guestName + "'";

            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            if (rs.next()) {
                System.out.println("Room Number: " + rs.getInt("room_number"));
            } else {
                System.out.println("No reservation found.");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void updateReservation(Connection connection, Scanner scanner) {
        try {
            System.out.println("Enter Reservation ID:");
            int reservationId = scanner.nextInt();
            scanner.nextLine();

            if (!reservationExists(connection, reservationId)) {
                System.out.println("Reservation not found");
                return;
            }

            System.out.println("Enter new Guest Name:");
            String newGuestName = scanner.nextLine();

            System.out.println("Enter new Room Number:");
            int newRoomNumber = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter new Contact Number:");
            String newContactNumber = scanner.nextLine();

            String sql = "UPDATE reservation SET guest_name = '" + newGuestName +
                    "', room_number = " + newRoomNumber +
                    ", contact_number = '" + newContactNumber +
                    "' WHERE reservation_id = " + reservationId;

            Statement statement = connection.createStatement();
            int rows = statement.executeUpdate(sql);

            if (rows > 0) {
                System.out.println("Reservation updated successfully");
            } else {
                System.out.println("Update failed");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void deleteReservation(Connection connection, Scanner scanner) {
        try {
            System.out.println("Enter Reservation ID:");
            int reservationId = scanner.nextInt();

            if (!reservationExists(connection, reservationId)) {
                System.out.println("Reservation not found");
                return;
            }

            String sql = "DELETE FROM reservation WHERE reservation_id = " + reservationId;

            Statement statement = connection.createStatement();
            int rows = statement.executeUpdate(sql);

            if (rows > 0) {
                System.out.println("Reservation deleted successfully");
            } else {
                System.out.println("Deletion failed");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static boolean reservationExists(Connection connection, int reservationId) {
        try {
            String sql = "SELECT reservation_id FROM reservation WHERE reservation_id = " + reservationId;

            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            return rs.next();

        } catch (Exception e) {
            return false;
        }
    }

    private static void exit() throws InterruptedException {
        System.out.print("Exiting");
        for (int i = 0; i < 5; i++) {
            System.out.print(".");
            Thread.sleep(500);
        }
        System.out.println("\nThank you for using the system!");
    }
}