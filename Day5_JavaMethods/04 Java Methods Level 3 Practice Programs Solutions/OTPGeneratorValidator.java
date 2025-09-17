// Question: Generate 6-digit OTP 10 times and ensure uniqueness

import java.util.HashSet;
import java.util.Random;

public class OTPGeneratorValidator {

    public static int generate6DigitOTP() {
        return new Random().nextInt(900000) + 100000;
    }

    public static boolean validateUniqueOTPs(int[] otps) {
        HashSet<Integer> uniqueSet = new HashSet<>();
        for (int otp : otps) uniqueSet.add(otp);
        return uniqueSet.size() == otps.length;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];
        for (int i = 0; i < 10; i++) {
            otps[i] = generate6DigitOTP();
        }

        System.out.println("Generated OTPs:");
        for (int otp : otps) System.out.println(otp);

        System.out.println("All OTPs Unique: " + validateUniqueOTPs(otps));
    }
}
