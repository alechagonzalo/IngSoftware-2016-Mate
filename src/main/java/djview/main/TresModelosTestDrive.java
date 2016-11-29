package main;

import main.controllers.BeatController;
import main.controllers.HeartController;
import main.controllers.MemoController;
import main.controllers.interfaces.ControllerInterface;
import main.models.BeatModel;
import main.models.HeartModel;
import main.models.MemoModel;
import main.models.Model;

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
