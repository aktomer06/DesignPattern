package Command.Remote;
//import Command.Remote.Devices.Light;
public class LightOnCommand implements Command{
    Light light = new Light();
    @Override
    public void execute() {
        light.on();
    }

    @Override
    public boolean matches(String string) {
        //System.out.println("LightON:: " + string);
        if(string.equals(CommandKeywords.LightOnCommand)) {
            return true;
        }
        return false;
    }
}
