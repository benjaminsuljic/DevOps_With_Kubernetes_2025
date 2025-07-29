import java.time.Instant;
import java.util.UUID;

public class LogOutput {
    private static final String randomString = UUID.randomUUID().toString();
    
    public static void main(String[] args) {
        //System.out.println("Generated random string on startup: " + randomString);
        
        while (true) {
            String timestamp = Instant.now().toString();
            System.out.println(timestamp + ": " + randomString);
            
            try {
                Thread.sleep(5000); // Sleep for 5 seconds
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
} 