import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        GerenciaFilas filas = new GerenciaFilas();

        int opc = 0;
        do {
            opc = Integer.parseInt(
                    JOptionPane.showInputDialog("--- Escolha a opção: ---- \n"+
                                                "  1- Inserir Senha\n"+
                                                "  2- Chamar Senha\n"+
                                                "  3- Ordem Atendimento\n"+
                                                "  4- Tamanho Fila \n"+
                                                "  5- Posição da senha \n"+
                                                "  6- Tamanho total da fila\n"+
                                                "  7- [Extra] Intercalar Filas\n" +
                                                "  8- Sair"));

            switch (opc) {
                case 1: //---- inserir nsenha na fila correta
                    String tipo = filas.escolheTipo();
                    String pri  = filas.escolhePrioridade();
                    int numero  = filas.escolheNumero(tipo, pri);

                    Senha nova = new Senha(tipo, pri, numero);
                    filas.escolheFila(tipo).insere(nova);
                    break;
                case 2:
                    int chamada = Integer.parseInt(JOptionPane.showInputDialog(null, "--- Escolhe a fila a ser chamada: ---\n" +
                                                                                                            "1 - Caixa\n" +
                                                                                                            "2 - Habitacao\n" +
                                                                                                            "3 - Financiamento\n" +
                                                                                                            "4 - Geral"));
                    if(chamada == 1) {
                        filas.filaCaixa.chama();
                    } else if(chamada == 2) {
                        filas.filaHbt.chama();
                    } else if(chamada == 3) {
                        filas.filaFin.chama();
                    } else if(chamada == 4) {
                        filas.filaGer.chama();
                    } else {
                        JOptionPane.showMessageDialog(null, "Fila invalida");
                    }
                    break;

                case 3:
                    int ordemFila = Integer.parseInt(JOptionPane.showInputDialog(null, "--- Escolhe a fila: ---\n" +
                                                                                                                "1 - Caixa\n" +
                                                                                                                "2 - Habitacao\n" +
                                                                                                                "3 - Financiamento\n" +
                                                                                                                "4 - Geral"));
                    if(ordemFila == 1) {
                        filas.filaCaixa.ordemAtendimento();
                    } else if(ordemFila == 2) {
                        filas.filaHbt.ordemAtendimento();

                    } else if(ordemFila == 3) {
                        filas.filaFin.ordemAtendimento();

                    } else if(ordemFila == 4) {
                        filas.filaGer.ordemAtendimento();

                    } else {
                        JOptionPane.showMessageDialog(null, "Fila invalida");
                    }
                    break;

                case 4:
                    int tamFila = Integer.parseInt(JOptionPane.showInputDialog(null, "--- Escolhe a fila: ---\n" +
                                                                                                            "1 - Caixa\n" +
                                                                                                            "2 - Habitacao\n" +
                                                                                                            "3 - Financiamento\n" +
                                                                                                            "4 - Geral"));
                    if(tamFila == 1) {
                        JOptionPane.showMessageDialog(null, filas.filaCaixa.tamanho());
                    } else if(tamFila == 2) {
                        JOptionPane.showMessageDialog(null, filas.filaHbt.tamanho());

                    } else if(tamFila == 3) {
                        JOptionPane.showMessageDialog(null, filas.filaFin.tamanho());

                    } else if(tamFila == 4) {
                        JOptionPane.showMessageDialog(null, filas.filaGer.tamanho());

                    } else {
                        JOptionPane.showMessageDialog(null, "Fila invalida");
                    }
                    break;
                case 5:
                    int tipoAtendimento = Integer.parseInt(JOptionPane.showInputDialog(null, "--- Escolhe a fila: ---\n" +
                                                                                                                    "1 - Caixa\n" +
                                                                                                                    "2 - Habitacao\n" +
                                                                                                                    "3 - Financiamento\n" +
                                                                                                                    "4 - Geral"));
                    int numSenha = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero da senha"));
                    String t = JOptionPane.showInputDialog(null, "--- Escolha a Prioridade: ---- \n"+
                                                                                        "Normal \n"+
                                                                                        "Prioritario");

                    if(tipoAtendimento == 1) {
                        JOptionPane.showMessageDialog(null, filas.filaCaixa.posicaoElemento(numSenha, t));
                    } else if(tipoAtendimento == 2) {
                        JOptionPane.showMessageDialog(null, filas.filaHbt.posicaoElemento(numSenha, t));

                    } else if(tipoAtendimento== 3) {
                        JOptionPane.showMessageDialog(null, filas.filaFin.posicaoElemento(numSenha, t));

                    } else if(tipoAtendimento== 4) {
                        JOptionPane.showMessageDialog(null, filas.filaGer.posicaoElemento(numSenha, t));

                    } else {
                        JOptionPane.showMessageDialog(null, "Fila invalida");
                    }
                    break;
                case 6:
                    int totalSenha = filas.filaCaixa.tamanho() + filas.filaFin.tamanho() + filas.filaGer.tamanho() + filas.filaHbt.tamanho();
                    JOptionPane.showMessageDialog(null, "Total de senhas: " + totalSenha);
                    break;
                case 7:
                    FilaBanco novo = filas.intercala();
                    novo.ordemAtendimento();
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null, "Fim do Progama");
                    break;

                default:
                    throw new AssertionError();
            }
        }while(opc != 8);
    }
}