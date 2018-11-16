import gui_fields.GUI_Field;
import gui_fields.GUI_Street;
import gui_main.GUI;

import java.awt.*;

public class GameBoard {
    public static void main(String[] args) {
        GUI_Field[] fields = new GUI_Field[2];




        //Dette er så simpelt som det kan blive.
        GUI_Street testStreet1= new GUI_Street();
        testStreet1.setTitle("Anker Engelundsvej");
        testStreet1.setBorder(Color.CYAN); //Useful to show owner
        testStreet1.setRent("600,-");
        testStreet1.setSubText("");
        fields[0] = testStreet1;



        //Der tilføjes et par værdier.

        GUI_Street testStreet= new GUI_Street();
        testStreet.setTitle("Anker Engelundsvej");
        testStreet.setBorder(Color.CYAN); //Useful to show owner
        testStreet.setRent("600,-");
        testStreet.setSubText("");
        fields[1] = testStreet;


        GUI gui = new GUI(fields,Color.BLACK);


    }
}