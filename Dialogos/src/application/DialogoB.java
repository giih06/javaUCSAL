import javax.swing.JOptionPane;

public class DialogosB {
    public static void main(String[] args) throws Exception {
        String msg, tit = "ATENÇÂO";
        msg = cxPergunta("Qual seu login?");
        boolean valida = Banco.validaLogin(msg);
        if(valida == true) {
            cxMessage("Usuário " + msg + "identidicado!", "AUTENTICACAO", valida);
        } else {
            cxMessage("Usuário " + msg + "não identidicado!", "AUTENTICACAO", valida);
        }
    }

    public static void cxMessage(String message, String titulo, boolean flag) {
        int simbolo;
        if(flag == true) {
            simbolo = JOptionPane.INFORMATION_MESSAGE;
        } else {
            simbolo = JOptionPane.ERROR_MESSAGE;
        }
        JOptionPane.showInputDialog(null, message, titulo, simbolo);
    }

    public static String cxPergunta(String questao) {
        return JOptionPane.showInputDialog(questao);
    }

    public static int cxSimNao(String questao) {
        return JOptionPane.showInternalConfirmDialog(null, questao);
    }
