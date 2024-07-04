package com.monocept.behavorial.comand.model;

public class OnCommand implements ICommand {
	Television tv;
	
	public OnCommand(Television tv) {
		super();
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.on();

	}

}
