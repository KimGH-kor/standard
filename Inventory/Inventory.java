package ch08.Inventory;

public class Inventory {

	String goods;
	int num;
	
	public Inventory(String goods, int num){
		this.goods = goods;
		this.num = num;
	}
	
	public void in(int num) {
		this.num += num;
		System.out.println("�԰� �Ǿ����ϴ�.");
	}
	public void out(int num) {
		if(this.num >= num) {
			this.num -= num;
			System.out.println("��� �Ǿ����ϴ�.");
		}else {
			System.out.println("������ �����մϴ�.");
		}
		
	}
	
	
	public String getGoods() {
		return goods;
	}

	public void setGoods(String goods) {
		this.goods = goods;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}