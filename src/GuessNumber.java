import java.util.Random;
import java.util.Scanner;
public class GuessNumber {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int randomnum=rand.nextInt(10)+1;
        int tries=0;
        int n=5,i;
        for(i=0;i<n;i++)
        {
        	System.out.println("Enter your Guess:(1-10)");
        	int playerguess=sc.nextInt();
        	tries++;
        	if(playerguess==randomnum) {
        		System.out.println("Correct!☻, You win");
        		System.out.println("It took you "+tries+" tries");
        		break;
        	}
        	else if(randomnum>playerguess) {
        		System.out.println("Nope!, The number is Higher than your Guess...Guess Again");
        	}
        	else {
        		System.out.println("Nope!, The number is Smaller than your Guess...Guess Again");
        	}
        }
        if(i==n) {
    		System.out.println("You have crossed the limitations");
    		System.out.println("The number was: "+randomnum);
    	}
	}
}
