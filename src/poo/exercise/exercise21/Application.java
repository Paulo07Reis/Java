package poo.exercise.exercise21;

import poo.exercise.exercise21.entities.Reservation;
import poo.exercise.exercise21.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Room: ");
            int number = sc.nextInt();

            System.out.print("Check-in date (dd/mm/yyyy): ");
            Date checkIn = sdf.parse(sc.next());

            System.out.print("Check-out date (dd/mm/yyyy): ");
            Date checkOut = sdf.parse(sc.next());

            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation: ");

            System.out.print("Check-in date (dd/mm/yyyy): ");
            checkIn = sdf.parse(sc.next());

            System.out.print("Check-out date (dd/mm/yyyy): ");
            checkOut = sdf.parse(sc.next());

            reservation.updateDates(checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
        } catch (ParseException e){
            System.out.println("Invalid date format");
        } catch (DomainException e) {
            System.out.println("Error in reservation: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Unexpected error");
        }
        sc.close();
    }

}
