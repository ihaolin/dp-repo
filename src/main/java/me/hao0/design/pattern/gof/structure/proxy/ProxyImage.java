package me.hao0.design.pattern.gof.structure.proxy;

/**
 * 这里通过代理图片，对RealImage实现懒加载和缓存
 */
public class ProxyImage implements Image {

	private RealImage realImage;
	private String fileName;

	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void display() {
		if (realImage == null) {
			realImage = new RealImage(fileName);
		}
		realImage.display();
	}
}