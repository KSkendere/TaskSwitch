import java.util.Scanner;

public class TaskSwitch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input day and press enter");
        int day = scanner.nextInt();
        System.out.println("The day number is " + day);
        if ((day < 0) || (day > 365)) {
            System.out.println("Day can not be negative and bigger than 365");
        } else {
            int month = (int) (Math.ceil(day / 30)+1);
            System.out.println("Month number is " + month);
            switch (month) {
                case 1:
                    System.out.println("It is January");
                    break;
                case 2:
                    System.out.println("It is February");
                    break;
                case 3:
                    System.out.println("It is March");
                    break;
                case 4:
                    System.out.println("It is April");
                    break;
                case 5:
                    System.out.println("It is May");
                    break;
                case 6:
                    System.out.println("It is June");
                    break;
                case 7:
                    System.out.println("It is July");
                    break;
                case 8:
                    System.out.println("It is August");
                    break;
                case 9:
                    System.out.println("It is September");
                    break;
                case 10:
                    System.out.println("It is October");
                    break;
                case 11:
                    System.out.println("It is November");
                    break;
                case 12:
                    System.out.println("It is December");
                    break;
            }
        }
    }
}



