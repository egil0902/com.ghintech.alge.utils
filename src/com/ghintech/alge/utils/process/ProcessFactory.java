package com.ghintech.alge.utils.process;

import org.adempiere.base.IProcessFactory;
import org.compiere.process.ProcessCall;

public class ProcessFactory implements IProcessFactory{

	@Override
	public ProcessCall newProcessInstance(String className) {
		// TODO Auto-generated method stub
		if(className.equals("com.ghintech.alge.utils.process.OrderBatchProcess"))
			return new OrderBatchProcess();
		if(className.equals("com.ghintech.alge.utils.process.BankRegister"))
			return new BankRegister();
		
		return null;
	}

}
