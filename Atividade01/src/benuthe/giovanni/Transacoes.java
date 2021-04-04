/*
        NOME: Giovanni Brandini Blanco Benuthe
        RA:   19.00043-0
 */
package benuthe.giovanni;

import java.util.Random;
import static java.lang.Integer.parseInt;

public class Transacoes {

    public static String gerarQrCode(int id, String nomeUsuario, double valor){
        int r = getRandomNumberInRange(1000, 9999);
        String qrCode = String.join(";", id + "", nomeUsuario, valor+"", r+"");
        return qrCode;
    }

    // Pagamento pelo QR
    public static boolean transacao(Usuarios pagador, Usuarios recebedor, String qrCode){
        // Separando o QR Code
        String[] dados = qrCode.split(";");
        // Valida e transfere
        if (recebedor.getNome().equals(dados[1]) && recebedor.getC().getIdConta() == parseInt(dados[0])){
            pagador.getC().transferirDinheiro(recebedor.getC(),Double.parseDouble(dados[2]));
            return true;
        }
        return false;
    }

    // Gerador de aleatorio
    private static int getRandomNumberInRange(int min, int max){
        Random r = new Random();
        return r.nextInt((max-min)+1) + min;
    }

}
