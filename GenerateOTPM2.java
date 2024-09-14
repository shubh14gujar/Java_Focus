// Program to generate OTP Method 2 (One Time Password)

// Here we demonstrate how to generate a OTP
// util package is use to generate Random class with random() method to generate the random numbers.
import java.util.*;

// class in Java 
public class GenerateOTPM2 {

    public static char[] OTP(int len) {
        System.out.println("Generating OTP using random() : ");
        System.out.print("You OTP is : ");

        // Using numeric values 
        String numbers = "0123456789";

        // Using random method 
        // to generate random indexes to pick digits from the numbers string.
        Random rm = new Random();

        char[] otp = new char[len];

        for (int i = 0; i < len; i++) {
            // Use of charAt() method : to get character value 
            // Use of nextInt() as it is scanning the value as int 
            otp[i]
                    = numbers.charAt(rm.nextInt(numbers.length()));
        }
        return otp;
    }

    public static void main(String[] args) {
        int length = 4;
        System.out.println(OTP(length));
    }
}
