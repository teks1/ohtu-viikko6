package ohtu;

import javax.swing.JTextField;

public class Nollaa extends Komento {

    public Nollaa(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        super(sovellus, syotekentta, tuloskentta);
    }

    @Override
    protected void suorita() {
        this.setEdellinenArvo(this.getTulos());
        sovellus.nollaa();
        this.setArvo();
    }

    @Override
    protected void peru() {
        this.setTulos(this.getEdellinenArvo());
    }

}
