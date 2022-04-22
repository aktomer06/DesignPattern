package Command.Remote;

public class TVVolumeUP implements Command{
    private TV tv = new TV();
    @Override
    public boolean matches(String string) {
        if(string.equals(CommandKeywords.VolumeUp)) {
            return true;
        }
        return false;
    }

    @Override
    public void execute() {
        tv.volumeUp();
    }
}
