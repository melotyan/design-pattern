package command;

/**
 * Created by hao.yan on 2015/11/4.
 */
public class CloseCommand implements Command {
    private Television television;

    public CloseCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.closeTV();
    }
}
