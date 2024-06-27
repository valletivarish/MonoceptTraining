package com.monocept.isp.solution.test;

import com.monocept.isp.solution.model.IWorkable;
import com.monocept.isp.solution.model.IWorker;
import com.monocept.isp.solution.model.Labour;
import com.monocept.isp.solution.model.Robo;

public class WorkerTest {

	public static void main(String[] args) {
		IWorker labour=new Labour();
		labour.startWork();
		labour.stopWork();
		labour.eat();
		labour.drink();
		
		IWorkable robo=new Robo();
		robo.startWork();
		robo.stopWork();

	}

}
