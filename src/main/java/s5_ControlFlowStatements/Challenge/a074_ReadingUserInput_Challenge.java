package s5_ControlFlowStatements.Challenge;

import java.util.Scanner;

public class a074_ReadingUserInput_Challenge {
    public static void main(String[] args) {

        int count = 1;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        while (count <= 10) {
            System.out.println("Enter number #" + count);
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int enteredValue = scanner.nextInt();
                sum += enteredValue;
                count++;
            } else {
                System.out.println("Invalid Number");
//                count++;           // Jeśli chce 10 wprowadzen to odkomentować. Jeśli 10 intów to comment
            }
            scanner.nextLine();     // Tę linię pierwotnie wpisałem w ifa. Przez to po wpisaniu litery
                                    // pętla jechała do końca spamując Invalid value ponieważ
                                    // hasNextInt ciągle było na false :/ Przeniosłem po podpowiedzi
        }
        System.out.println("\n" + "Sum of entered numbers is " + sum);
        scanner.close();
    }
}


