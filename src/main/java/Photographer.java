public class Photographer {

    Camera nikonCamera;
    DigitalCameraAdapter nikonDigitalCamera;
    Camera canonCamera;
    DigitalCameraAdapter canonDigitalCamera;

    public Photographer(){
        CameraFactory factory = new CameraFactory();
        nikonCamera = factory.makeCamera(CameraFactory.CameraManufacturer.NIKON_FILM);
        nikonDigitalCamera = new DigitalCameraAdapter(nikonCamera);
        canonCamera = factory.makeCamera(CameraFactory.CameraManufacturer.CANON_FILM);
        canonDigitalCamera = new DigitalCameraAdapter(canonCamera);
    }

    private static final double nikonShutterSpeed = 145;
    private static final double canonShutterSpeed = 170;

    public void takePhotographWithNikon(){
        nikonCamera.takePhotograph(nikonShutterSpeed);
    }

    public void takeDigitalPhotographWithNikon(){
        nikonDigitalCamera.takePhotograph(nikonShutterSpeed);
    }

    public void takePhotographWithCanon(){
        canonCamera.takePhotograph(canonShutterSpeed);
    }

    public void takeDigitalPhotographWithCanon(){
        canonDigitalCamera.takePhotograph(canonShutterSpeed);
    }

}