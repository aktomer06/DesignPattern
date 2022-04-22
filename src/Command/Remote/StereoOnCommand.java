package Command.Remote;
public class StereoOnCommand implements Command{
    Stereo stereo = new Stereo();
    @Override
    public void execute() {
        stereo.on();
    }

    @Override
    public boolean matches(String string) {
        if(string.equals(CommandKeywords.StereoOn)) {
            return true;
        }
        return false;
    }
}
