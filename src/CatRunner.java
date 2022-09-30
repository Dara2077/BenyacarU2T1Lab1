public class CatRunner {
    public static void main(String[] args){
        Cat cat1 = new Cat("Fluffy", 6, 10.5);
        cat1.introduce();
        cat1.printCatInfo();

        System.out.println();

        Cat cat2 = new Cat("dog", 15, 20);
        cat2.introduce();
        cat2.printCatInfo();
    }
}
