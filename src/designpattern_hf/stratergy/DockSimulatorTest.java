package designpattern_hf.stratergy;

public class DockSimulatorTest {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.fly();
        mallardDuck.disPlay();
        mallardDuck.quack();
        mallardDuck.setDisplayBehaviour(new Model());
        mallardDuck.disPlay();
    }
}
