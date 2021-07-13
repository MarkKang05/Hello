
public class BasketBall extends Sports{
	BasketBall(String name, int player){
		super(name, player);
	}
	//overring
	public void rule(){
		System.out.println("basketball rule");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasketBall bas = new BasketBall("BasketBall", 9);
		System.out.println("Sport:"+bas.getName());
		System.out.println("Player:"+bas.getPlayer());
		System.out.print("rule: ");
		bas.rule();
	}

}
