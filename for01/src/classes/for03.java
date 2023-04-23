public class for03 {
    public static void main(String[] args) throws Exception {
        int qt = 10, ct = 0, ti = 2, rz = 3;
        for(; ct < qt; ){
            if(ti % 2 != 0) {
                System.out.println(ti + " ");
            }
            ti += rz;
            ct++;
        }
        System.out.println();
        System.out.println("FIM");
        System.out.println(qt);
        

    }
}
