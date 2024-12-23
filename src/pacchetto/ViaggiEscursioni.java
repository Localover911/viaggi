package pacchetto;

public class ViaggiEscursioni extends ViaggiPasti {
    private int escursioni;

    public ViaggiEscursioni(String destinazioni, int giorni, int prezzo, boolean isPensioneCompleta, int escursioni) {
        super(destinazioni, giorni, prezzo, isPensioneCompleta);
        this.escursioni = escursioni;
    }
    public void setEscursioni(int escursioni){
        this.escursioni = escursioni;
    }
    public int getEscursioni(){
        return escursioni;
    }
    public void prezzoFinale(){
        if (getIsPensioneCompleta()){
            int prezzoModificato = getPrezzo() + (35*getGiorni()) + (15*getEscursioni());
            setPrezzo(prezzoModificato);
        }
        else {
            int prezzoModificato = getPrezzo() + (25*getGiorni()) + (15*getEscursioni());
            setPrezzo(prezzoModificato);
        }
    }
}
