import java.util.Scanner;

public class Input {
    private java.util.Scanner Scanner = new Scanner(System.in);
    private String kast = "";

    //private DiceCup dice = new DiceCup(); todo det er måske smartere at have selve kastet i den klasse, hvor vi opbygger, hvad en tur indebærer.

    private boolean wrongin() {
        boolean wrong = false;
        if (!kast.equals("2")) {  //tjekker for korrekt input
            System.out.println("Forkert input...");
            wrong = true;
        }
        return wrong;
    }

    private void throwDice() {       //todo forstår stadig ikke helt, om vi burde lave en get-metode til denne type funktioner, eller om den bare skal være public, eftersom der jo ikke er nogle variabler med.
        do {
            System.out.println("Tast 2 for at kaste terningen:");
            kast = Scanner.nextLine();
        } while (wrongin());
        //dice.getcup();
    }

    int inSpil(){
        int k=0;
        //while (k==0) {
            if (Scanner.hasNextInt()) {
                k = Scanner.nextInt();
            } else {System.out.println("Prøv igen");}
        //}
        if (k>4){
            k=4;
        }else if(k<2){
            k=2;
        }
        return k;
    }

}
