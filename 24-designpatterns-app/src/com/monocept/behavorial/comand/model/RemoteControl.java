package com.monocept.behavorial.comand.model;

public class RemoteControl {
	ICommand command;
	
	public RemoteControl(ICommand command) {
		super();
		this.command = command;
	}

	public void pressButton() {
		command.execute();
	}

	public ICommand getCommand() {
		return command;
	}

	public void setCommand(ICommand command) {
		this.command = command;
	}
}
