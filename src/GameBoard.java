import gui_fields.*;
import gui_main.GUI;
import gui_tests.ImageFrame;

import java.awt.*;

public class GameBoard {
    public static void main(String[] args) {
        GUI_Field[] fields = new GUI_Field[24];

        //Opretter en placeholder for alle felter
        for (int i = 1; i < 24; i++) {
            fields[i] = new GUI_Street();
        }

        GUI_Start start = new GUI_Start();
        fields[0] = start;
        start.setTitle("Start");
        start.setSubText("Modtag: 400");

/**
 * 1. felt
 */
        GUI_Street Street = new GUI_Street();
        Street.setTitle("Burgerbaren");
        Street.setBackGroundColor(Color.ORANGE);
        Street.setRent("100,-");
        Street.setDescription("");
        Street.setTextColor(Color.black);
        Street.setSubText("Pris: 100");
        fields[1] = Street;

/**
 * 2. felt
 */
        GUI_Street Street1 = new GUI_Street();
        Street1.setTitle("Pizzahuset");
        Street1.setBackGroundColor(Color.ORANGE);
        Street1.setRent("100");
        Street1.setDescription("");
        Street1.setTextColor(Color.black);
        Street1.setSubText("Pris: 100");
        fields[2] = Street1;

/**
 * 3. felt - Chancekort (Ikke færdig)
 */
        GUI_Chance Street2 = new GUI_Chance();
        Street2.getTitle();
        Street2.setDescription("");
        Street2.setSubText("Chance");

        fields[3] = Street2;


/**
 * 4. felt
 */
        GUI_Street Street3 = new GUI_Street();
        Street3.setTitle("Slikbutikken");
        Street3.setBackGroundColor(Color.red);
        Street3.setRent("100");
        Street3.setDescription("");
        Street3.setTextColor(Color.black);
        Street3.setSubText("Pris: 100");
        fields[4] = Street3;










        GUI gui = new GUI(fields);

        //Player1 skal erstattes med vores array af spillere (eks. "Player[]")
        GUI_Player player1 = new GUI_Player("Player 1");
        gui.addPlayer(player1);


        //En lille demo
        player1.setBalance(1000);
        fields[0].setCar(player1, true);
        gui.showMessage("Slå med terningerne");
        fields[0].setCar(player1, false);
        gui.setDice(1, 1);

        player1.setBalance(400);
        fields[2].setCar(player1, true);
        gui.showMessage("Næste kast");
        fields[2].setCar(player1, false);
        gui.setDice(3, 1);

        player1.setBalance(0);
        fields[6].setCar(player1, true);
        gui.showMessage("Test slut");
        fields[6].setCar(player1, false);

    }
}