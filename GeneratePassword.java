// Program to generate Password

// Here we demonstrate how to generate a password
// util package is use to generate Random class with random() method to generate the random numbers.
import java.util.*;

// class name : GeneratePassword
public class GeneratePassword {

    // This our Password generating method 
    // We have use static here, so that we not to make any object for it 
    static char[] geek_Password(int len) {
        System.out.println("Generating password using random() : ");
        System.out.print("Your new password is : ");

        // A strong password has Cap_chars, Lower_chars, 
        // numeric value and symbols. So we are using all of 
        // them to generate our password 
        String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Small_chars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*_=+-/.?<>)";

        String values = Capital_chars + Small_chars
                + numbers + symbols;

        // Using random method 
        Random rm = new Random();

        char[] password = new char[len];

        for (int i = 0; i < len; i++) {
            // Use of charAt() method : to get character value 
            // Use of nextInt() as it is scanning the value as int 
            password[i]
                    = values.charAt(rm.nextInt(values.length()));

        }
        return password;
    }

    public static void main(String[] args) {
        // Length of your password as I have choose here to be 10
        int length = 10;
        System.out.println(geek_Password(length));
    }
}
