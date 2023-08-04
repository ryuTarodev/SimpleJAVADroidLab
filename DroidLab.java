
import java.util.Scanner;

public class DroidLab {
    public static void main(String[] args) {
        Droid bot1 = new Droid("chatgpt");
        // Droid bot2 = new Droid("openai");
        // Droid bot3 = new Droid("diffision");
        // Battery Default == 100

        while (true) {
            System.out.print("Droid is performing - ");
            Scanner taskScanner = new Scanner(System.in);
            String performTask = taskScanner.nextLine();

            if (performTask.equals("STOP")) {
                break;
            } else {
                bot1.performingTask(performTask);
            }
        }

        System.out.println("Droid - " + bot1.getName() + " : " + bot1.getBattery());
        // After recharge
        System.out.println("Droid - " + bot1.getName() + " : " + bot1.chargingBot(20));

    }

}
