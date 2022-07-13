public class DigitalCameraAdapter implements CameraAdapter {

    private Camera camera;

    public DigitalCameraAdapter(Camera camera) {
        this.camera = camera;
    }

    // implement a subset of the takePhotograph() functionality from the Camera class here
    public void takePhotograph(double shutterSpeed) {
        Logger.getInstance().log(camera.getName() + " is launching its digital mode.");
        camera.getMirrorOps().getName();
        camera.getMirrorOps().openMirror();
        camera.getShutterOps().initializeShutter();
        camera.getShutterOps().getName();
        camera.getShutterOps().setShutterSpeedSetting(shutterSpeed);
        camera.getShutterOps().activateShutter();
        camera.getShutterOps().releaseShutter();
        camera.getMirrorOps().closeMirror();
        Logger.getInstance().log(camera.getName() + " is closing its digital mode.");
    }

}