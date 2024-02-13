import javax.swing.JOptionPane;

public class GerenciaFilas {
    int nCaixaNor =1;
    int nCaixaPri =1;
    int nHbtNor =1;
    int nHbtPri =1;
    int nFinNor =1;
    int nFinPri =1;
    int nGerNor =1;
    int nGerPri =1;

    FilaBanco filaCaixa = new FilaBanco();
    FilaBanco filaHbt = new FilaBanco();
    FilaBanco filaFin = new FilaBanco();
    FilaBanco filaGer = new FilaBanco();


    public String escolheTipo(){
        String retorno="";
        int t = Integer.parseInt(
                JOptionPane.showInputDialog("--- Escolha o tipo: ---- \n"+
                        "  1- Caixa\n"+
                        "  2- Habitação\n"+
                        "  3- Financiamento\n"+
                        "  4- Geral "));
        switch (t) {
            case 1:
                retorno= "Caixa";
                break;
            case 2:
                retorno = "Habitação";
                break;
            case 3:
                retorno = "Financiamento";
                break;
            case 4:
                retorno = "Geral";
                break;
            default:
                JOptionPane.showMessageDialog(null,"Tipo Inválido");
                retorno = escolheTipo();
        }

        return retorno;
    }

    public String escolhePrioridade(){
        String retorno="";
        int t = Integer.parseInt(
                JOptionPane.showInputDialog("--- Escolha a Prioridade: ---- \n"+
                        "  1- Normal \n"+
                        "  2- Prioritário"));
        switch (t) {
            case 1:
                retorno = "Normal";
                break;
            case 2:
                retorno = "Prioritario";
                break;
            default:
                JOptionPane.showMessageDialog(null,"Prioridade Inválida");
                retorno = escolhePrioridade();
        }
        return retorno;
    }

    public FilaBanco escolheFila(String tipo){

        FilaBanco retorno = null;
        if(tipo.equals("Caixa")){
            retorno =  filaCaixa;
        }

        if(tipo.equals("Habitação")){
            retorno = filaHbt;
        }

        if(tipo.equals("Financiamento")){
            retorno = filaFin;
        }

        if(tipo.equals("Geral")) {
            retorno = filaFin;

        }
        return retorno;
    }

    public  int escolheNumero(String tipo, String pri){
        // ------ Escolhe variavel de controle do numero
        int numero=0;
        if(tipo.equals("Caixa")){

            if(pri.equals("Normal")) {
                numero = nCaixaNor;
                nCaixaNor++;
            }
            else {
                numero = nCaixaPri;
                nCaixaPri++;
            }
        }

        if(tipo.equals("Habitação")){
            if(pri.equals("Normal")) {
                numero = nHbtNor;
                nHbtNor++;
            }
            else {
                numero = nHbtPri;
                nHbtPri++;
            }
        }

        if(tipo.equals("Financiamento")){
            if(pri.equals("Normal")){
                numero = nFinNor;
                nFinNor++;
            }
            else {
                numero = nFinPri;
                nFinPri++;
            }
        }

        if(tipo.equals("Geral")) {
            if(pri.equals("Normal")){
                numero = nGerNor;
                nGerNor++;
            }
            else{
                numero = nGerPri;
                nGerPri++;
            }
        }
        return numero;
    }
    public FilaBanco intercala() {
        FilaBanco fila = null;
        if(filaCaixa.tamanho() < filaHbt.tamanho() && filaCaixa.tamanho() < filaFin.tamanho() && filaCaixa.tamanho() < filaGer.tamanho() && !filaCaixa.vazia()) {
            while(!filaHbt.vazia()) {
                filaHbt.removerIntercalar();
                filaCaixa.insere(filaHbt.chama());
            }
            while(!filaFin.vazia()) {
                filaFin.removerIntercalar();
                filaCaixa.insere(filaFin.chama());
            }
            while(!filaGer.vazia()) {
                filaGer.removerIntercalar();
                filaCaixa.insere(filaGer.chama());
            }
            return filaCaixa;
        } else if(filaHbt.tamanho() < filaCaixa.tamanho() && filaHbt.tamanho() > filaFin.tamanho() && filaHbt.tamanho() > filaGer.tamanho() && !filaHbt.vazia()) {
            while(!filaCaixa.vazia()) {
                filaCaixa.removerIntercalar();
                filaHbt.insere(filaCaixa.chama());
            }
            while(!filaFin.vazia()) {
                filaFin.removerIntercalar();
                filaHbt.insere(filaFin.chama());
            }
            while(!filaGer.vazia()) {
                filaGer.removerIntercalar();
                filaHbt.insere(filaGer.chama());
            }
            return filaHbt;
        } else if(filaFin.tamanho() < filaCaixa.tamanho() && filaFin.tamanho() > filaHbt.tamanho() && filaFin.tamanho() < filaGer.tamanho() && !filaFin.vazia()) {
            while(!filaCaixa.vazia()) {
                filaCaixa.removerIntercalar();
                filaFin.insere(filaCaixa.chama());
            }
            while(!filaHbt.vazia()) {
                filaHbt.removerIntercalar();
                filaFin.insere(filaHbt.chama());
            }
            while(!filaGer.vazia()) {
                filaGer.removerIntercalar();
                filaFin.insere(filaGer.chama());
            }
            return filaFin;
        } else if(filaGer.tamanho() < filaCaixa.tamanho() && filaGer.tamanho() < filaHbt.tamanho() && filaGer.tamanho() < filaFin.tamanho() && !filaGer.vazia()) {
            while(!filaCaixa.vazia()) {
                filaCaixa.removerIntercalar();
                filaGer.insere(filaCaixa.chama());
            }
            while(!filaFin.vazia()) {
                filaFin.removerIntercalar();
                filaGer.insere(filaFin.chama());
            }
            while(!filaHbt.vazia()) {
                filaGer.insere(filaHbt.chama());
            }
            return filaGer;
        }
        return fila;
    }
}
