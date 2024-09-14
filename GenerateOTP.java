// Program to generate OTP (One Time Password)

// Class decleration
public class GenerateOTP {

    // Made the function to create a unique OTP everytime
    public static String generateOTP(int len) {

        // All possible characters of my OTP (Uppercase and Lowercase)
        // All possible characters that can appear in the OTP
        String str = "abcdefghijklmnopqrstuvwxyzABCD" + "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        int n = str.length();

        // OTP is initialized as an empty string. It will eventually hold the randomly generated OTP.
        String OTP = "";

        // OTP character is appended to the OTP string.
        for (int i = 1; i <= len; i++) {
            OTP += (str.charAt((int) ((Math.random() * 10) % n)));
        }

        return (OTP);
    }

    // Entry point function
    public static void main(String[] args) {

        // Declare the length of OTP with 6 
        int len = 6;
        System.out.printf("Generated OTP is - %s", generateOTP(len));
    }
}

// # Key Concepts Explained
// 1)Random Number Generation
// =>Math.random() is use to generate a random decimal value between 0 and 1
// => We multiply this value by 10 to get a value between 0 and 10 (inclusive)
// This approach creates a random index for selecting a character from the str.
// 2) String Handling
// charAt(int index) is a method that retrieves a character at a time to the initallly empty OTP string.

