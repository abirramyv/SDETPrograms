package OCT_SDET.OCT_SDET_1510;

public class Task11510 {
    public static void main (String args [])
    {
        int a=22;
        int b=9;
        int c=70;
        int result= (a>b && a>c)? a:(b>c? b:c);
        //int result= (a>=b && a>=c)? a:(b>=c? b:c);
        System.out.println("The greatest number is: "+result);
    }
}
