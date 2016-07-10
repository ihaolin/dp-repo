package me.hao0.design.pattern.headfirst.command;

/**
 * 打开音箱命令
 * @author haol
 * @since 2013
 * @focus design pattern【】
 */
public class StereoOnWithCDCommand implements Command {
	private Stereo stereo;
	
	public StereoOnWithCDCommand(Stereo stereo){
		this.stereo = stereo;
	}
	
	@Override
	public void execute() {
		stereo.on();
		stereo.setCD();
		stereo.setVolume(11);
	}
}
