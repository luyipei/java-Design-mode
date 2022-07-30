public class OpenCommand implements Command{
    private BoardScreen boardScreen;

    public OpenCommand() {
        boardScreen=new BoardScreen();
    }

    @Override
    public void execute() {
        boardScreen.open();

    }
}
