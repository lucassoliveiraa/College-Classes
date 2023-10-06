import java.util.LinkedList;
import javax.swing.JOptionPane;
public class FilaBanco {
    LinkedList<Senha> filaNormal = new LinkedList<Senha>();
    LinkedList<Senha> filaPrioridade = new LinkedList<Senha>();

    int ct = 0;
    //inserir na relação de prioridade 2x1
    public void insere(Senha s) {

        if(s.getPrioridade().equals("Normal")) {
            filaNormal.add(s);
        } else if(s.getPrioridade().equals("Prioritario")){
            filaPrioridade.add(s);
        }
    }

    public Senha chama() {
        Senha senhaAtual = null;
        if(!filaPrioridade.isEmpty()) {
            if (ct < 2) {
                senhaAtual = filaPrioridade.remove();
                ct++;
            } else if(!filaNormal.isEmpty() && ct == 2) {
                senhaAtual = filaPrioridade.remove();
                ct = 0;
            }
        } else if(!filaNormal.isEmpty()) {
            senhaAtual = filaNormal.remove();
            ct = 0;
        }

        if(senhaAtual == null) {
            JOptionPane.showMessageDialog(null, "Filas vazias");
        } else {
            JOptionPane.showMessageDialog(null, "Senha: " + senhaAtual);
        }
        return senhaAtual;
    }

    public void ordemAtendimento() {
        LinkedList<Senha> ordemA= new LinkedList<Senha>();
        int contN = 0;
        int contP = 0;

        if(filaNormal.isEmpty() && filaPrioridade.isEmpty())
        {
            System.out.println("Erro aqui");
            System.out.println("Filas vazias");
            ordemA = null;
        } else {
            while (contP < filaPrioridade.size() || contN < filaNormal.size())  {
                if(contP < filaPrioridade.size()){
                    ordemA.add(filaPrioridade.get(contP));
                    contP++;
                    if(contP < filaPrioridade.size()) {
                        ordemA.add(filaPrioridade.get(contP));
                        contP++;
                    }
                }
                if(contN < filaNormal.size()) {
                    ordemA.add(filaNormal.get(contN));
                    contN++;
                }
            }
        }
        System.out.println(ordemA.toString());
    }
    public LinkedList<Senha> removerIntercalar() {
        LinkedList<Senha> ordemA= new LinkedList<Senha>();

        if(filaNormal.isEmpty() && filaPrioridade.isEmpty())
        {
            System.out.println("Filas vazias");
            ordemA = null;
        } else {
            while (!filaPrioridade.isEmpty() || !filaNormal.isEmpty())  {
                if(!filaPrioridade.isEmpty()){
                    ordemA.add(filaPrioridade.removeFirst());
                    if(!filaPrioridade.isEmpty()) {
                        ordemA.add(filaPrioridade.removeFirst());
                    }
                }
                if(!filaNormal.isEmpty()) {
                    ordemA.add(filaNormal.removeFirst());
                }
            }
        }
        return ordemA;
    }
    public boolean vazia() {
        return this.tamanho() == 0;
    }
    public int tamanho() {

        return filaNormal.size() + filaPrioridade.size();
    }

    public int posicaoElemento(int numSenha, String t) {
        Senha senhaAtual = null;
        int retorno = 0;
        int senhaA = numSenha;
        int cont = -1;
        String tipo = t;
        if(tipo.equalsIgnoreCase("Prioritario")) {
            for(int i = 0; i < filaPrioridade.size(); i++) {
                senhaAtual = filaPrioridade.get(i);
                cont++;
                if(senhaAtual.getNumero() == senhaA) {
                    if (senhaA > 0) {
                        return cont;
                    }
                }
            }
        }
        if(tipo.equalsIgnoreCase("Normal")) {
            for(int i = 0; i < filaNormal.size(); i++) {
                senhaAtual = filaNormal.get(i);
                cont++;
                if(senhaAtual.getNumero() == senhaA) {
                    if(senhaA > 0){
                        return cont;
                    }
                }
            }
        }
        return cont;
    }
}
