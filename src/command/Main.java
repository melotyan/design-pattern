package command;

/**
 * Created by hao.yan on 2015/11/4.
 */
public class Main {

    public static void main(String[] args) {
        Television television = new Television();
        Command openCommand = new OpenCommand(television);
        RemoteController remoteController = new RemoteController();
        remoteController.setCommand(openCommand);
        remoteController.executeCommand();

        Command voiceUpCommand = new VoiceUpCommand(television);
        remoteController.setCommand(voiceUpCommand);
        remoteController.executeCommand();

        Command voiceDownCommand = new VoiceDownCommand(television);
        remoteController.setCommand(voiceDownCommand);
        remoteController.executeCommand();

        Command closeCommand = new CloseCommand(television);
        remoteController.setCommand(closeCommand);
        remoteController.executeCommand();
    }
}
