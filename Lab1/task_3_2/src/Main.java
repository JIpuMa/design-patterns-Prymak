public class Main {
    public static void main(String[] args) {
        for (int i=0; i<3; i++) {
            Creator creator = new Creator();
            creator.someOperation();
        }

        System.out.println();

        ConcreteCreator1 concreteCreator1 = new ConcreteCreator1();
        concreteCreator1.someOperation();

        ConcreteCreator2 concreteCreator2 = new ConcreteCreator2();
        concreteCreator2.someOperation();
    }
}