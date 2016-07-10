package me.hao0.design.pattern.headfirst.proxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class RmiClient {

	public static void main(String[] args) {
		try {
			MyRemote service = (MyRemote) Naming.lookup("RemoteHello");
			System.out.println(service.sayHello());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
	}
}
