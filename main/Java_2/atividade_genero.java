import java.util.Scanner;
public class atividade_genero {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        char gender = ' ';
        int femaleCounter, maleCounter;

        femaleCounter = 0; maleCounter = 0;

        for (int i = 0; i < 7; i++)
        {
            do 
            {
                System.out.print("Gender:");
                gender = input.nextLine().charAt(0);
                gender = Character.toUpperCase(gender);

                if (gender != 'F' && gender != 'M'){
                    System.out.println("Invalid.");
                }
            } while (gender != 'F' && gender != 'M');
            if (gender == 'F'){
                femaleCounter++;
            }
            else {
                maleCounter++;
            }
        }
        System.out.printf("Amout of male people: %d\n", maleCounter);
        System.out.printf("Amout of female people: %d", femaleCounter);
    }
}
