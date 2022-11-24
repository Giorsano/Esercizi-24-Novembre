public class Lampadina {
    private int contatore = 0;
    private Stato status = Stato.OFF;


    public Lampadina(){
        this.contatore = contatore;
        this.status = status;
    }

    public void accendi(){
        if(status == Stato.OFF){
            status = Stato.ON;
            contatore++;
        } else {
            System.out.println("Lampadina gia accesa");
        }
        if(contatore == 10){
            status = Stato.BROKEN;
        }
    }

    public void spegni(){
        if(status == Stato.ON){
            status = Stato.OFF;
            contatore++;
        } else {
            System.out.println("Lampadina gia spenta");
        }
        if(contatore == 10){
            status = Stato.BROKEN;
        }

    }

    public String toString(){
    String s = String.valueOf(status);
    return s;
    }

    public int getContatore() {
        return contatore;
    }

    public Stato getStatus() {
        return status;
    }

    public void setContatore(int contatore) {
        this.contatore = contatore;
    }

    public void setStatus(Stato status) {
        this.status = status;
    }
}
