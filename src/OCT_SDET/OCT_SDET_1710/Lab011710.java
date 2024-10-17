package OCT_SDET.OCT_SDET_1710;


import java.util.Scanner;

public class Lab011710 {
    public static void main(String args [])
    {
        //int age=20;
        System.out.println("What's ur age:");
        Scanner sc=new Scanner(System.in);
        int age= sc.nextInt();
        if (age < 20)
        {
            System.out.println("Not allowed to vote");
        }
    }
}
