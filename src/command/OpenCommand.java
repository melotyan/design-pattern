package command;

/**
 * Created by hao.yan on 2015/11/4.
 */
public class OpenCommand implements Command {
    private Television television;

    public OpenCommand(Television television) {
        this.television = television;
    }
    
    @Override
    public void execute() {
        television.openTV();
    }
}
