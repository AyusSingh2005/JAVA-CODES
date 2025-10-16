//package Projects;
//
//import com.twilio.Twilio;
//import com.twilio.rest.api.v2010.account.Message;
//import com.twilio.type.PhoneNumber;
//
//import java.security.SecureRandom;
//
//public class OTPGENERATER {
//
//    // Twilio credentials (for testing; use environment variables for production)
//    public static final String ACCOUNT_SID = "AC0dceeaeb4cf91b4897f418207d892c35";
//    public static final String AUTH_TOKEN = "04873f37bb7ecef7c8c46dbdb9a4f09f";
//
//    // Secure random OTP generator
//    private static final SecureRandom secureRandom = new SecureRandom();
//
//    public static String generateOTP() {
//        int number = secureRandom.nextInt(900000) + 100000; // 6-digit OTP
//        return String.valueOf(number);
//    }
//
//    public static void main(String[] args) {
//
//        // Initialize Twilio
//        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
//
//        // Generate OTP
//        String otp = generateOTP();
//
//        // Send WhatsApp message
//        Message message = Message.creator(
//                new PhoneNumber("whatsapp:+91 9643217116"), // recipient number
//                new PhoneNumber("whatsapp:+13614282426"),  // Twilio sandbox number
//                "🔐 Your OTP code is: " + otp + "\nIt will expire in 5 minutes."
//        ).create();
//
//        // Confirmation logs
//        System.out.println("✅ OTP sent successfully!");
//        System.out.println("Message SID: " + message.getSid());
//        System.out.println("Generated OTP: " + otp);
//    }
//}
