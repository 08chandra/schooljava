package gamespinner;

public class Sample {

	public static void main(String[] args) {
		String[] gmails= {"abc","def","ghi","jkl","abc1","def1","ghi1","jkl1","abc2","def2","ghi2","jkl2","abc3","def3","ghi3","jkl3","abc4","def4","ghi4","jkl4","abc5","def5","ghi5"};
		String[] ids= {"100","200","300"};
		
		for(int i=0;i<gmails.length;i++) {
			int ind=i%ids.length;
			System.out.println("gmails length: "+gmails.length+", index :"+ind);
			System.out.println("gmail: "+gmails[i]+", proy :"+ids[ind]);
		}
		
	}

}