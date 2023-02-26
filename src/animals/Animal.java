package animals;

public abstract class Animal {
    protected int weight;
    protected int numberOfLimbs;
    protected int age;

    public Animal(int age, int weight, int numberOfLimbs) {
        this.age = age;
        this.weight = weight;
        this.numberOfLimbs = numberOfLimbs;
    }

    public void feed(int foodWeight) {
        if (weight + foodWeight <= getMaxWeight()) {
            weight += foodWeight;
        } else {
            System.out.println("Max weight exceeded");
        }
    }


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getNumberOfLimbs() {
        return numberOfLimbs;
    }

    public void setNumberOfLimbs(int numberOfLimbs) {
        this.numberOfLimbs = numberOfLimbs;
    }

    public abstract int getMaxWeight();

    public int getAge() {
        return age;
    }

    public int setAge(int age) {
        return this.age = age;
    }

    public abstract String getType();
}