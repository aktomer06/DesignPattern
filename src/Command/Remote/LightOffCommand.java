package Command.Remote;

public class LightOffCommand implements Command{
    Light light = new Light();
    @Override
    public void execute() {
        light.off();
    }

    @Override
    public boolean matches(String string) {
        if(string.equals(CommandKeywords.LightOffCommand)) {
            return true;
        }
        return false;
    }
}
