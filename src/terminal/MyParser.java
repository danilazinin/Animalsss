package terminal;

public class MyParser implements CommandParser{
    @Override
    public String[] parseCommand(String input) {
        return input.split(" ");
    }
}