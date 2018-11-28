public class Players {
    private String name;
    private int color;
    private int balance;
    private boolean win;

    public void spiller(int a) {
        balance=0;
        win=false;
        colour(a);
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        if (balance < 0) {
            this.balance = 0;
        } else
            this.balance = balance;
    }

    /**
     * bare lige en hurtig skitse, hvis det skal være, kan banken også flyttes ud til sin egen klasse, hvor spilleren så kan oprette en indstans af banken, men dette ville nok ikke være specielt mere GFRASP end det her.
     */

    //todo dette er et forslag til, hvordan vi kan have forskellige brikker til hver spiller, a=antal spillere, color er en ID for brikken (navne skal nok ændres).
    private void colour(int a){
        for(int i=1;i>=a;i++){
            color =i;
        }
    }
}
