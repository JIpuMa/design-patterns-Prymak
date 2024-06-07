public class Main {
    public static void main(String[] args) {
        String fileName = "src/input.txt";

        TextFile textFile1 = TextFile.getInstance();
        System.out.println(textFile1);
        System.out.println(textFile1.readFile(fileName));

        TextFile textFile2 = TextFile.getInstance();
        System.out.println(textFile2);
        System.out.println(textFile2.addTextToFile(fileName, "Goodbye"));
    }
}