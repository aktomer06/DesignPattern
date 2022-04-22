package Command.Remote;

public class StereoOffCommand implements Command{
    Stereo stereo = new Stereo();
    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public boolean matches(String string) {
        if(string.equals(CommandKeywords.StereoOff)) {
            return true;
        }
        return false;
    }
}
