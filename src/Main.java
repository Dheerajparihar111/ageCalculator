import java.util.*;
public class Main {
    static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("ENTER YOUR AGE");
        int age = input.nextInt();
        if (age >18){
            System.out.println("you are adult");
        } else if (age<18 && age >14) {
            System.out.println("you are teenager");
        }else {
            System.out.println("you are kid");
        }
    }
}