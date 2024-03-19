package com.iocexample.main;

import com.iocexample.employee.Employee;
import com.iocexample.factory.Factory;

public class Main {

	public static void main(String[] args) {
		Factory factory = new Factory(new Employee());
		factory.getOnDuty();
		factory.getOffDuty();
	}

}
