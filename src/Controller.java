public class Controller {

    private Input in = new Input();
    private Players player = new Players();

    void passende_navn(){
        System.out.println("Hvor mange spiller spillet?");
        int a = in.inSpil();
        for(int i=1;i>=a;i++){
            player.spiller(i);
        }
        System.out.println("Antal spillere= "+a);
    }
}