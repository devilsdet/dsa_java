package designpattern_hf.stratergy;

public class MuteQuack implements IQuackBehaviour{
    public void quack() {
        System.out.println("Silence");
    }
}
