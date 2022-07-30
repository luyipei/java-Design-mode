public class EditCommand implements Command{
    private BoardScreen boardScreen;

    public EditCommand() {
        boardScreen=new BoardScreen();
    }

    @Override
    public void execute() {
        boardScreen.exid();

    }
}
