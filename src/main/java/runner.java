public class runner {

    public static void main(String[] args) {

        Bottle bottle = new Bottle(50);

        System.out.println(bottle.getVolume());
        System.out.println(bottle.drink());
        System.out.println(bottle.fill());
        System.out.println(bottle.empty());

    }
}
