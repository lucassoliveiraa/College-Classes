
public class Main {
    public static void main(String[] args) {
        Aluno a = new Aluno("Pedro");
        Aluno b = new Aluno("Joao");
        Aluno c = new Aluno("August");

        Policial d = new Policial();
        Policial e = new Policial();
        
        FilaGenerics<Aluno> fila = new FilaGenerics<Aluno>();
        fila.insere(a);
        fila.insere(b);
        fila.insere(c);    
        }
}
