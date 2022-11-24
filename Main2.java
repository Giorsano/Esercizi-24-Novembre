public class Main2 {
    public static void main(String[] args) {
    Lampadina2 lampadina2 = new Lampadina2(new Interruttore(Stato2.OFF), new Interruttore(Stato2.ON));
        System.out.println(lampadina2);
    lampadina2.accendi();
        System.out.println(lampadina2);
        lampadina2.spegni();
        System.out.println(lampadina2);
        lampadina2.accendi();
        System.out.println(lampadina2);
        lampadina2.spegni();
        System.out.println(lampadina2);
    }
}
