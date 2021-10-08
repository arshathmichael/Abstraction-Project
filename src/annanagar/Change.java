package annanagar;

public class Change extends Property {
	private void son_Name() {
		System.out.println("Michael");
	}
	@Override
	public void father_Name() {
		super.father_Name();
	}
	
	
	public static void main(String[] args) {
		Change store = new Change();
		store.son_Name();
		store.father_Name();
		
		
	}

}
