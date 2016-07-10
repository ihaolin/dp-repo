package me.hao0.design.pattern.headfirst.mvc;

public class BeatController implements ControllerInterface{
	BeatModelInterface model;
	DJView view;
	
	public BeatController(BeatModelInterface model){
		this.model = model;
		view = new DJView(model, this);
		view.createView();
		//view...
		view.enableStartMenu();
		view.disableStopMenu();
		model.initialize();
	}
	
	@Override
	public void start() {
		model.on();
		view.disableStartMenu();
		view.enableStopMenu();
	}

	@Override
	public void stop() {
		model.off();
		view.enableStartMenu();
		view.disableStopMenu();
	}

	@Override
	public void increaseBPM() {
		model.setBPM(model.getBPM()+1);
		view.updateBPM();
	}

	@Override
	public void decreaseBPM() {
		model.setBPM(model.getBPM()-1);
		view.updateBPM();
	}

	@Override
	public void setBPM(int value) {
		model.setBPM(value);
		view.updateBPM();
	}
}
