package person;

/**
 * 沙滩衣服
 */
public class BeachCloth extends PersonCloth {
    public BeachCloth(Person mPerson) {
        super(mPerson);
    }

    private void dressBeachPants() {
        System.out.println("穿了沙滩裤");
    }

    @Override
    public void dressed() {
        super.dressed();
        dressBeachPants();
    }
}
