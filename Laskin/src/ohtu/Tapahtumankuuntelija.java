package ohtu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Tapahtumankuuntelija implements ActionListener {

    private JButton nollaa;
    private JButton undo;
    private Sovelluslogiikka sovellus;
    private Map<JButton, Komento> komennot;

    public Tapahtumankuuntelija(JButton plus, JButton miinus, JButton nollaa, JButton undo, JTextField tuloskentta, JTextField syotekentta) {
        this.nollaa = nollaa;
        this.undo = undo;
        this.sovellus = new Sovelluslogiikka();
        this.komennot = new HashMap<>();
        komennot.put(plus, new Summa(sovellus, syotekentta, tuloskentta));
        komennot.put(miinus, new Erotus(sovellus, syotekentta, tuloskentta));
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Komento komento = komennot.get(ae.getSource());
        if (komento != null) {
            komento.suorita();
        }
        

    }

}
