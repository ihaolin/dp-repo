package me.hao0.design.pattern.headfirst.command;

public class RemoteLoader {
	
	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
		Light livingRoomLight = new Light();
		Stereo stereo = new Stereo();
		
		LightOffCommand livingRoomLightOn = 
				new LightOffCommand(livingRoomLight);
		StereoOnWithCDCommand stereoOnCommand = 
				new StereoOnWithCDCommand(stereo);
		remoteControl.setCommand(0, stereoOnCommand, null);
	}
}
