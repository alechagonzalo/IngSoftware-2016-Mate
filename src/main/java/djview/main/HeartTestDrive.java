package main;

import main.controllers.HeartController;
import main.controllers.interfaces.ControllerInterface;
import main.models.HeartModel;
import main.models.Model;

public class HeartTestDrive {

    public static void main (String[] args) {
		Model heartModel = HeartModel.getInstance();
        ControllerInterface model = new HeartController(heartModel);
    }
}
