package person;

/**
 * 户外衣服
 */
public class OutdoorCloth extends PersonCloth {
    public OutdoorCloth(Person mPerson) {
        super(mPerson);
    }

    private void dressShirt() {
        System.out.println("穿了短袖");
    }

    private void dressQuickDryingPants() {
        System.out.println("穿了速干裤");
    }

    private void dressSunProtectionClothing() {
        System.out.println("穿了防晒衣");
    }

    @Override
    public void dressed() {
        super.dressed();
        dressShirt();
        dressQuickDryingPants();
        dressSunProtectionClothing();
    }
}
