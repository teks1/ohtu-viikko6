package ohtu;

import javax.swing.JTextField;

public abstract class Komento {

    protected Sovelluslogiikka sovellus;
    protected JTextField tuloskentta;
    protected JTextField syotekentta;

    public Komento(Sovelluslogiikka sovellus, JTextField syotekentta, JTextField tuloskentta) {
        this.sovellus = sovellus;
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
    }

    int getArvo() {
        int arvo = 0;

        try {
            arvo = Integer.parseInt(syotekentta.getText());
        } catch (Exception e) {
        }
        return arvo;
    }

    void setArvo() {
        int laskunTulos = sovellus.tulos();

        syotekentta.setText("");
        tuloskentta.setText("" + laskunTulos);
    }

    protected abstract void suorita();
}
