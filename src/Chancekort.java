import java.util.Random;

public class Chancekort {

    public String[] kort = new String[14];
    {
        kort[0] = "Ryk frem til start og modtag 400";

        kort[1] = "Ryk 5 felter frem";

        kort[2] = "Ryk frem til Burgerbaren. Hvis det er ledigt, får du det GRATIS! Ellers skal du betale husleje";

        kort[3] = "Ryk et felt frem eller tag et chancekort mere";

        kort[4] = "Du har spist for meget slik. Betal 200";

        kort[5] = "Ryk frem til det nærmeste orange eller grønne felt. Hvis det er ledigt, får du det GRATIS! Ellers skal du betale husleje";

        kort[6] = "Ryk frem til et gråt felt. Hvis det er ledigt, får du det GRATIS! Ellers skal du betale husleje";

        kort[7] = "Du skal i fængsel";

        kort[8] = "Ryk frem til Strandpromenaden";

        kort[9] = "Det er din fødselsdag. Alle giver dig 200. Tillykke med fødselsdagen";

        kort[10] = "Ryk frem til det nærmeste pink eller blåt felt. Hvis det er ledigt, får du det GRATIS! Ellers skal du betale husleje";

        kort[11] = "Du har lavet alle dine lektier. Modtag 400 fra banken";

        kort[12] = "Ryk frem til det nærmeste røde felt. Hvis det er ledigt, får du det GRATIS! Ellers skal du betale husleje";

        kort[13] = "Ryk frem til Skateparken for at lave fedetricks. Hvis det er ledigt, får du det GRATIS! Ellers skal du betale husleje";
    }

    public String trækkort(){
        String[] t = kort;
        String træk = t[0];
        for (int i = 0; i<t.length-1;i++){
            t[i] = t[i+1];
        }
        t[t.length-1]= træk;
        return træk;
    }

    public void blandKort(){
        int into;
        String[] b = new String[14];
        String bland;
        Random ran = new Random();
        for (int i = b.length-1; i>0 ;i--){
            into = ran.nextInt(i);
            bland = b[into];
            b[into] = b[i];
            b[i] = bland;
            //b[i] = this.kort[i];
        }
    }



}
