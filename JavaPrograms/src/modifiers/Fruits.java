package modifiers;

public class Fruits {
	
		
	private	String name ="Fruits";
	public String ve ="carrot";
	protected String cer="cereals";
			String pul="pulses";
	int cost = 100;//default
		static String s ="Orange";
		public void getName() {
			System.out.println("parent class method:"+ name);
		}
		
		protected void getStaticName() {
			System.out.println("parent class method:"+ s);
		}
		
		private void getCost() {
			System.out.println("parent class method:"+cost);
		}
		
	}

	
	
