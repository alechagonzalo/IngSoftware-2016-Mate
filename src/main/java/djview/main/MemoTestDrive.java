package main;

import main.controllers.MemoController;
import main.models.MemoModel;
import main.models.Model;

/**
 * Created by ignacio on 10/06/16.
 */
public class MemoTestDrive {

    public static void main(String args[]){

        Model model = new MemoModel();
        MemoController controller = new MemoController(model);

    }
}
