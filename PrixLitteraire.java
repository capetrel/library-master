package td2Class.bibliotheque;

public enum PrixLitteraire {
    GONCOURT("a"),
    MEDICIS("b"),
    INTERALLIE("c");

    private String champ;

    PrixLitteraire(String champ) {
        this.champ = champ;
    }

}

