public class Lampadina2 {
    private Interruttore interruttore;
    private Interruttore interruttore2;
    private Stato2 stato2 = Stato2.OFF;

    public Lampadina2(Interruttore interruttore, Interruttore interruttore2){
        this.interruttore = interruttore;
        this.interruttore2 = interruttore2;
    }

    public void accendi(){
        if(stato2 == Stato2.OFF && interruttore.getStatus() == Stato2.OFF){
            stato2 = Stato2.ON;
            interruttore.setStatus(Stato2.ON);
            interruttore2 = interruttore;
        }
    }

    public void spegni(){
        if(stato2 == Stato2.ON && interruttore2.getStatus() == Stato2.ON){
            stato2 = Stato2.OFF;
            interruttore.setStatus(Stato2.OFF);
            interruttore = interruttore2;
        }
    }

    public String toString(){
        String s = "Stato lampadina: " + stato2;
        return s;
    }
}
