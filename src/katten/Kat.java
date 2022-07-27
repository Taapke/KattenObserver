package katten;

/**
 * @author Taapke Bergsma <t.bergsma@st.hanze.nl>
 */

public abstract class Kat {
    protected Bezoeker bezoeker;
    public abstract void update(int aantalSecondes);
}
