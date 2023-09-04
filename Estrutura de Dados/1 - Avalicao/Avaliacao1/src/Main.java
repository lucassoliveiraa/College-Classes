import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Cachorro", "Beagle", 20.2);
        Animal animal2 = new Animal("Cachorro", "Boxer", 12.3);
        Animal animal3 = new Animal("Cachorro", "Buldogue", 17.5);
        Animal animal4 = new Animal("Vaca", "Holandes", 250.5);
        Animal animal5 = new Animal("Boi", "Anguls", 421.4);
        Animal animal6 = new Animal("Boi", "Nelore", 145.2);
        Animal animal7 = new Animal("Boi", "Nelore", 147.2);


        Lista<Animal> lista1 = new Lista<Animal>();

        lista1.adiciona(animal1, 0);
        lista1.adiciona(animal2, 1);
        lista1.adiciona(animal6, 2);
        lista1.adiciona(animal4, 3);
        lista1.adiciona(animal5, 4);
        lista1.adiciona(animal7, 5);
        lista1.adiciona(animal3, 6);


        System.out.println(lista1);

        Lista<Animal> lista2 = new Lista<Animal>();

         for (int i = 0; i < lista1.tamanho(); i++) {
             Animal atualInserir = lista1.get(i);
             boolean inseriu = false;

             for (int j = 0; j < lista2.tamanho(); j++) {
                 Animal atualAnalisar = lista2.get(j);

                 if (atualAnalisar.comparaTipo(atualInserir)) {
                     lista2.adiciona(atualInserir, j + 1);
                     inseriu = true;
                     break;
                 }
             }
             if (!inseriu) {
                 lista2.adiciona(atualInserir, lista2.tamanho());
             }
         }
        System.out.println("===================================");
        System.out.println(lista2);

        String racaEscolhida = JOptionPane.showInputDialog("Digite a raça");
        float  pesoEscolhido = Float.parseFloat(JOptionPane.showInputDialog("Digite a Peso Minimo"));

        for (int i = 0; i < lista1.tamanho(); i++) {
            Animal animalAtual = lista1.get(i);

            if (animalAtual.comparaRaca(racaEscolhida) && animalAtual.getPeso() < pesoEscolhido) {
                lista1.remover(i);
            }
        }
        System.out.println("===================================");
        System.out.println(lista1);
    }
}
