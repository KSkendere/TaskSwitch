import java.util.Scanner;

public class TaskSwitch2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input number of dy of the week and press enter:");

        int dayOfTheWeek = scanner.nextInt();

        if ((dayOfTheWeek < 0) || (dayOfTheWeek > 8)) {
            System.out.println("Day of the week must be form 1 till 7");
        } else {

            switch (dayOfTheWeek) {
                case 1:
                    System.out.println("Today is workday");
                    break;
                case 2:
                    System.out.println("Today is workday");
                    break;
                case 3:
                    System.out.println("Today is workday");
                    break;
                case 4:
                    System.out.println("Today is workday");
                    break;
                case 5:
                    System.out.println("Today is workday");
                    break;
                case 6:
                    System.out.println("Today is holiday");
                    break;
                case 7:
                    System.out.println("Today is holiday");
                    break;
                default:
                    System.out.println("Error");
                }
            }

        }

    }

