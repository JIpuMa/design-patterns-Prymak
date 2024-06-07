public class Main {
    public static void main(String[] args) {
        VAG vag_1 = VAG.getInstance();
        Car audi = vag_1.createAudi();
        System.out.println(vag_1);
        System.out.println(audi);

        VAG vag_2 = VAG.getInstance();
        Car skoda = vag_2.createSkoda();
        System.out.println(vag_2);
        System.out.println(skoda);
    }
}