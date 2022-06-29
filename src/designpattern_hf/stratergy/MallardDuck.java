package designpattern_hf.stratergy;

public class MallardDuck extends Duck{
    public MallardDuck() {
        super(new FlyWithWings(), new Quack(), new Graphical());
    }
}
