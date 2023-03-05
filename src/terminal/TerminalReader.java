package terminal;

import zoo.Zoo;

import java.util.Scanner;

public class TerminalReader {
    private static TerminalReader termReader;
    private CommandParser commandParser;


    private TerminalReader(CommandParser commandParser) {
        this.commandParser = commandParser;
    }

    public static TerminalReader newTerminalReader(CommandParser commandParser) {
        if (termReader == null) {
            termReader = new TerminalReader(commandParser);
        }
        return termReader;
    }

    public void runReader(Zoo zoo) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nВведите номер операции: ");
            System.out.println("1. Создать животное \n2. Удалить животное\n");
            String input = scanner.nextLine();
            if (input.equals("stop")) break;
            if (input.equals("1")) {
                System.out.println("Введите номер животного и его параметры в строку через пробел");
                System.out.println("1. Лев 2. Волк 3. Змея");
                System.out.println("Возраст    Вес     Количество конечностей     Объем гривы/Высота в холке/Длина тела");
                input = scanner.nextLine();
            } else if (input.equals("2")) {
                System.out.println("Введите номер животного \n1. Лев 2. Волк 3. Змея");
                input = scanner.nextLine();
            } else System.out.println("Такой команды нет!");
            CommandExecutableFactory commandExeFactory = new CommandExecutableFactory(zoo);
            commandExeFactory.create(commandParser.parseCommand(input)).execute();
        }
        scanner.close();


    }

}
