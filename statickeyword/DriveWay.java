package statickeyword;

// when we declare property/variable and method as STATIC then, when can call them without creating an object.
// If we set our variable to STATIC, and set this variable to different object, then it will update new value for the corresponding.
// for example- we created tashfiadriveway object and set driveway size to 10. and also created marufsdriveway and set it to 12. now if I call tashfia's
// driveway again it will show the new value (12) for tashfia's driveway as well
// also we can call a static method in our main class without creating an object.

public class DriveWay {
    public static int driveWaySize;   //Properties/variable

    public void setDriveWaySize(int driveWaySize) {
        this.driveWaySize = driveWaySize;
    }

    public int getDriveWaySize() {
        return driveWaySize;
    }

    public static void shapeOfDriveWay() {
        System.out.println("Shape of driveway is rectangular");
    }

}
