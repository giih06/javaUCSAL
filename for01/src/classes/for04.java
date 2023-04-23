public class for04 {
    public static void main(String[] args) throws Exception {
        //Criação das constantes usadas a solução
        final int RZ = 3, QT = 10;
        /* uso da estrutura de repetição para gerar 
         * uma P.A. onde será impresso apenas 10
         * valores impares dessa P.A. cujo termo
         * inicial é 2 e a razão é 3 */
        for(int ti = 2, ct = 0; ct < QT; ){
            /* quando o valor dividido por 2 tem
             * resto diferente de zero, o valor
             * é ímpar
             */
            if(ti % 2 != 0) {
                System.out.println(ti + " ");
                ct++;
            }
            /* soma o valor da variável ti com a razão e o resultado da operação é atribuído para a variável ti */
            ti += RZ;
        }
        System.out.println();
        System.out.println("FIM");
        

    }
}
