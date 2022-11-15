package decorationPattern;

public class HeavyMachinegunDecorator extends FighterDecorator{

    public HeavyMachinegunDecorator(Fighter decoratedFighter) {
        super(decoratedFighter);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("헤비머신건 발사");
    }
}
