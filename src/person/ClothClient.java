package person;

public class ClothClient {
    public static void main(String[] args) {
        Person outDoorBoy = new Boy();
        Person beachBoy = new Boy();
        PersonCloth outDoorCloth = new OutdoorCloth(outDoorBoy);
        PersonCloth beachCloth = new BeachCloth(beachBoy);
        System.out.println("下面是户外男孩的穿着：");
        outDoorCloth.dressed();
        System.out.println("\n下面是沙滩男孩的穿着：");
        beachCloth.dressed();
    }
}
