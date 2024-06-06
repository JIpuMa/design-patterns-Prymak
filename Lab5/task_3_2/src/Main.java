public class Main {
    public static void main(String[] args) {
        VAG carCreator = new VAG();

        Car audi = carCreator.createAudi();
        Car skoda = carCreator.createSkoda();
        Car siat = carCreator.createSiat();

        System.out.println("Originals");
        System.out.println(audi);
        System.out.println(skoda);
        System.out.println(siat);

        Car audiClone = audi.clone();
        Car skodaClone = skoda.clone();
        Car siatClone = siat.clone();

        System.out.println("CLONES");
        System.out.println(audiClone);
        System.out.println(skodaClone);
        System.out.println(siatClone);
    }
}