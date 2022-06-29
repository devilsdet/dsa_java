package designpattern_hf.stratergy;

public class Duck {
    public IFlyBehaviour flyBehaviour;
    public IQuackBehaviour quackBehaviour;
    public IDisplayBehaviour displayBehaviour;

    public Duck(IFlyBehaviour flyBehaviour, IQuackBehaviour quackBehaviour,
                IDisplayBehaviour displayBehaviour) {
        this.flyBehaviour = flyBehaviour;
        this.quackBehaviour = quackBehaviour;
        this.displayBehaviour = displayBehaviour;
    }

    public void fly() {
       this.flyBehaviour.fly();
    }

    public void quack() {
       this.quackBehaviour.quack();
    }

    public void disPlay() {
        this.displayBehaviour.display();
    }

    public void setDisplayBehaviour(IDisplayBehaviour displayBehaviour) {
        this.displayBehaviour = displayBehaviour;
    }
}
