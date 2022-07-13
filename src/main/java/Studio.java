public class Studio {
    public static void main(String[] args) {
        Photographer sean = new Photographer();
        log("===== Grabbing Nikon camera =====");
        sean.takePhotographWithNikon();
        log("===== Grabbing Nikon digital camera =====");
        sean.takeDigitalPhotographWithNikon();
        log("===== Grabbing Canon camera =====");
        sean.takePhotographWithCanon();
        log("===== Grabbing Canon digital camera =====");
        sean.takeDigitalPhotographWithCanon();
    }
    private static void log(String message) {
        System.out.println(message);
    }
}
