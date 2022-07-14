public class HelloWorld {
    public static String drawTriangle(int N) {
        String i = "*";
        while (i.length() <= N) {
            System.out.println(i);
            i = i + "*";
        }
        return i;
    }
    public static void main(String[] args) {
        System.out.println(drawTriangle(10));
    }
}