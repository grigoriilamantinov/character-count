public class App {
    public static void main(String[] args) {
        String source = "G!G B!BB Z!Z !!";
        char[] arraySource = source.toCharArray();
        TextStats stats = new TextStats();
        stats.countWithArrayOnly(arraySource);
    }
}
