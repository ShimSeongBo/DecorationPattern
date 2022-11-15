package decorationPattern;

public class ShootingGameApplication {
    public static void main(String[] args) {

//        new XWingFighter().attack();

//        new LaserDecorator(new XWingFighter()).attack();

        new PlasmaDecorator(new LaserDecorator(new XWingFighter())).attack();

//        XWingFighter xWingFighter = new XWingFighter();
//        LaserDecorator laserDecorator = new LaserDecorator(xWingFighter);
//        PlasmaDecorator plasmaDecorator = new PlasmaDecorator(laserDecorator);
//        HackDecorator hackDecorator = new HackDecorator(plasmaDecorator);
//        HeavyMachinegunDecorator heavyMachinegunDecorator = new HeavyMachinegunDecorator(xWingFighter);
//
//
//        xWingFighter.attack();
//        laserDecorator.attack();
//        plasmaDecorator.attack();
//        hackDecorator.attack();
//        heavyMachinegunDecorator.attack();
    }
}
