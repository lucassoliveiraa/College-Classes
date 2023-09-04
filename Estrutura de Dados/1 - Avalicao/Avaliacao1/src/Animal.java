public class Animal {
    private String tipo;
    private String raca;
    private Double peso;

    public Animal() {

    }

    public Animal(String tipo, String raca, Double peso) {
        this.tipo = tipo;
        this.raca = raca;
        this.peso = peso;
    }

    public Double getPeso() {
        return peso;
    }

    public boolean comparaTipo(Animal outro) {
        return this.tipo.equalsIgnoreCase(outro.tipo);
    }

    public boolean comparaRaca(String raca) {
        return this.raca.equalsIgnoreCase(raca);
    }

    @Override
    public String toString() {
        return "\n---------------\n"+
                "Tipo: "+ this.tipo+"\n"+
                "Raca: "+ this.raca+"\n"+
                "Peso:"+ this.peso;
    }
}
