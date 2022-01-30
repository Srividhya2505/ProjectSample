package org.phone1;

public class InternalStorage {
	

	private void processorName() {
		// TODO Auto-generated method stub
	System.out.println("The Processor is Octa-core");

	}

	private void ramSize() {
		// TODO Auto-generated method stub
	System.out.println("The RAM size is 8GB");

	}
	
  public static void main(String[] args) {
	InternalStorage i = new InternalStorage();
	i.processorName();
	i.ramSize();
	
	ExternalStorage e = new ExternalStorage();
	e.Size();
	
	
  }
}
