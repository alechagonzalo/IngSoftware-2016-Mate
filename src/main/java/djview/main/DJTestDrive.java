package main;

import main.controllers.BeatController;
import main.controllers.interfaces.ControllerInterface;
import main.models.BeatModel;
import main.models.Model;

public class DJTestDrive {

    public static void main (String[] args) {
        Model model = new BeatModel();
		ControllerInterface controller = new BeatController(model);
    }
}
