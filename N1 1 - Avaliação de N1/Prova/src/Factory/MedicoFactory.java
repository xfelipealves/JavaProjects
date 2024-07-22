package Factory;
import Models.*;
public class MedicoFactory implements AutobotFactory{
    @Override
    public Autobot createAutobot(String robot) {
        Autobot autobot = new Medico(robot, 3, 14, 0, "Engenharia cybertroniana.", "");
        return autobot;
    }
}
