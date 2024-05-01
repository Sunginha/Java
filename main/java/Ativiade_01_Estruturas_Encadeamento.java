import java.util.Scanner;
public class Ativiade_01_Estruturas_Encadeamento 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Double  workerSalary;
        int sindicateMemberChecker;

        final Double MINIMUMSALARY = 1412.0;
        final Double CONSTANTOFCONTRIBUTION = 0.033;

        do {
            System.out.print("Salary:");
            workerSalary = input.nextDouble();
            if (workerSalary < MINIMUMSALARY)
            {
                System.out.println("Invalid Salary, try again.");
            }
        } while (workerSalary < MINIMUMSALARY);

        final Double SINDICATECONTRIBUTIONCALCULATOR = workerSalary * CONSTANTOFCONTRIBUTION;
        final Double SALARYAFTERCONTRIBUTION = workerSalary - SINDICATECONTRIBUTIONCALCULATOR;

        do {
            System.out.print("Do you make part of the Sindicate? [0] No [1] Yes \nAwnser:");
            sindicateMemberChecker = input.nextInt();
            if (sindicateMemberChecker < 0 || sindicateMemberChecker > 1){
                System.out.println("Invalid Number.");
            }
        } while (sindicateMemberChecker < 0 || sindicateMemberChecker > 1);



        if (sindicateMemberChecker == 1){
            
            System.out.printf("Your Contribution is: R$" + "%.2f\n", SINDICATECONTRIBUTIONCALCULATOR);

            System.out.print("Your Salary will be: R$" + SALARYAFTERCONTRIBUTION);
        } else {
            System.out.print("Your Salary: R$" + workerSalary);
        }
    } 
 }

