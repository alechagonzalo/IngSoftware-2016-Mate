
  
public class HeartController implements ControllerInterface {
	Model model;
	DJView view;
  
	public HeartController(Model model) {
		this.model = model;
		view = new DJView(this, model);
        view.createView();
        view.createControls();
		view.disableStopMenuItem();
		view.disableStartMenuItem();
	}
  
	public void start() {}
 
	public void stop() {}
    
	public void increaseBPM() {
		if(HeartModel.getInstance() == null)
			view.setBPMOutputLabel("intento nº:" + 
		HeartModel.intentosDeInstanciacion);
	}
    
	public void decreaseBPM() {}
  
 	public void setBPM(int bpm) {}
}



