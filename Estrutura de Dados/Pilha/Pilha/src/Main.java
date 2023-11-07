public class Main {
    public static void main(String[] args) {
        Peca a = new Peca("A");
        Peca b = new Peca("B");
        Peca c = new Peca("C");
        Peca d = new Peca("D");

        Pilha<Peca> pilha = new Pilha<Peca>();
        pilha.insere(a);
        pilha.insere(b);
        pilha.insere(c);
        pilha.insere(d);
        System.out.println(pilha);
        System.out.println(pilha.verificaElemento(b));
    }
}
