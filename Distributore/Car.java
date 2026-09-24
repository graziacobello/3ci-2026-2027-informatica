package Distributore;
public class Car {
    private final double kmPerLitro=20.0;
    private final int capienzaSerbatorio=50;
    private double benzinaPresente;
    private int kmPercorsi;
    public Car(){
        benzinaPresente=0.0;
        kmPercorsi=0;
    }

    public void setBenzinaPresente(double benzinaPresente) {
        if (benzinaPresente>=0.0) this.benzinaPresente = benzinaPresente;
    }
    public String toString(){
        String out="";
        out+= " la benzina presente è "+ benzinaPresente;
        out+= "\ne i km percorsi sono: "+kmPercorsi;
        return out;
    }
}
