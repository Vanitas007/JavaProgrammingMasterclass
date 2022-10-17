package s5_ControlFlowStatements.Challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class a075_MinAndMax_Challenge {
    public static void main(String[] args) {

//        Moje rozwiązanie
        ArrayList<Integer> number = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter number: ");
            boolean isInt = scanner.hasNextInt();
            if (isInt) {
                number.add(scanner.nextInt());
            } else {
                System.out.println("Invalid value");
                break;
            }
            scanner.nextLine();   // handle input
        }
        Collections.sort(number);
        System.out.println("min: " + number.get(0) + ", max: " + number.get(number.size() - 1));
        scanner.close();
    }
}

//        Rozwiązanie z neta
//        Scanner scanner = new Scanner(System.in);
//        int min = 0;
//        int max = 0;
//        boolean first = true;
//        while (true) {
//            System.out.println("Enter number: ");
//            boolean isInt = scanner.hasNextInt();
//            if (isInt) {
//                int number = scanner.nextInt();
//                if (first) {
//                    first = false;
//                    min = number;
//                    max = number;
//                }
//                if (number > max) {
//                    max = number;
//                }
//                if (number < min) {
//                    min = number;
//                }
//            } else {
//                System.out.println("Invalid value");
//                break;
//            }
//            scanner.nextLine();     // handle input
//        }
//        System.out.println("min: " + min + ", max: " + max);
//        scanner.close();
//    }
//}


//        Inne rozwiązanie z neta. Zamiast if(first) zmienne min i max mają skrajne wartości inta
//        Scanner scanner = new Scanner(System.in);
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//        boolean first = true;
//        while (true) {
//            System.out.println("Enter number: ");
//            boolean isInt = scanner.hasNextInt();
//            if (isInt) {
//                int number = scanner.nextInt();
//                if (number > max) {
//                    max = number;
//                }
//                if (number < min) {
//                    min = number;
//                }
//            } else {
//                System.out.println("Invalid value");
//                break;
//            }
//            scanner.nextLine();     // handle input
//        }
//        System.out.println("min: " + min + ", max: " + max);
//        scanner.close();
//    }
//}