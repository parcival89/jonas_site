package be.jonas.domain.olifant;

public class Olifant {
    private final String naam;

    public Olifant(String naam) {
        if(naam == null){
            throw new IllegalArgumentException("naam mag niet null zijn!");
        }
        this.naam = naam;
    }

    public String roepNaam(){
        return this.naam.toUpperCase();
    }
}
