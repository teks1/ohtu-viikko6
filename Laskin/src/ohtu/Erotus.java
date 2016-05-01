package ohtu;

import javax.swing.JTextField;

public class Erotus extends Komento {

    public Erotus(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        super(sovellus, tuloskentta, syotekentta);
    }

    @Override
    public void suorita() {
        sovellus.miinus(this.getArvo());
        this.setArvo();
    }

    @Override
    protected void peru() {
        sovellus.plus(this.getEdellinenArvo());
        this.setArvo();
    }
}
