package com.monocept.behavorial.comand.model;

public class OffCommand implements ICommand {
	Television tv;
	
	public OffCommand(Television tv) {
		super();
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.off();

	}

}
