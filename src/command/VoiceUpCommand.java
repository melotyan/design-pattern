package command;

/**
 * Created by hao.yan on 2015/11/4.
 */
public class VoiceUpCommand implements Command {
    private Television television;

    public VoiceUpCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.voiceUp();
    }
}
