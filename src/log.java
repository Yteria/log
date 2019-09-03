import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class log {
    public static void main(String[] args) {
        int w = 1;
        Scanner log = new Scanner(System.in);
        ArrayList<String> logs = new ArrayList<>();

        while (w > 0) {
            PrintMenu();
            int y = log.nextInt();
            log.nextLine();
            w = Answer(w, log, logs, y);

        }
    }

    private static int Answer(int w, Scanner log, ArrayList<String> logs, int y) {
        if (y == 1){
            LocalDateTime date = LocalDateTime.now();
            DateTimeFormatter form = DateTimeFormatter.ofPattern( "dd-MM-yyyy HH:mm");
            String formattedDate = date.format(form);
            System.out.println("Please write a post");
            String post = log.nextLine();
            logs.add(formattedDate + " " + post);
        } else if (y == 2) {
            System.out.println("Current logs");
            System.out.println(logs);
        } else  if (y == 3) {
            System.out.println("Edit post");

        } else if (y == 4) {
            System.out.println("Save");
            System.out.println("WIP");
        } else if (y == 5) {
            System.out.println("Load");
            System.out.println("WIP");
        } else if (y == 6) {
            w = 0;
        } else {
            System.out.println("Illegal action");
        }
        return w;
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
