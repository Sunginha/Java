import java.util.Scanner;

public class Atividade_04 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int monthDay, lastDayOfTheMonth;
        
        System.out.print("Day of the month:");
        monthDay = input.nextInt();

        System.out.print("Last day of the month:");
        lastDayOfTheMonth = input.nextInt();

        if (monthDay > 15 && monthDay <= lastDayOfTheMonth) {
            System.out.print("Second half of the month");
        } else {
            System.out.print("First half of the month");
        }
    }
}   
