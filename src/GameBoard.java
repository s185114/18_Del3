import gui_fields.*;
import gui_main.GUI;

import java.awt.*;

public class GameBoard {
    public static void main(String[] args) {
        GUI_Field[] fields = new GUI_Field[24];
        Chancekort Chance = new Chancekort();

        // Start felt
        GUI_Start start = new GUI_Start();
        fields[0] = start;
        start.setTitle("Start");
        start.setSubText("Modtag: 400");

        //2. felt
        GUI_Street Street = new GUI_Street();
        Street.setTitle("Burgerbaren");
        Street.setBackGroundColor(Color.ORANGE);
        Street.setRent("100");
        Street.setDescription("");
        Street.setSubText("Pris: 100");
        fields[1] = Street;

        //3. felt
        GUI_Street Street1 = new GUI_Street();
        Street1.setTitle("Pizzahuset");
        Street1.setBackGroundColor(Color.ORANGE);
        Street1.setRent("100");
        Street1.setDescription("");
        Street1.setSubText("Pris: 100");
        Street1.getOwnerName();
        fields[2] = Street1;

        //4. felt - Chancekort
        GUI_Chance Street2 = new GUI_Chance();
        Street2.setDescription("Træk et chancekort");
        Street2.setSubText("Chance");
        fields[3] = Street2;

        //5. felt
        GUI_Street Street3 = new GUI_Street();
        Street3.setTitle("Slikbutikken");
        Street3.setBackGroundColor(Color.gray);
        Street3.setRent("150");
        Street3.setDescription("");
        Street3.setSubText("Pris: 150");
        fields[4] = Street3;

        //6. felt
        GUI_Street Street4 = new GUI_Street();
        Street4.setTitle("Iskiosken");
        Street4.setBackGroundColor(Color.gray);
        Street4.setRent("150");
        Street4.setDescription("");
        Street4.setSubText("Pris: 150");
        fields[5] = Street4;

        //7. felt - Fængsel
        GUI_Jail Street5 = new GUI_Jail();
        Street5.setTitle("Fængsel");
        Street5.setDescription("Hvis du lander her er du på bare på besøg i fængslet.");
        Street5.setSubText("Fængsel");
        fields[6] = Street5;

        //8. felt
        GUI_Street Street6 = new GUI_Street();
        Street6.setTitle("Museet");
        Street6.setBackGroundColor(Color.pink);
        Street6.setRent("200");
        Street6.setDescription("");
        Street6.setSubText("Pris: 200");
        fields[7] = Street6;

        //9. felt
        GUI_Street Street7 = new GUI_Street();
        Street7.setTitle("Bibloteket");
        Street7.setBackGroundColor(Color.pink);
        Street7.setRent("200");
        Street7.setDescription("");
        Street7.setSubText("Pris: 200");
        fields[8] = Street7;

        //10. felt - Chance
        GUI_Chance Street8 = new GUI_Chance();
        Street8.setDescription("Træk et chancekort");
        Street8.setSubText("Chance");
        fields[9] = Street8;

        //11. felt
        GUI_Street Street9 = new GUI_Street();
        Street9.setTitle("Skaterparken");
        Street9.setBackGroundColor(Color.yellow);
        Street9.setRent("250");
        Street9.setDescription("");
        Street9.setSubText("Pris: 250");
        fields[10] = Street9;

        //12. felt
        GUI_Street Street10 = new GUI_Street();
        Street10.setTitle("Svømmebassin");
        Street10.setBackGroundColor(Color.yellow);
        Street10.setRent("250");
        Street10.setDescription("");
        Street10.setSubText("Pris: 250");
        fields[11] = Street10;

        //13. felt - Gratis parkering
        GUI_Street Street11 = new GUI_Street();
        Street11.setTitle("Gratis Parkering");
        Street11.setDescription("");
        Street11.setSubText("Gratis parkering");
        fields[12] = Street11;

        //14. felt
        GUI_Street Street12 = new GUI_Street();
        Street12.setTitle("Spillehallen");
        Street12.setBackGroundColor(Color.red);
        Street12.setRent("300");
        Street12.setDescription("");
        Street12.setSubText("Pris: 300");
        fields[13] = Street12;

        //15. felt
        GUI_Street Street13 = new GUI_Street();
        Street13.setTitle("Biografen");
        Street13.setBackGroundColor(Color.red);
        Street13.setRent("300");
        Street13.setDescription("");
        Street13.setSubText("Pris: 300");
        fields[14] = Street13;

        //16. felt
        GUI_Chance Street14 = new GUI_Chance();
        Street14.setDescription("Træk et chancekort");
        Street14.setSubText("Chance");
        fields[15] = Street14;

        // 17. felt
        GUI_Street Street15 = new GUI_Street();
        Street15.setTitle("Legetøjsbutikken");
        Street15.setBackGroundColor(Color.yellow);
        Street15.setRent("350");
        Street15.setDescription("");
        Street15.setSubText("Pris: 350");
        fields[16] = Street15;

        //18. felt
        GUI_Street Street16 = new GUI_Street();
        Street16.setTitle("Dyrehandlen");
        Street16.setBackGroundColor(Color.yellow);
        Street16.setRent("350");
        Street16.setDescription("");
        Street16.setSubText("Pris: 350");
        fields[17] = Street16;

        //19. felt - Gå i fængsel
        GUI_Jail Street17 = new GUI_Jail();
        Street17.setTitle("Gå i fængsel");
        Street17.setDescription("Du skal i fængsel!");
        Street17.setSubText("Gå i fængsel");
        fields[18] = Street17;

        //20. felt
        GUI_Street Street18 = new GUI_Street();
        Street18.setTitle("Bowlinghallen");
        Street18.setBackGroundColor(Color.green);
        Street18.setRent("400");
        Street18.setDescription("");
        Street18.setSubText("Pris: 400");
        fields[19] = Street18;

        //21. felt
        GUI_Street Street19 = new GUI_Street();
        Street19.setTitle("Zoologisk have");
        Street19.setBackGroundColor(Color.green);
        Street19.setRent("400");
        Street19.setDescription("");
        Street19.setSubText("Pris: 400");
        fields[20] = Street19;

        //22. felt - Chance
        GUI_Chance Street20 = new GUI_Chance();
        Street20.setDescription("Træk et chancekort");
        Street20.setSubText("Chance");
        fields[21] = Street20;

        //23. felt
        GUI_Street Street21 = new GUI_Street();
        Street21.setTitle("Vandlandet");
        Street21.setBackGroundColor(Color.cyan);
        Street21.setRent("450");
        Street21.setDescription("");
        Street21.setSubText("Pris: 450");
        fields[22] = Street21;

        //24. felt
        GUI_Street Street22 = new GUI_Street();
        Street22.setTitle("Strandpromenaden");
        Street22.setBackGroundColor(Color.cyan);
        Street22.setRent("450");
        Street22.setDescription("");
        Street22.setSubText("Pris: 450");
        fields[23] = Street22;

        GUI gui = new GUI(fields);


        // Lav din egen bil WOOHOOOOOO!
        GUI_Car car1 = new GUI_Car(Color.RED, Color.RED, GUI_Car.Type.CAR, GUI_Car.Pattern.FILL);
        GUI_Car car2 = new GUI_Car(Color.BLUE, Color.BLUE, GUI_Car.Type.RACECAR, GUI_Car.Pattern.FILL);
        GUI_Car car3 = new GUI_Car(Color.YELLOW, Color.YELLOW, GUI_Car.Type.TRACTOR, GUI_Car.Pattern.FILL);
        GUI_Car car4 = new GUI_Car(Color.BLACK, Color.BLACK, GUI_Car.Type.UFO, GUI_Car.Pattern.FILL);

        // for at vælge navn kan vi bruge metoden getUserString
        GUI_Player[] player = {new GUI_Player("Player 1", 10, car1), new GUI_Player("Player 2", 1000, car2), new GUI_Player("Player 3", 1000, car3), new GUI_Player("Player 4", 1000, car4)};

        //Introduktion
        gui.showMessage("Introduktion");

        // Her vælger man hvor mange spillere der skal være med.
        int antalSpillere = gui.getUserInteger("Indtast antal spillere", 2, 4);
        for (int i = 0; i < antalSpillere; i++) {
            gui.addPlayer(player[i]);
            fields[0].setCar(player[i], true);
        }
        int[] Ryk = new int[antalSpillere];
        int[] OldRyk = new int[antalSpillere];
        int OldPlayer = 0;
        boolean ja;
        boolean ja1;
        String kort;
// Her får vi spillerne til at slå på skift.
        for (int i = 0; i < antalSpillere; i++) {
            while (player[i].getBalance() > 0) {
                for (int j = 0; j < antalSpillere; j++) {
                    if (player[OldPlayer].getBalance() > 0) {
                        OldRyk[j] = Ryk[j];
                        // Definere et terningeslag.
                        int Terningeslag = 1;

                        // Går at man kan rykke fremad på banen.
                        Ryk[j] += Terningeslag;

                        gui.showMessage("Slå med terningen");
                        fields[OldRyk[j]].setCar(player[j], false);

                        // Går sådan at man kan loope banen igennem.
                        if (Ryk[j] > 23) {
                            Ryk[j] = (Ryk[j] % 23) - 1;

                            //Når man passere/lander på start får man +400 på kontoen.
                            player[j].setBalance(player[j].getBalance() + 400);
                        }

                        //Fængsel ellers opdater placering
                        if (Ryk[j] == 18) {
                            fields[6].setCar(player[j], true);
                            gui.showMessage("Du kørte for stærkt og skal i fængsel!");
                            Ryk[j] = 6;
                        } else {
                            fields[Ryk[j]].setCar(player[j], true);
                        }

                        // Printer terningen i gui.
                        gui.setDie(Terningeslag);

                        //For køb af grund TODO
                        if (Ryk[j] == 2) {
                            String rent = Street1.getRent();
                            if(Street1.getOwnerName()==null) {
                                ja = gui.getUserLeftButtonPressed("Vil du købe grunden", "ja", "nej");
                                if (ja) {
                                    player[j].setBalance(player[j].getBalance() - Integer.valueOf(rent));
                                    Street1.setOwnerName(player[j].getName());
                                }
                            }else{
                                if(Street1.getOwnerName() == player[j].getName()){
                                }else{
                                    for(int c=0;c<antalSpillere;c++) {
                                        if (Street1.getOwnerName() == player[c].getName()) {
                                            player[c].setBalance(player[c].getBalance() + Integer.valueOf(rent)/2);
                                            System.out.println("Hej jeg er sand");
                                        }
                                    }
                                    player[j].setBalance(player[j].getBalance() - Integer.valueOf(rent)/2);
                                }
                            }

                        }





                        //For at trække chancekort TODO
                        if (Ryk[j] == 3 || Ryk[j] == 9 || Ryk[j] == 15 || Ryk[j] == 21) {
                            Chance.blandKort();
                            System.out.println(Chance.kort[0]);
                            System.out.println(Chance.kort[1]);
                            kort=Chance.trækkort();
                            gui.displayChanceCard(kort);



                            if(kort == Chance.kort[0]){
                                fields[0].setCar(player[j], true);
                                Ryk[j] = 0;
                            }
                            if(kort == Chance.kort[1]){
                                fields[Ryk[j]+ 5].setCar(player[j], true);
                                Ryk[j] = Ryk[j] + 5;
                            }
                            if(kort == Chance.kort[2]){
                                fields[1].setCar(player[j], true);
                                Ryk[j] = 1;
                                //Der skal tilføjes at man får den gratis hvis den er ledig
                                //if()
                            }
                            if(kort == Chance.kort[3]){
                                ja1 = gui.getUserLeftButtonPressed("1 felt eller 1 Chancekort","1 felt", "1 Chancekort");
                                if(ja1){
                                    fields[Ryk[j]+ 1].setCar(player[j], true);
                                    Ryk[j] = Ryk[j] + 1;
                                }
                                else{
                                    Chance.trækkort();
                                }
                            }
                            if(kort == Chance.kort[4]){
                                player[j].setBalance(player[j].getBalance() - 200);
                            }
                            if(kort == Chance.kort[5]){

                            }
                            if(kort == Chance.kort[6]){

                            }
                            if(kort == Chance.kort[7]){

                            }
                            if(kort == Chance.kort[8]){

                            }
                            if(kort == Chance.kort[9]){

                            }
                            if(kort == Chance.kort[10]){

                            }
                            if(kort == Chance.kort[11]){

                            }
                            if(kort == Chance.kort[12]){

                            }
                            if(kort == Chance.kort[13]){

                            }
                        }
                    } else {

                        int turn1 = Math.max(player[0].getBalance(), player[1].getBalance());
                        int turn2 = Math.max(player[2].getBalance(), player[3].getBalance());
                        int winner = Math.max(turn1, turn2);
                        String GameWinner = "";
                        String GameWinner1 = "";
                        String GameWinner2 = "";
                        String GameWinner3 = "";

                        if (antalSpillere == 2) {
                            if (winner == player[0].getBalance()) {
                                GameWinner = player[0].getName() + " ";
                            }
                            if (winner == player[1].getBalance()) {
                                GameWinner1 = player[1].getName() + " ";
                            }
                        } else if (antalSpillere == 3) {
                            if (winner == player[0].getBalance()) {
                                GameWinner = player[0].getName() + " ";
                            }
                            if (winner == player[1].getBalance()) {
                                GameWinner1 = player[1].getName() + " ";
                            }
                            if (winner == player[2].getBalance()) {
                                GameWinner2 = player[2].getName() + " ";
                            }
                        } else if (antalSpillere == 4) {
                            if (winner == player[0].getBalance()) {
                                GameWinner = player[0].getName() + " ";
                            }
                            if (winner == player[1].getBalance()) {
                                GameWinner1 = player[1].getName() + " ";
                            }
                            if (winner == player[2].getBalance()) {
                                GameWinner2 = player[2].getName() + " ";
                            }
                            if (winner == player[3].getBalance()) {
                                GameWinner3 = player[3].getName() + " ";
                            }
                        }


                        gui.showMessage(GameWinner + GameWinner1 + GameWinner2 + GameWinner3 + "har vundet.");
                        System.exit(0);
                    }
                    OldPlayer = j;
                }
            }
        }
        //bare for at teste valg af spillerantal
        Controller c = new Controller();
        c.passende_navn();


    }
}