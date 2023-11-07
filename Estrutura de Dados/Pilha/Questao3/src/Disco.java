public class Disco {
    private String cor;
    private int tamanho;

    public Disco(String cor, int tamanho) 
    {
        this.cor = cor;
        this.tamanho = tamanho;
    }
    public String toString()
    {   
        return "{ " + "Cor: " + this.cor.toString() + " Tamanho: " + this.tamanho + " }" + "\n";
    }
}