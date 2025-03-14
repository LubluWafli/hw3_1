public class Main {
    public static int animalCount;
    public static void main(String[] args) {
        Dog dog = new Dog("Бобик");
        Dog dog1 = new Dog("Бобик");
        Dog dog2 = new Dog("Бобик");
        Cat cat = new Cat("Мися");
        Cat cat1 = new Cat("Мися");
        Cat cat2 = new Cat("Мися");

        dog.run(500);
        dog.run(501);
        dog.swim(10);
        dog.swim(11);

        cat.run(200);
        cat.run(201);
        cat.swim();


        System.out.println(dog.getDogCount());
        System.out.println(cat.getCatCount());
        System.out.println(cat.getAnimalCount());
    }
}