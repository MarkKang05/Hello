
public class Pizza {
	private String kind;
	private int size;
	
	public Pizza(){}
	public Pizza(String kind){
		this.kind = kind;
	}
	public Pizza(String kind, int size){
		this(kind);
		this.size = size;
	}
	
	
	void toPrint(){
		System.out.println("종류:"+ this.kind+" 크기:"+this.size);
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	
}
