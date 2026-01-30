import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your birth year (YYYY): ");
        int year = sc.nextInt();
        System.out.print("Enter your birth month (MM): ");
        int month = sc.nextInt();
        System.out.print("Enter your birth day (DD): ");
        int day = sc.nextInt();
        LocalDate birthDate = LocalDate.of(year, month, day);
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(birthDate, currentDate);
        System.out.println("\nYour Age is:");
        System.out.println(age.getYears() + " Years "
                + age.getMonths() + " Months "
                + age.getDays() + " Days");

        sc.close();
    }
}
