package variables;
import java.util.Scanner;
public class Clock {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int hours = (a % (24 * 60 * 60)) / 3600;
            int minutes = (a % (60 * 60)) / 60;
            int seconds = a % 60;
            int hours1 = hours / 10;
            int hours2 = hours % 10;
            int minutes1 = minutes / 10;
            int minutes2 = minutes % 10;
            int seconds1 = seconds / 10;
            int seconds2 = seconds % 10;

            System.out.print(hours1 + "" + hours2 + ":" + minutes1 + "" + minutes2 + ":" + seconds1 + "" + seconds2);
        }
    }

