public class Lista<L> {
    private L[] objetos;
    private int totalDeObjetos = 0;
    
    public Lista(int qtd) {
        objetos =( L[]) new Object[qtd];
    }
    //Adiciona um elemento na lista, sendo o objeto do tipo generico
    public void adiciona(L objeto) {
        this.garanteEspaco();
        this.objetos[this.totalDeObjetos] = objeto;
        this.totalDeObjetos++;
    }
    
    public int tamanho() {
        return this.totalDeObjetos;
    }
    
    public boolean posicaoValida(int posicao) {
        return posicao >= 0 && posicao < this.totalDeObjetos;
    }
    
    public void garanteEspaco() {
        if(this.totalDeObjetos == objetos.length) {
            L[] novoArray;
            novoArray = (L[]) new Object[this.objetos.length * 2];
            for(int i = 0; i < this.objetos.length; i++){
                novoArray[i] = this.objetos[i];
            }
            this.objetos = novoArray;
        }
        
    }
    
    public void adiciona(L objeto, int posicao) {
        this.garanteEspaco();
        if(!this.posicaoValida(posicao)) {
            throw new IllegalArgumentException("Posicao inválida");
        }
        for(int i = this.totalDeObjetos - 1; i >= posicao; i--) {
            this.objetos[i + 1] = this.objetos[i];
        }
        this.objetos[posicao] = objeto;
        this.totalDeObjetos++;
    }
    
    public void remover(int posicao) {
        
        if (!this.posicaoValida(posicao)) {
            throw new IllegalArgumentException("Posicao inválida");
        }
        for(int i = posicao; i < this.totalDeObjetos - 1; i++) {
            this.objetos[i] = this.objetos[i + 1];        
        }
        this.totalDeObjetos--;
    }
    
    public int posicao(L objeto) {
        int pos;
        if(!contem(objeto)) {
            throw new  IllegalArgumentException("Objeto inválido");
        }
        //Pega a posicao onde esta o objeto
        for(int i = 0; i < this.totalDeObjetos - 1; i++) {
            if(objeto.equals(pega(i))) {
                pos = i;
                return pos;
            }
        }
        return -1;
    }
    
    public void remover(L objeto) {
        int pos = this.posicao(objeto);
        for(int i = pos; i < this.totalDeObjetos - 1; i++) {
            this.objetos[i] = this.objetos[i + 1];
        }
        this.totalDeObjetos--;
    }
    
    public boolean contem(L objeto) {
        for (int i = 0; i < this.totalDeObjetos; i++) {
            if(objeto.equals(this.objetos[i])){
                return true;
            }
        }
        return false;
    }
    
    public L pega(int posicao) {
        if(!this.posicaoValida(posicao)) {
            throw new IllegalArgumentException("Posicao inválida");
        }
        return this.objetos[posicao];
    }
    
    public String toString() {
        
        if (totalDeObjetos == 0) {
            return "[]";
        }
        String nome = "[";
        for(int i = 0; i < this.totalDeObjetos - 1; i++) {
            nome += this.objetos[i] + " , ";
        }
        nome += objetos[totalDeObjetos - 1] + "]";
        return nome;
    }
}