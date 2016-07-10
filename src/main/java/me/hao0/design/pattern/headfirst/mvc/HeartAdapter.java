package me.hao0.design.pattern.headfirst.mvc;

/**
 * 适配器模式
 * @author haol
 * @since 2013
 * @focus design pattern【】
 */
public class HeartAdapter implements BeatModelInterface {
	HeartModelInterface heart;
	
	public HeartAdapter(HeartModelInterface heart){
		this.heart = heart;
	}
	
	@Override
	public void initialize() {
		
	}

	@Override
	public void on() {
		
	}

	@Override
	public void off() {
		
	}

	@Override
	public void setBPM(int bpm) {
		
	}

	@Override
	public int getBPM() {
		return heart.getHeartRate();
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
