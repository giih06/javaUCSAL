package application;

import javax.swing.JOptionPane;

public class Dialogos {
    public static void main(String[] args) throws Exception {
        String msg = "Fernando", tit = "ATENÇÂO";

        cxMessage(msg, tit);
    }

    public static void cxMessage(String message, String titulo) {
        JOptionPane.showInputDialog(null, message, titulo, JOptionPane.DEFAULT_OPTION);
        // jOptionPane =  fornece métodos para exibir caixas de diálogo e interagir com o usuário.
        // .showInputDialog =  método estático da classe JOptionPane que exibe uma caixa de diálogo para receber entrada do usuário.
        // (null) =  Passar null indica que não há componente pai especificado.
        // (message) =  string contendo a mensagem exibida na caixa de diálogo. É o texto que indica ao usuário o que deve ser inserido.
        // (titulo) =  é uma string contendo o título da caixa de diálogo.
        // JOptionPane.DEFAULT_OPTION =  JOptionPane.DEFAULT_OPTION é o quarto parâmetro, que define o tipo de caixa de diálogo a ser exibida. Neste caso, DEFAULT_OPTION indica que a caixa de diálogo terá um botão de confirmação padrão.
    }
}
