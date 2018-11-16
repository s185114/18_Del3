import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_fields.GUI_Street;
import gui_main.GUI;

import java.awt.*;

public class GameBoard {
    public static void main(String[] args) {
        GUI_Field[] fields = new GUI_Field[20];

        //Opretter en placeholder for alle felter
        for (int i=1; i<20; i++){
            fields[i]= new GUI_Street();
        }

        //Dette er så simpelt som det kan blive.
        GUI_Street Street1= new GUI_Street();
        Street1.setTitle("Anker Engelundsvej");
        Street1.setBorder(Color.RED); //Useful to show owner
        Street1.setRent("600,-");
        Street1.setSubText("");
        fields[0] = Street1;

        //Der tilføjes et par værdier.
        GUI_Street Street2= new GUI_Street();
        Street2.setTitle("Anker Engelundsvej");
        Street2.setBorder(Color.CYAN); //Useful to show owner
        Street2.setRent("600,-");
        Street2.setSubText("");
        fields[1] = Street2;

        GUI gui = new GUI(fields,Color.BLACK);

        //Player1 skal erstattes med vores array af spillere (eks. "Player[]")
        GUI_Player player1 = new GUI_Player("Player 1");
        gui.addPlayer(player1);


        //En lille demo
        player1.setBalance(1000);
        fields[0].setCar(player1, true);
        gui.showMessage("Slå med terningerne");
        fields[0].setCar(player1, false);
        gui.setDice(1,1);

        player1.setBalance(400);
        fields[2].setCar(player1, true);
        gui.showMessage("Næste kast");
        fields[2].setCar(player1, false);
        gui.setDice(3,1);

        player1.setBalance(0);
        fields[6].setCar(player1, true);
        gui.showMessage("Test slut");
        fields[6].setCar(player1, false);

    }
}