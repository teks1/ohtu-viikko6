package ohtu;

import javax.swing.JTextField;

public class Summa extends Komento {

    public Summa(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        super(sovellus, tuloskentta, syotekentta);
    }

    @Override
    public void suorita() {
        sovellus.plus(this.getArvo());
        this.setArvo();
    }

}
