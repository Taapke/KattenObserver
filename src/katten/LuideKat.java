package katten;

/**
 * @author Taapke Bergsma <t.bergsma@st.hanze.nl>
 */

public class LuideKat extends Kat{

    public LuideKat(Bezoeker bezoeker) {
        this.bezoeker = bezoeker;
        this.bezoeker.voegToe(this);
    }

    @Override
    public void update(int aantalSecondes) {
        if (aantalSecondes < 5) {
            System.out.println("Kat blijft stil.");
        } else {
            System.out.println("MIAUW MIAUW MIAUW!");
        }
    }
}