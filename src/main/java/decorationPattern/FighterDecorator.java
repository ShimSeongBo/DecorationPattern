package decorationPattern;

public abstract class FighterDecorator implements Fighter {

    private Fighter decoratedFighter;

    public FighterDecorator(Fighter decoratedFighter) {
        this.decoratedFighter = decoratedFighter;
    }

    @Override
    public void attack() {
        decoratedFighter.attack();
    }
}
