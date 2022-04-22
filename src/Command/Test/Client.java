package Command.Test;

import Command.Remote.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.security.InvalidParameterException;

public class Client {
    public static void main(String[] args) {
        CommandLineRegistry registry = new CommandLineRegistry();
        registry.register(new LightOnCommand());
        registry.register(new LightOffCommand());
        registry.register(new StereoOnCommand());
        registry.register(new StereoOffCommand());
        registry.register(new TVVolumeUP());

        while(true) {
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));
            try {
                String input = reader.readLine();
//                System.out.println("Input = " + input);
                registry.executeCommand(input);
            }
            catch (Exception e)
            {
                //throw new InvalidParameterException();
                System.out.println(e.getMessage());
            }
        }
    }
}
