package com.monocept.behavorial.comand.test;

import com.monocept.behavorial.comand.model.ICommand;
import com.monocept.behavorial.comand.model.OffCommand;
import com.monocept.behavorial.comand.model.OnCommand;
import com.monocept.behavorial.comand.model.RemoteControl;
import com.monocept.behavorial.comand.model.Television;

public class CommandTest {

	public static void main(String[] args) {
		Television tv=new Television();
		ICommand onCommand=new OnCommand(tv);
		ICommand offCommand=new OffCommand(tv);
		
		RemoteControl remote=new RemoteControl(onCommand);
		remote.pressButton();
		System.out.println(tv.isStatus());
		
		remote.setCommand(offCommand);
		remote.pressButton();
		System.out.println(tv.isStatus());

	}

}
