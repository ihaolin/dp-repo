package me.hao0.design.pattern.headfirst.mvc;

public interface ControllerInterface {
	void start();
	void stop();
	void increaseBPM();
	void decreaseBPM();
	void setBPM(int value);
}
