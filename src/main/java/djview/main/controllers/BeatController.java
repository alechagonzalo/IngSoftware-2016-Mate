package main.controllers;

import main.views.DJView;
import main.models.Model;
import main.controllers.interfaces.ControllerInterface;
import main.models.interfaces.BeatModelInterface;

public class BeatController implements ControllerInterface {
	BeatModelInterface model;
	DJView view;
   
	public BeatController(Model model) {
		this.model = model;
		view = new DJView(this, model);
        view.createView();
        view.createControls();
		view.disableStopMenuItem();
		view.enableStartMenuItem();
		model.initialize();
	}

    public BeatController(Model model, DJView djView) {
        this.model = model;
        view = djView;
        view.disableStopMenuItem();
        view.enableStartMenuItem();
        model.initialize();
    }
  
	public void start() {
		model.on();
		view.disableStartMenuItem();
		view.enableStopMenuItem();
	}
  
	public void stop() {
		model.off();
		view.disableStopMenuItem();
		view.enableStartMenuItem();
	}
    
	public void increaseBPM() {
        int bpm = model.getBPM();
        model.setBPM(bpm + 1);
	}
    
	public void decreaseBPM() {
        int bpm = model.getBPM();
        model.setBPM(bpm - 1);
  	}
  
 	public void setBPM(int bpm) {
		model.setBPM(bpm);
	}


}
