package Lista_4_Materia_POO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leitura {

    // ===== Metodos =====
    /**
     * Mostra o rotulo e devolve o que o usuario digitou
     */
    public String entDados(String rotulo) {
        System.out.print(rotulo);

        InputStreamReader teclado = new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(teclado);

        String ret = "";
        try {
            ret = buff.readLine();
        } catch (IOException ioe) {
            System.out.println("\nERRO de sistema");
        }
        return ret;
    }
}
