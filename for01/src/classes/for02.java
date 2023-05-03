package classes;
public class for02 {
    public static void main(String[] args) throws Exception {
        //P.A de termo inicial 2 e razão 4 e não ultrapassa n 38
        int qt = 10, ct = 0;
        for(int ti = 2, rz = 4; ct < qt; ti += rz, ct++){
            System.out.println(ti + " ");
        }
        System.out.println();
        System.out.println("FIM");
        System.out.println(qt);

    }
}
