import javax.swing.JOptionPane;

public class Main {
    static String nomeProd[] = new String[10];
    static String fornecedor[] = new String[10];
    static float precVenda[] = new float[10];
    static float precCusto[] = new float[10];
    static int quant[] = new int[10];
    static int ct = 0;
    static int opc;
    static String consult;
    static int qtd;
    static float ValBrutoTotVenda;
    static float desc;
    static float totFinalVenda;
    static float lucro[] = new float[10];
    static float lucroFinal;


    public static void main(String[] args){

        String botao[] = {"Cadastrar", "Vender", "Consultar", "Lucro", "Sair"};
        do{
            opc = JOptionPane.showOptionDialog(null, "MENU", "MERCADAO", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, botao, botao[0]);

            switch (opc) {
                case 0:
                    if(ct < 10){
                        Cadastro();
                        ct++;
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Banco de Dados Cheio");
                    }
                    break;
                case 1:
                    Venda();
                    break;
                case 2:
                    Consulta();
                    break;
                case 3:
                    LucroAcumludo();
                    if(lucroFinal == -1){
                        JOptionPane.showMessageDialog(null, "Não foi encontrado o produto!");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "R$" + lucroFinal);
                    }
                    break;
            }
        }while(opc != 4);

        JOptionPane.showMessageDialog(null, "Obrigado por usar nosso serviço");
    }

    //Cadastra os produtos nos arrays
    public static void Cadastro() {
        nomeProd[ct] = JOptionPane.showInputDialog("Nome Produto: ");
        fornecedor[ct] = JOptionPane.showInputDialog("Fornecedor: ");
        precVenda[ct] = Float.parseFloat(JOptionPane.showInputDialog("Preço de Venda R$: "));
        precCusto[ct] = Float.parseFloat(JOptionPane.showInputDialog("Preço de Custo: R$"));
        quant[ct] = Integer.parseInt(JOptionPane.showInputDialog("Quantidade do Produto: "));
    }

    //O Método realiza vendas, e retira do estoque a quantidade vendida
    public static void Venda() {
        consult = JOptionPane.showInputDialog("Nome do Produto: ");
        qtd = Integer.parseInt(JOptionPane.showInputDialog("Quantidade desejada: "));
        desc = Float.parseFloat(JOptionPane.showInputDialog("Desconto: "));
        for(int i = 0; i < nomeProd.length; i++) {
            //Quando a variavel consult for igual a uma variavel dentro do vetor
            if (consult.equalsIgnoreCase(nomeProd[i])) {

                if (quant[i] == 0){
                    JOptionPane.showMessageDialog(null, "Estoque esgotado");
                    break;
                }
                if(qtd > quant[i]){
                    JOptionPane.showMessageDialog(null, "Quantidade maior que o estoque");
                    break;
                }
                if(qtd <= quant[i]) {
                    if(desc > 0 & desc < 100){
                        desc = desc/100;
                        ValBrutoTotVenda = precVenda[i] * qtd;
                        totFinalVenda =  ValBrutoTotVenda - (ValBrutoTotVenda * desc);
                        JOptionPane.showMessageDialog(null, "Valor Bruto: R$" + ValBrutoTotVenda + "\n" +
                                                                                  "Desconto: " + desc + "\n" +
                                                                                  "Total Final: R$" + totFinalVenda + "\n");

                        lucro[i] += totFinalVenda - (precCusto[i] * qtd);
                        quant[i] -= qtd;
                        break;
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Desconto invalido");
                        break;
                    }
                }
            }
            else {
                //Se ele entrar nesse else e o valor do contador for igual a 9, quer dizer que ele passou pelo vetor todo e não encontrou nada porque java é sequencial
                if(i == 9) {
                    JOptionPane.showMessageDialog(null, "Produto não Encontrado");
                }
            }
        }
    }

    //Metódo que consulta o produto desejado, se o produto estiver no array ele mostra todos os seus dados
    public static void Consulta() {
        //Quando a variavel consult for igual a uma variavel dentro do vetor
        consult = JOptionPane.showInputDialog("Nome do Produto: ");
        for (int i = 0; i < nomeProd.length; i++) {
            if (consult.equalsIgnoreCase(nomeProd[i])) {
                JOptionPane.showMessageDialog(null, "Nome do Produto: " + nomeProd[i] + "\n" +
                                                                          "Fornecedor: " + fornecedor[i] + "\n" +
                                                                          "Preço de Venda: R$" + precVenda[i] + "\n" +
                                                                          "Preço de Custo: R$" + precCusto[i] + "\n" +
                                                                          "Quantidade do Produto no Estoque: " + quant[i]);
                break;
            }
            else {
                //Se ele entrar nesse else e o valor do contador for igual a 9, quer dizer que ele passou pelo vetor todo e não encontrou nada porque java é sequencial
                if (i == 9) {
                    JOptionPane.showMessageDialog(null, "Produto não Encontrado");
                }
            }
        }
    }
    //Essa função retorna o lucro da venda de um determinando produto
    public static float LucroAcumludo(){
        consult = JOptionPane.showInputDialog("Nome do Produto: ");
        for(int i = 0; i < nomeProd.length; i++) {
            if (consult.equalsIgnoreCase(nomeProd[i])) {
                lucroFinal = lucro[i];
                break;
            }
            else {
                //Se ele entrar nesse else e o valor do contador for igual a 9, quer dizer que ele passou pelo vetor todo e não encontrou nada porque java é sequencial
                if (i == 9) {
                    lucroFinal = -1;
                }
            }
        }
        return lucroFinal;
    }
}