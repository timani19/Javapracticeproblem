package statickeyword;

public class TestDriveWay {
    public static void main(String[] args) {
        DriveWay tashfiaDriveway= new DriveWay();
        tashfiaDriveway.setDriveWaySize(10);
        System.out.println("Tashfia's driveway size is :" + tashfiaDriveway.driveWaySize);

        DriveWay marufsDriveWay= new DriveWay();
        marufsDriveWay.setDriveWaySize(12);
        System.out.println("Maruf's driveway size is :" + marufsDriveWay.driveWaySize);
        System.out.println("Tashfia's driveway size is :" + tashfiaDriveway.driveWaySize);

        DriveWay.shapeOfDriveWay();
    }





}
