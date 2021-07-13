
public class BaseBall extends Sports{

	BaseBall(String name, int player){
		super(name, player);
	}
	//overring
	public void rule(){
    System.out.println("baseball rule");
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseBall bb = new BaseBall("baseball", 9);
		System.out.println("Sport:"+bb.getName());
		System.out.println("Player:"+bb.getPlayer());
		System.out.print("rule: ");
		bb.rule();
	}

}
