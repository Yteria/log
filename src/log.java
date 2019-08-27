import java.util.ArrayList;
import java.util.Scanner;

public class log {
    public static void main(String[] args) {
        int w = 1;
        Scanner log = new Scanner(System.in);
        ArrayList<String> logs = new ArrayList<>();
        while (w > 0) {
            int y = 0;
            System.out.println("Please select a option");
            System.out.println("1. Write post");
            System.out.println("2. Reed logs");
            int y = log.nextInt();
            if (y == 1){
                String post = log.nextLine();
                logs.add(post);
            } else if (y == 2) {
                System.out.println(logs);
            }

        }
    }
}
