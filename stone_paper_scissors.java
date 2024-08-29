import java.util.Random;
import java.util.Scanner;

public class sps{
    public static void main(String[] args) {

        System.out.println("*****THIS IS MY FIRST MINI JAVA PROJECT*****");
        // 0 represents stone/rock 1 represents paper and 2 represents scissor

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your move 0 = Rock/stone , 1 = Paper, 2 = Scissor");
        int userinput = sc.nextInt();

        Random random = new Random();
        int computerinput = random.nextInt(3);

        if (userinput == computerinput) {
            System.out.println("draw");
        } else if (userinput == 0 && computerinput == 2 || userinput == 1 && computerinput == 0
                || userinput == 2 && computerinput == 1) {
            System.out.println("You win!!!");
        } else {
            System.out.println("Computer Win!!!");
        }

        if (computerinput == 0) {
            System.out.println("Computer Choice : Rock");
        } else if (computerinput == 1) {
            System.out.println("Computer Choice : Paper");
        } else if (computerinput == 2) {
            System.out.println("Computer Choice : Scissor");
        }
        sc.close();

    }
}
