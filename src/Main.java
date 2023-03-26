public class Main {
    public static void main(String[] args) {
        String[] array = {"hola", "mundo"};

        System.out.println(Concatenar(array));
    }
    public static String Concatenar(String[] stringsArray){
        String result = "";
        for (String string : stringsArray) {
            result = result + string;
        }
        return result;
    }
}