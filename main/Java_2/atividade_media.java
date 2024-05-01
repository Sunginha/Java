import java.util.Scanner;
public class atividade_media {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int age; 
        float agesum, ageCalculator;
        agesum = 0;

        
        for (int i = 0; i < 5; i++)
        {
            do {
                System.out.print("Age:");
                age = input.nextInt();
                if (age < 0){
                    System.out.println("Invalid age.");
                }
            } while (age < 0);

            agesum += age;
        }
        ageCalculator = agesum / 5;

        System.out.print(ageCalculator);
    }
}
