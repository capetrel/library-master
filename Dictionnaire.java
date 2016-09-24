package td2Class.bibliotheque;

public class Dictionnaire extends Document {

    private Langue langue;

    public Dictionnaire(int num, String titre, Langue langue) {
        super(num, titre);
        this.langue = langue;
    }

    public Langue getLangue() {
        return langue;
    }

    public void setLangue(Langue langue) {
        this.langue = langue;
    }

    public String toString()    {
        return "Dictionnaire : " + super.toString() + " (" + langue + ")";
    }

}
