import Factory.AutobotFactory;
import Models.Autobot;

public class Main {
    public static void main(String[] args) {

        Autobot autobot1 = AutobotFactory.summonAutobot("IRONHIDE");
        autobot1.printCardAutobot("IRONHIDE");

        Autobot autobot2 = AutobotFactory.summonAutobot("RATCHET");
        autobot2.printCardAutobot("RATCHET");

        Autobot autobot3 = AutobotFactory.summonAutobot("SKYDIVE");
        autobot3.printCardAutobot("SKYDIVE");

        Autobot autobot4 = AutobotFactory.summonAutobot("SILVERBOT");
        autobot4.printCardAutobot("SILVERBOT");

        Autobot autobot5 = AutobotFactory.summonAutobot("OPTIMUS");
        autobot5.printCardAutobot("OPTIMUS");

        Autobot autobot6 = AutobotFactory.summonAutobot("BUMBLEBEE");
        autobot6.printCardAutobot("BUMBLEBEE");
    }
}