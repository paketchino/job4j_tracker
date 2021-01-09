package ru.job4j.tracker;


public class StartUI {
    private  final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        try {
            boolean run = true;
            while (run) {
                this.showMenu(actions);
                int select = input.askInt("Select: ");
                if (select < 0 || select <= actions.length) {
                    out.println("Wrong input, you can select: 0 .. " + (actions.length - 1));
                    continue;
                }
                UserAction action = actions[select];
                run = action.execute(input, tracker);
            }
        } catch (ArrayIndexOutOfBoundsException abe) {
            System.out.println("Wrong input enter number 0 to 6");
        }
    }

    private void showMenu(UserAction[] actions) {
        out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            out.println(index + ". " + actions[index].name());
        }
    }

    public static void main(String[] args) {
        try {
            Output output = new ConsoleOutput();
            Input input = new ValidateInput(output, new ConsoleInput());
            Tracker tracker = new Tracker();
            UserAction[] actions = {
                    new CreateAction(output),
                    new FindAllAction(output),
                    new ReplaceAction(output),
                    new DeleteAction(output),
                    new FindIdAction(output),
                    new FindNameAction(output),
                    new Exit(output)
            };
            new StartUI(output).init(input, tracker, actions);
        } catch (NumberFormatException nfe) {
            nfe.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException abe) {
            abe.printStackTrace();
        }
    }
}

