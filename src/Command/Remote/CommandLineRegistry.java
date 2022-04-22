package Command.Remote;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommandLineRegistry {
    private List<Command> commandList = new ArrayList<>();
    public void register(Command command) {
        commandList.add(command);
    }
    public void executeCommand(String input){
        for(Command c: commandList) {
            if(c.matches(input)) {
                c.execute();
                return;
            }
        }
        throw new InvalidParameterException("Command is invalid");
    }
}
