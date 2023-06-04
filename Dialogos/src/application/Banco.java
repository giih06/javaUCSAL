package application;

public class Banco {
    public static boolean login(String login) {
        String[] arr = new String[3;
        for(int i=0; i<arr.length; i++) {
            if(arr[i].equals(login)) {
                return true;
            }
        }
        return false;
    }

    public static String[] logins() {
        String[] arr = new String[3];
        arr[0] = "giovanna";
        arr[1] = "aluno";
        arr[2] = "administrador";
        return arr;
    }
}
