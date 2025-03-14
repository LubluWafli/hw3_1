class Cat extends animal {
    String name;
    int distanceLimit;
    public static int catCount;

    public static int getAnimalCount() {
        return animalCount;
    }

    public static int getCatCount() {
        return catCount;
    }

    public Cat(String name) {
        this.name = name;
        this.distanceLimit = 200;
        this.catCount++;
        this.animalCount++;
    }

    public void run(int distance)
    {
        if (distance > distanceLimit)
        {
            System.out.printf("Слишком далеко, кошак %s не может бежать так далеко \n", name);
            return;
        }
        else
        {
            System.out.printf("Кошак %s пробежал %s метров \n",name,distance);
        }
    }
    public void swim(int distance)
    {
        System.out.printf("Кошак %s не умеет плавать, это же кот!\n",name);
    }

    public void swim()
    {
        System.out.printf("Кошак %s не умеет плавать, это же кот!\n",name);
    }
}

