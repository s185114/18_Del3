import gui_fields.*;
import gui_main.GUI;
import gui_tests.ImageFrame;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GameBoard {
    public static void main(String[] args) {
        GUI_Field[] fields = new GUI_Field[24];

        //Opretter en placeholder for alle felter
        for (int i = 1; i < 24; i++) {
            fields[i] = new GUI_Street();
        }

        // Start felt
        GUI_Start start = new GUI_Start();
        fields[0] = start;
        start.setTitle("Start");
        start.setSubText("Modtag: 400");

 /**
 * 2. felt
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
 * 3. felt
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
 * 4. felt - Chancekort (Ikke færdig)
 */
        GUI_Chance Street2 = new GUI_Chance();
        Street2.getTitle();
        Street2.setDescription("");
        Street2.setSubText("Chance");
        fields[3] = Street2;


/**
 * 5. felt
 */
        GUI_Street Street3 = new GUI_Street();
        Street3.setTitle("Slikbutikken");
        Street3.setBackGroundColor(Color.gray);
        Street3.setRent("150");
        Street3.setDescription("");
        Street3.setTextColor(Color.black);
        Street3.setSubText("Pris: 150");
        fields[4] = Street3;

/**
 * 6. felt
 */
        GUI_Street Street4 = new GUI_Street();
        Street4.setTitle("Iskiosken");
        Street4.setBackGroundColor(Color.gray);
        Street4.setRent("150");
        Street4.setDescription("");
        Street4.setTextColor(Color.black);
        Street4.setSubText("Pris: 150");
        fields[5] = Street4;

/**
 * 7. felt - Fængsel (Ikke lavet...)
 */
        GUI_Jail Street5 = new GUI_Jail();
        Street5.setTitle("Fængsel");
        Street5.setDescription("Du skal i fængsel!");
        Street5.setSubText("Fængsel");
        fields[6] = Street5;


/**
 * 8. felt
 */
        GUI_Street Street6 = new GUI_Street();
        Street6.setTitle("Museet");
        Street6.setBackGroundColor(Color.pink);
        Street6.setRent("200");
        Street6.setDescription("");
        Street6.setTextColor(Color.black);
        Street6.setSubText("Pris: 200");
        fields[7] = Street6;

/**
 * 9. felt
 */
        GUI_Street Street7 = new GUI_Street();
        Street7.setTitle("Bibloteket");
        Street7.setBackGroundColor(Color.pink);
        Street7.setRent("200");
        Street7.setDescription("");
        Street7.setTextColor(Color.black);
        Street7.setSubText("Pris: 200");
        fields[8] = Street7;

/**
* 10. felt - Chance (Ikke færdig)
*/
        GUI_Chance Street8 = new GUI_Chance();
        Street8.getTitle();
        Street8.setDescription("");
        Street8.setSubText("Chance");
        fields[9] = Street8;

/**
 * 11. felt
 */
        GUI_Street Street9 = new GUI_Street();
        Street9.setTitle("Skaterparken");
        Street9.setBackGroundColor(Color.yellow);
        Street9.setRent("250");
        Street9.setDescription("");
        Street9.setTextColor(Color.black);
        Street9.setSubText("Pris: 250");
        fields[10] = Street9;

/**
 * 12. felt
 */
        GUI_Street Street10 = new GUI_Street();
        Street10.setTitle("Svømmebassin");
        Street10.setBackGroundColor(Color.yellow);
        Street10.setRent("250");
        Street10.setDescription("");
        Street10.setTextColor(Color.black);
        Street10.setSubText("Pris: 250");
        fields[11] = Street10;


/**
 * 13. felt - Gratis parkering (Ikke lavet....)
 */
        GUI_Street Street11 = new GUI_Street();
        Street11.setTitle("Gratis Parkering");
        Street11.setRent("");
        Street11.setDescription("");
        Street11.setTextColor(Color.black);
        Street11.setSubText("Gratis parkering");
        fields[12] = Street11;

/**
 * 14. felt
 */
        GUI_Street Street12 = new GUI_Street();
        Street12.setTitle("Spillehallen");
        Street12.setBackGroundColor(Color.red);
        Street12.setRent("300");
        Street12.setDescription("");
        Street12.setTextColor(Color.black);
        Street12.setSubText("Pris: 300");
        fields[13] = Street12;

/**
 * 15. felt
 */
        GUI_Street Street13 = new GUI_Street();
        Street13.setTitle("Biografen");
        Street13.setBackGroundColor(Color.red);
        Street13.setRent("300");
        Street13.setDescription("");
        Street13.setTextColor(Color.black);
        Street13.setSubText("Pris: 300");
        fields[14] = Street13;

/**
 * 16. felt
 */
        GUI_Chance Street14 = new GUI_Chance();
        Street14.getTitle();
        Street14.setDescription("");
        Street14.setSubText("Chance");
        fields[15] = Street14;

/**
 * 17. felt
 */
        GUI_Street Street15 = new GUI_Street();
        Street15.setTitle("Legetøjsbutikken");
        Street15.setBackGroundColor(Color.yellow);
        Street15.setRent("350");
        Street15.setDescription("");
        Street15.setTextColor(Color.black);
        Street15.setSubText("Pris: 350");
        fields[16] = Street15;

/**
 * 18. felt
 */
        GUI_Street Street16 = new GUI_Street();
        Street16.setTitle("Dyrehandlen");
        Street16.setBackGroundColor(Color.yellow);
        Street16.setRent("350");
        Street16.setDescription("");
        Street16.setTextColor(Color.black);
        Street16.setSubText("Pris: 350");
        fields[17] = Street16;

/**
 * 19. felt - Gå i fængsel (Ikke lavet...)
 */
        GUI_Jail Street17 = new GUI_Jail();
        Street17.setTitle("Fængsel");
        Street17.setDescription("Du skal i fængsel!");
        Street17.setSubText("Fængsel");
        fields[18] = Street17;

/**
 * 20. felt
 */
        GUI_Street Street18 = new GUI_Street();
        Street18.setTitle("Bowlinghallen");
        Street18.setBackGroundColor(Color.green);
        Street18.setRent("400");
        Street18.setDescription("");
        Street18.setTextColor(Color.black);
        Street18.setSubText("Pris: 400");
        fields[19] = Street18;

/**
 * 21. felt
 */
        GUI_Street Street19 = new GUI_Street();
        Street19.setTitle("Zoologisk have");
        Street19.setBackGroundColor(Color.green);
        Street19.setRent("400");
        Street19.setDescription("");
        Street19.setTextColor(Color.black);
        Street19.setSubText("Pris: 400");
        fields[20] = Street19;

/**
 * 22. felt - Chance (Ikke færdig..)
 */
        GUI_Chance Street20 = new GUI_Chance();
        Street20.getTitle();
        Street20.setDescription("");
        Street20.setSubText("Chance");
        fields[21] = Street20;

/**
 * 23. felt
 */
        GUI_Street Street21 = new GUI_Street();
        Street21.setTitle("Vandlandet");
        Street21.setBackGroundColor(Color.blue);
        Street21.setRent("450");
        Street21.setDescription("");
        Street21.setTextColor(Color.black);
        Street21.setSubText("Pris: 450");
        fields[22] = Street21;

/**
 * 24. felt
 */
        GUI_Street Street22 = new GUI_Street();
        Street22.setTitle("Strandpromenaden");
        Street22.setBackGroundColor(Color.blue);
        Street22.setRent("450");
        Street22.setDescription("");
        Street22.setTextColor(Color.black);
        Street22.setSubText("Pris: 450");
        fields[23] = Street22;


        GUI gui = new GUI(fields);


          int x =2;
        GUI_Player[] player = {new GUI_Player("Player 1"), new GUI_Player("Player 2"), new GUI_Player("Player 3"), new GUI_Player("Player 4")};
      /*  gui.addPlayer(player[0]);
        gui.addPlayer(player[1]);
        gui.addPlayer(player[2]);
        gui.addPlayer(player[3]);
*/
//En lille demo
        int antalSpillere=gui.getUserInteger("Indtast antal spillere", 2, 4);
        for (int i=0; i<antalSpillere; i++){
            gui.addPlayer(player[i]);
        }
        player[x].setBalance(1000);
        fields[0].setCar(player[x], true);
        gui.showMessage("Slå med terningerne");
        fields[0].setCar(player[x], false);
        gui.setDice(1, 1);

        player[x].setBalance(400);
        fields[2].setCar(player[x], true);
        gui.showMessage("Næste kast");
        fields[2].setCar(player[x], false);
        gui.setDice(3, 1);

        player[x].setBalance(0);
        fields[6].setCar(player[x], true);
        gui.showMessage("Test slut");
        fields[6].setCar(player[x], false);


    }
}