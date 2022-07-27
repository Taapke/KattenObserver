package katten;

/**
 * @author Taapke Bergsma <t.bergsma@st.hanze.nl>
 */

public class BangeKat extends Kat{

    public BangeKat(Bezoeker bezoeker) {
        this.bezoeker = bezoeker;
        this.bezoeker.voegToe(this);
    }

    @Override
    public void update(int aantalSecondes) {
        if (aantalSecondes < 5) {
            System.out.println("Kat slaapt rustig door.");
        } else {
            System.out.println("Kat rent weg en kruipt onder het bed.");
        }

    }
}
