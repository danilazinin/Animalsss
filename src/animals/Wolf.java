package animals;

public class Wolf extends Animal implements Comparable<Wolf> {
    public Wolf(int age, int weight, int numberOfLimbs) {
        super(age, weight, numberOfLimbs);
    }

    protected static final int MAX_WEIGHT = 100;
    protected static final String TYPE = "Wolf";

    public String toString() {
        return "Wolf: " + " weight: " + weight + " age: " + age;
    }

    public int getMaxWeight() {
        return MAX_WEIGHT;
    }

    public String getType() {
        return TYPE;
    }

    public int compareTo(Wolf o) {
        if (this.age > o.age) {
            return 1;
        } else if (this.age < o.age) {
            return -1;
        }
        return 0;
    }
}