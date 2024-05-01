import java.util.Scanner;

public class Atividade_05 {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int agechecker;

        System.out.print("Please enter your age:");
        agechecker = input.nextInt();

        if (agechecker >= 18) {
            System.out.print("You're in legal age");
        } else {
            System.out.print("Sorry, you aren't in the legal age yet.");
        }

    }
}
