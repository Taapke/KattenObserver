package katten;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Taapke Bergsma <t.bergsma@st.hanze.nl>
 */

public class Bezoeker {
    private List<Kat> katten = new ArrayList<Kat>();
    private boolean druktOpDeurbel;

    public boolean isDruktOpDeurbel() {
        return druktOpDeurbel;
    }

    public void setDruktOpDeurbel(int aantalSecondes) {
        this.druktOpDeurbel = true;
        brengKattenOpDeHoogte(aantalSecondes);
        this.druktOpDeurbel = false;
    }

    public void voegToe(Kat kat) {
        katten.add(kat);
    }

    public void brengKattenOpDeHoogte(int aantalSecondes) {
        for (Kat kat : katten) {
            kat.update(aantalSecondes);
        }
    }
}
