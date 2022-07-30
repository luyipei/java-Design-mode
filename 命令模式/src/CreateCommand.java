public class CreateCommand implements Command{
    private BoardScreen boardScreen;

    public CreateCommand() {
        boardScreen=new BoardScreen();
    }

    @Override
    public void execute() {
        boardScreen.create();

    }
}
