import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("***********wel come to age calculator***********");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your birth year (YYYY): ");
        int year = sc.nextInt();
        System.out.println("Enter your birth month (MM): ");
        int month = sc.nextInt();
        System.out.println("Enter your birth day (DD): ");
        int day = sc.nextInt();
        LocalDate birthDate = LocalDate.of(year, month, day);
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(birthDate, currentDate);
        System.out.println("\nYour Age is:");
        System.out.println(age.getYears() + " Years "
                + age.getMonths() + " Months "
                + age.getDays() + " Days");
        if (age.getYears()>18){
            if ( age.getYears() < 60) {
                System.out.println("you are adult");
            }else {
                System.out.println("you are senior citizen");
            }
        }else {
            System.out.println("child");
        }


        System.out.println("thank you for using age calculator");
        sc.close();
    }
}
