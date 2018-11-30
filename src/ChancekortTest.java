import static org.junit.Assert.*;

public class ChancekortTest {

    @org.junit.Test
    public void trækkort() {
        //Vores trækkort trækker et kort, samt sørger for, at det er et nyt kort, man trækker næste gang.
        Chancekort chance = new Chancekort();
        String old = "";
        for (int i = 0; i < 100; i++) {
            String ny = chance.trækkort();
            System.out.println(ny);
            assertTrue(!old.equals(ny));
            old = ny;
        }
    }

    @org.junit.Test
    public void blandKort1() {
    }
}