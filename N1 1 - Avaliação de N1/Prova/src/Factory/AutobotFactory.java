package Factory;
import Models.*;

public interface AutobotFactory {
    public static Autobot summonAutobot(String robot){
        robot = robot.toUpperCase();
        Autobot autobot = null;

        if (robot == "SKYDIVE" || robot == "SILVERBOT") {
            AerialBotsFactory aerialBotsFactory = new AerialBotsFactory();
            autobot = aerialBotsFactory.createAutobot(robot);
        } else if (robot == "OPTIMUS" || robot == "BUMBLEBEE") {
            LiderFactory liderFactory = new LiderFactory();
            autobot = liderFactory.createAutobot(robot);
        } else if (robot == "IRONHIDE") {
            CarBotsFactory carBotsFactory = new CarBotsFactory();
            autobot = carBotsFactory.createAutobot(robot);
        } else if (robot == "RATCHET") {
            MedicoFactory medicoFactory = new MedicoFactory();
            autobot = medicoFactory.createAutobot(robot);
        }

        autobot.assembleAutobot();
        return autobot;
    }

    public abstract Autobot  createAutobot(String robot);
}
