package Factory;

import Models.*;

public class CarBotsFactory implements AutobotFactory{
    @Override
    public Autobot createAutobot(String robot) {
        Autobot autobot = new CarBots(robot, 5, 12, 2, "Armas pesadas.", "");
        return autobot;
    }
}
