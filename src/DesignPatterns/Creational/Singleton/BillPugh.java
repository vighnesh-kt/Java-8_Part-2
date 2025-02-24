package DesignPatterns.Creational.Singleton;

public class BillPugh {
	
	private BillPugh() {
		
	}
	
	private static class BillPughHelper{
		private static final BillPugh obj=new BillPugh();
	}
	public static BillPugh getObj() {
		return BillPughHelper.obj;
	}

}
