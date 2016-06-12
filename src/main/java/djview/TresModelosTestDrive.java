/**
 * Created by ignacio on 12/06/16.
 */
public class TresModelosTestDrive {

    public static void main(String args[]){

        Model memoModel = new MemoModel();
        ControllerInterface memoController = new MemoController(memoModel);

        Model heartModel = HeartModel.getInstance();
        ControllerInterface heartController = new HeartController(heartModel);

        Model beatModel = new BeatModel();
        ControllerInterface beatController = new BeatController(beatModel);


    }
}
