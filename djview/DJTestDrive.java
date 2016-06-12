
  
public class DJTestDrive {

    public static void main (String[] args) {
        Model model = new BeatModel();
		ControllerInterface controller = new BeatController(model);
    }
}
