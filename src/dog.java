class Dog extends animal {
    String name;
    int distanceLimit;
    int distanceLimitSwim;
    public static int dogCount;

    public static int getAnimalCount() {
        return animalCount;
    }

    public Dog(String name){
        this.name = name;
        this.distanceLimit = 500;
        this.distanceLimitSwim = 10;
        this.dogCount++;
        this.animalCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }

    public void run(int distance)
    {
        if (distance > distanceLimit)
        {
            System.out.printf("Слишком далеко, песик %s не может бежать так далеко \n", name);
            return;
        }
        else
        {
            System.out.printf("Песик %s пробежал %s метров \n",name,distance);
        }
    }

    public void swim (int distance)
    {
        if (distance > distanceLimitSwim)
        {
            System.out.printf("Слишком далеко, песик %s не может плыть так далеко \n", name);
            return;
        }
        else
        {
            System.out.printf("Песик %s проплыл %s метров \n",name,distance);
        }
    }

}
