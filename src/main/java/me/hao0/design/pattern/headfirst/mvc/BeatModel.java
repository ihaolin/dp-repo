package me.hao0.design.pattern.headfirst.mvc;

import java.util.ArrayList;
import java.util.List;
import javax.sound.midi.Sequencer;

public class BeatModel implements BeatModelInterface {
	Sequencer sequencer;
	List<BeatObserver> beatObservers = new ArrayList<BeatObserver>();
	List<BPMObserver> bpmObservers = new ArrayList<BPMObserver>();
	int bpm = 90;
	
	@Override
	public void initialize() {
		setUpMidi();
		buildTrackAndStart();
	}

	private void buildTrackAndStart() {
		
	}

	private void setUpMidi() {
		
	}

	@Override
	public void on() {
		sequencer.start();
		setBPM(bpm);
	}

	@Override
	public void off() {
		setBPM(0);
		sequencer.stop();
	}

	@Override
	public void setBPM(int bpm) {
		this.bpm = bpm;
		sequencer.setTempoInBPM(getBPM());
		notifyBPMObservers();
	}

	private void notifyBPMObservers() {
		
	}

	@Override
	public int getBPM() {
		return this.bpm;
	}
	
	public void beatEvent(){
		notifyBeatObservers();
	}

	private void notifyBeatObservers() {
		
	}

	@Override
	public void registerObserver(BeatObserver observer) {
		
	}

	@Override
	public void removeObserver(BeatObserver observer) {
		
	}

	@Override
	public void registerObserver(BPMObserver observer) {
		
	}

	@Override
	public void removeObserver(BPMObserver observer) {
		
	}
}
