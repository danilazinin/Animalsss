package terminal;

import zoo.Zoo;

public class DeleteWolfExecutable implements CommandExecutable {
    private Zoo zoo;

    public DeleteWolfExecutable(Zoo zoo) {
        this.zoo = zoo;
    }

    public void execute() {
        zoo.deleteWolf();
        System.out.println("Wolf is deleted");
    }
}