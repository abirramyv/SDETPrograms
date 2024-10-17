package OCT_SDET.OCT_SDET_1710;

import java.util.Scanner;

public class Lab021710 {
    public static void main(String args[])
    {
        System.out.println("Enter ur age please: ");
        Scanner sc= new Scanner(System.in);
        int age= sc.nextInt();
        if(age>=18)
        {
            System.out.println("YES, U R ELIGIBLE TO VOTE");
        }
        else
        {
            System.out.println("Sorry, not eligible to vote. you have to wait "+(18-age)+" more years");
        }
    }
}
