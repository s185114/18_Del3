public class Players {
    private String name;
    private int color;
    private int balance;
    private boolean win;

    public void Spiller() {
        balance=0;
        win=false;
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




    // spiller= new Players[3];

    /**
     * bare lige en hurtig skitse, hvis det skal være, kan banken også flyttes ud til sin egen klasse, hvor spilleren så kan oprette en indstans af banken, men dette ville nok ikke være specielt mere GFRASP end det her.
     */

}
