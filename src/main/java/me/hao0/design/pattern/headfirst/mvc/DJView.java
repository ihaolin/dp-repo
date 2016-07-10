package me.hao0.design.pattern.headfirst.mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 视图
 * @author haol
 * @since 2013
 * @focus design pattern【】
 */
public class DJView implements ActionListener, BeatObserver, BPMObserver {
	BeatModelInterface model;
	ControllerInterface controller;
	JFrame viewFrame;
	JPanel viewPanel;
	JLabel bpmOutputLabel;
	BeatBar beatBar;
	
	public DJView(BeatModelInterface model, ControllerInterface controller) {
		this.model = model;
		this.controller = controller;
		model.registerObserver((BeatObserver)this);
		model.registerObserver((BPMObserver)this);
	}

	public void createView(){
		//create all view components
	}
	
	public void updateBPM(){
		int bpm = model.getBPM();
		if (bpm == 0){
			bpmOutputLabel.setText("Offline");
		} else {
			bpmOutputLabel.setText("Current BPM: " + model.getBPM());
		}
	}
	
	public void updateBeat(){
		beatBar.setValue(100);
	}
	
	public void disableStartMenu(){}
	
	public void enableStartMenu(){}
	
	public void disableStopMenu(){}
	
	public void enableStopMenu(){}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}
