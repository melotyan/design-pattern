package command;

/**
 * Created by hao.yan on 2015/11/4.
 */
public class VoiceDownCommand implements Command {
    private Television television;

    public VoiceDownCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.voiceDown();
    }
}
