package application;

import javax.swing.JOptionPane;

public class Dialogos2 {
    public static void main(String[] args) throws Exception {
        String msg, tit = "ATENÇÂO";
        msg = cxPergunta("Qual seu nome?");

        int res = cxSimNao("Giovanna ?");
        if(res == 0) {
            cxMessage("Voce é KILIMA", "CONFIRMADO");
        } else if(res == 1) {
            cxMessage("Voce não é KALIMA", "NÂO CONFIRMADO");
        } else {
            cxMessage("Voce está em duvida se é KALIMA", "NÃO CONFIRMADO");
        }

        cxMessage(("O nome informado foi " + msg).toUpperCase(), tit);
    }

    public static void cxMessage(String message, String titulo) {
        JOptionPane.showInputDialog(null, message, titulo, JOptionPane.DEFAULT_OPTION);
    }

    public static String cxPergunta(String questao) {
        return JOptionPane.showInputDialog(questao);
    }

    public static int cxSimNao(String questao) {
        return JOptionPane.showInternalConfirmDialog(null, questao);
    }
    // JOptionPane.showInternalConfirmDialog(null, questao) chama o método showInternalConfirmDialog da classe JOptionPane para exibir uma caixa de diálogo com opções de confirmação interna (sim, não e cancelar). O parâmetro null indica que não há componente pai especificado, e questao é a pergunta que será exibida na caixa de diálogo.
    // O valor retornado pelo método showInternalConfirmDialog será um inteiro que representa a opção escolhida pelo usuário. Os valores possíveis são JOptionPane.YES_OPTION (sim), JOptionPane.NO_OPTION (não) e JOptionPane.CANCEL_OPTION (cancelar).
}
