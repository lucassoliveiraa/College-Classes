import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;


public class SalvaArquivo {
    public void grava (Object ob) {
        try {
            File arquivo = arquivo = new File("src/texto/de.txt");
            ObjectOutputStream grava = new ObjectOutputStream(new FileOutputStream(arquivo));
            grava.writeObject(ob);
            grava.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static LinkedList ler() {
        LinkedList retorno = null;

        try {
            File file = new File("src/texto/de.txt");
            if (file.length() == 0) {
                retorno = new LinkedList<>();
            } else {
                FileInputStream arquivo = new FileInputStream("src/texto/de.txt");
                ObjectInputStream ler = new ObjectInputStream(arquivo);
                retorno = (LinkedList) ler.readObject();
                arquivo.close();
                ler.close();

            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return retorno;
    }
}
