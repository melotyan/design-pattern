package command;

/**
 * Created by hao.yan on 2015/11/4.
 */
public class RemoteController {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        if (command != null)
            command.execute();
    }
}
