package katten;

/**
 * @author Taapke Bergsma <t.bergsma@st.hanze.nl>
 */

public class BlijeKat extends Kat{

    public BlijeKat(Bezoeker bezoeker) {
        this.bezoeker = bezoeker;
        this.bezoeker.voegToe(this);
    }

    @Override
    public void update(int aantalSecondes) {
        if (aantalSecondes < 5) {
            System.out.println("Kat rent naar de deur en spint");
        } else {
            System.out.println("Kat rent heel hard en spint heel luid");
        }

    }
}