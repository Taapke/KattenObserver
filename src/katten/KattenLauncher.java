package katten;

/**
 * @author Taapke Bergsma <t.bergsma@st.hanze.nl>
 */

public class KattenLauncher {
    public static void main(String[] args) {
        Bezoeker bezoeker = new Bezoeker();

        new BangeKat(bezoeker);
        new BlijeKat(bezoeker);
        new LuideKat(bezoeker);

        System.out.println("Bezoeker drukt op deurbel");
        bezoeker.setDruktOpDeurbel(2);
        bezoeker.setDruktOpDeurbel(10);
    }
}
