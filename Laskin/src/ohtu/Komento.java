package ohtu;

import javax.swing.JTextField;

public abstract class Komento {

    protected Sovelluslogiikka sovellus;
    protected JTextField tuloskentta;
    protected JTextField syotekentta;
    protected int edellinenArvo;

    public Komento(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
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
        setEdellinenArvo(arvo);
        return arvo;
    }

    int getTulos() {
        return sovellus.tulos();
    }

    int getEdellinenArvo() {
        return edellinenArvo;
    }

    void setEdellinenArvo(int arvo) {
        this.edellinenArvo = arvo;
    }

    void setArvo() {
        int laskunTulos = sovellus.tulos();

        syotekentta.setText("");
        tuloskentta.setText("" + laskunTulos);
    }

    void setTulos(int arvo) {
        tuloskentta.setText("" + arvo);
    }

    protected abstract void suorita();

    protected abstract void peru();
}
