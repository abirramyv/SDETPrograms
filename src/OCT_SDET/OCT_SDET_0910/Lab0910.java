package OCT_SDET.OCT_SDET_0910;

public class Lab0910 {
    public static void main (String args [])
    {
        /*
        byte b=11;
        short s= 300;
        int i= -7;
        */

        // Primitive Data Type
        byte b  = 111; // 8 bits, 1 Byte
        short s  = -127; // 16 bits, 2 Byte
        int i = 600; // 32 bits, 4 Byte
        long roll_no = 119775665; // 64 Bits, 8 Bytes
        char grade = 'A'; // 'A', b, c , e, d, el -> ASCII value - int - assigned.
        // 16 Bits, 2 Byte
        float pi = 3.14F; // 32 Bits, 4 Byte
        double d = 110.9878898; // 64 Bites, 8 Bytes


        // Non primitive Data Types (user defined)
        String program = "java"; // String - bunch of char(collection of chars)
        // Array, Class- User Data Types. - 64 Bits, 8 Byte
        System.out.println("byte "+b);
        System.out.println("short "+s);
        System.out.println("integer "+i);
        System.out.println("long "+roll_no);
        System.out.println("character (stores ASCII) "+grade);
        System.out.println("float "+pi);
        System.out.println("double "+d);
        System.out.println("programing language "+program);

    }
}
