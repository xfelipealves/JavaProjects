package Factory;

import Models.*;

public class AerialBotsFactory implements AutobotFactory{
    @Override
    public Autobot createAutobot(String robot) {
        Autobot autobot = robot == "SKYDIVE" ? new AerialBots(robot, 3, 8, 2,
                "Táticas aéreas de guerra.", "") : new AerialBots(robot,
                4, 12, 2, "Emboscadas aéreas", "");
        return autobot;
    }
}
