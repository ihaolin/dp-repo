package me.hao0.design.pattern.headfirst.decorate.jdk;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 通过装饰器模式
 * 自己定制的大写式输入流
 * @author haol
 * @since 2013
 * @focus design pattern【decorator】
 */
public class UpperCaseInputStream extends FilterInputStream {

	protected UpperCaseInputStream(InputStream in) {
		super(in);
	}

	@Override
	public int read() throws IOException {
		int c = super.read();
		return (c == -1)? c : Character.toUpperCase((char)c);
	}

	@Override
	public int read(byte[] b, int off, int len) throws IOException {
		int result = super.read(b, off, len);
		for (int i=off; i<len; i++){
			b[i] = (byte)Character.toUpperCase((char)b[i]);
		}
		return result;
	}
}
