public class Interruttore {
    private Stato2 status;

    public Interruttore(Stato2 status){
        this.status = status;
    }

    public Stato2 getStatus() {
        return status;
    }

    public void setStatus(Stato2 status) {
        this.status = status;
    }
}
