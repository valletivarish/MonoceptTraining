package com.monocept.isp.violation.test;

import com.monocept.isp.violation.model.IWorker;
import com.monocept.isp.violation.model.Labour;
import com.monocept.isp.violation.model.Robo;

public class IWorkerTest {

	public static void main(String[] args) {
		IWorker labour=new Labour();
		labour.startWork();
		labour.stopWork();
		labour.eat();
		labour.drink();
		IWorker robo=new Robo();
		robo.startWork();
		robo.stopWork();
		robo.eat();
		robo.drink();

	}

}
