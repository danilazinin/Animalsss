package terminal;

import animals.Lion;
import zoo.Zoo;

public class CreateLionExecutable implements CommandExecutable {
    private Zoo zoo;
    private Lion lion;

    public CreateLionExecutable(Zoo zoo, Lion lion) {
        this.zoo = zoo;
        this.lion = lion;
    }

    public void execute() {
        zoo.createLion(lion);
        System.out.println("Lion is created and added to cage");
    }
}