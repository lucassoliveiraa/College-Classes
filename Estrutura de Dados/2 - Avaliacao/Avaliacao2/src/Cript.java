import java.util.LinkedList;

public class Cript {
    public String criptografar(String texto){
        StringBuilder retorno = new StringBuilder();
        LinkedList<Pilha<Letra>> lista = new LinkedList<Pilha<Letra>>();
        Pilha<Letra> pilhaAtual = new Pilha<Letra>();

        char caracterAtual;
        boolean inseriu;
        for (int i = 0; i < texto.length(); i++) {
            caracterAtual = texto.charAt(i);
            Letra letraAtual = new Letra(caracterAtual, i);
            inseriu = false;

            for (int i2 = 0; i2 < lista.size(); i2++) {
                pilhaAtual = lista.get(i2);
                Letra letraAnalise = pilhaAtual.olhaTopo();

                if (letraAnalise.getLetra() == caracterAtual) {
                    pilhaAtual.empilhar(letraAtual);
                    inseriu = true;
                    break;
                }
            }
            if (!inseriu) {
                pilhaAtual = new Pilha<>();
                pilhaAtual.empilhar(letraAtual);
                lista.add(pilhaAtual);
            }
        }
        for (int i = 0; i < lista.size(); i++) {
            Pilha pilhaDeRetorno = lista.get(i);

            while (!pilhaDeRetorno.vazia()) {
                Letra letraRetorno = (Letra) pilhaDeRetorno.desempilhar();
                retorno.append(letraRetorno.getLetra());
                retorno.append(String.format("%02d", letraRetorno.getPosicao()));
            }
        }
        return retorno.toString();
    }
}
