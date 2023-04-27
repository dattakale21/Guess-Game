// ******************************** Guess Game *******************************

// Gussing the number:-
import java.util.*; // --> it is universal, it contains all the things.
// import java.util.random.*; 

class Guess {
    public int a;
    public int b;
    public int guess = 0; // --> initially the number of guesses is 0

    void get() {
        Random ran = new Random(); // --> random object created.
        int lower = 1; // --> starts from 1
        int upper = 101; // --> Ends till 100, Note:- here the 101 will not be chosen.
        a = ran.nextInt(lower, upper); // --> computer input

        System.out.println("*********************** Guess Game **************************");
        while (b != a) {
            System.out.print("Enter your number: ");
            Scanner sc = new Scanner(System.in);
            b = sc.nextInt(); // --> user input
            System.out.println(); // --> line break

            if (b > a) { // --> conditions
                System.out.println("Lower number please!");
            } else if (b < a) {
                System.out.println("Higher number please!");
            } else if (b == a) {
                System.out.println("Congrats!");
                sc.close(); // --> when the user wins then stop the sc object.
            }
            guess++; // --> guess number increment by 1, every time when the while loop calls.
        }
    }

    void no_guess() {
        System.out.println("The number of guesses is " + guess); // --> prints the number of guesses
        System.out.println("Computer choose: " + a); // --> prints random number chose by computer
        System.out.println("You choose: " + b); // --> prints user entered number
    }
}

public class Guess_Game {
    public static void main(String[] args) {
        Guess g = new Guess();
        g.get();
        g.no_guess();
    }
}
