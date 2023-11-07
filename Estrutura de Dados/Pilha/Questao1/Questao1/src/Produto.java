public class Produto {
    private String codigo, nome, cliente, bairro;

    public Produto() {

    }
    public Produto(String nome, String codigo, String cliente, String bairro) {
        this.codigo = codigo;
        this.nome = nome;
        this.cliente = cliente;
        this.bairro = bairro;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String toString(){
        String retorno = "\n---------------------\n" +
                        "Nome: " + getNome() + "\n" +
                        "Codigo: " + getCodigo() + "\n" +
                        "Cliente: " + getCliente() + "\n" +
                        "Bairro: " + getBairro() + "\n";

        return retorno;
    }

    public boolean comparaBairro(Produto outro){
        return this.bairro.equals( outro.getBairro());
    }
}
