import java.util.Scanner;
public class Number_guess_game {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("***** NUMBER GUESS GAME *****");

        System.out.println("I have chosen a number from 1-100");

        // 1.Generate a secret number
        int secretNumber=(int)(Math.random()*100)+1;

        int attempt=0;

        // 2.Take guess from user as input
        System.out.println("Enter your Guess: ");
        int guess=sc.nextInt();
        attempt++;

        // 3.Compare

        while(guess!=secretNumber){

            if(guess>secretNumber){
                System.out.println("Too High");
            }else{
                System.out.println("Too Low");
            }
            System.out.print("Another guess:");
            guess=sc.nextInt();
            attempt++;
        }

        System.out.println("Congratulations you guessed it .!!!");
        System.out.println("Total Attempts: "+attempt);
    }
}
