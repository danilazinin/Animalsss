package terminal;

import animals.Wolf;
import zoo.Zoo;

public class CreateWolfExecutable implements CommandExecutable {
    private Zoo zoo;
    private Wolf wolf;

    public CreateWolfExecutable(Zoo zoo, Wolf wolf) {
        this.zoo = zoo;
        this.wolf = wolf;
    }

    public void execute() {
        zoo.createWolf(wolf);
        System.out.println("Wolf is created and added to cage");
    }
}
