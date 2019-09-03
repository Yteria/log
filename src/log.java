import java.util.ArrayList;
import java.util.Scanner;

public class log {
    public static void main(String[] args) {
        int w = 1;
        Scanner log = new Scanner(System.in);
        ArrayList<String> logs = new ArrayList<>();
        while (w > 0) {
            PrintMenu();
            int y = log.nextInt();
            if (y == 1){
                String post = log.nextLine();
                logs.add(post);
            } else if (y == 2) {
                System.out.println(logs);
            }

        }
    }

    private static void PrintMenu() {
        System.out.println("Please select a option");
        System.out.println("1. Write post");
        System.out.println("2. Reed logs");
        System.out.println("3. Edit post");
        System.out.println("4. Save");
        System.out.println("5. Load");
        System.out.println("6. Exit");
    }
}
