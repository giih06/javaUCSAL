public class Fibo {
    public static void main(String[] args) throws Exception {
        for(int a = 0, b = 1, c, ct = 0; ct < 10; ct++) {
            System.out.println(a + " ");
            c = a + b;
            a = b;
            b = c;
        }

    }
}