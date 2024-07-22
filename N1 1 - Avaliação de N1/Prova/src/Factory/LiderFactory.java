package Factory;
import Models.*;
public class LiderFactory implements AutobotFactory{
    @Override
    public Autobot createAutobot(String robot) {
        Autobot autobot = (robot == "OPTIMUS") ? new Lider(robot, 3, 8, 2,
                "Estrategista em combates.", "") : new Lider(robot,
                4, 12, 2, "Ataque corpo-a-corpo.", "");
        return autobot;
    }
}
