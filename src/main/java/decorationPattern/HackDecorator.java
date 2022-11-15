package decorationPattern;

public class HackDecorator extends FighterDecorator {

    public HackDecorator(Fighter decoratedFighter) {
        super(decoratedFighter);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("핵미사일 발사");
    }

}
