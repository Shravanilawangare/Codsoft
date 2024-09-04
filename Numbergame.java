import java.util.Scanner;

public class Numbergame {
     public static void main(String[] args) {
        @SuppressWarnings("resource")
        final
        Scanner sc=new Scanner(System.in);
        final int chances=10;
        int finals=0;
        boolean playAgain=true;

        System.out.println("Welcome");
        System.out.println("hello!!You have about "+ chances +" chances to win the game.");
        while (playAgain) {
            final int ran= getRandN(0,100);
            boolean guess=false;
            for(int i=0;i<chances;i++){
                System.out.println("chance"+ (i+1) +":Enter your guess:");
                final int user=sc.nextInt();
                if(user == ran){
                    guess=true;
                    finals++;
                    System.out.println("you won!!");
                    break;
                }else if(user > ran){
                    System.out.println("too high");
                }else{
                    System.out.println("too low");
                }
            }
            if(!guess){
                System.out.println("You lost the all chances.The number was y" + ran);

            }
            System.out.println("Do you want to play again?(y/n)");
            final String playAgainResponse=sc.next();
            playAgain = playAgainResponse.equalsIgnoreCase("y");

        }
        System.out.println("Hope you enjoyed the game");
        System.out.println("your Score:" + finals);
    }
    public static int getRandN(final int min,final int max){
        return (int)(Math.random()*(max-min+1)+min);
    }
}
