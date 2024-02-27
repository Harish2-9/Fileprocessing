package Practice2;

import DummyPackage.DummyException;

public class Fileutils {

	public int Sub(int num) throws DummyException{
		if(num<10) {
			throw new DummyException("Number less than 10");
		}
		return num-10;
	}
		
		
	}
