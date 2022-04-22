package Command.Remote;

public interface Command {
    void execute();
    boolean matches(String string);
}
