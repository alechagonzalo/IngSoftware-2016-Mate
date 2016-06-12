
  
public class HeartTestDrive {

    public static void main (String[] args) {
		Model heartModel = HeartModel.getInstance();
        ControllerInterface model = new HeartController(heartModel);
    }
}
