package ch08.Inventory;

import java.util.Scanner;

public class Main {
	static int index = 0;
	public static void main(String[] args) {
		Inventory[] arr = new Inventory[100];
		Scanner sc = new Scanner(System.in);
		
		boolean bl = true;
		int select;
		int num;
		String name;
		int tr;
		
		
		while(bl) {
			System.out.println("1.입고 2.출고 3.삭제 4.현황 5.종료");
			select = sc.nextInt();
			
			switch (select) {
			case 1: 
				System.out.println("입고 할 상품을 입력해 주세요");
				name = sc.next();
				System.out.println("상품의 갯수를 입력해 주세요");
				num = sc.nextInt();
				tr = find(arr, name);//있다면 몇번째인지 출력 없다면 -1
				
				if(tr < 0) {//없다면 추가
				arr[index] = new Inventory(name, num);
				index++;
				}else {//있다면 갯수만 추가
					arr[tr].in(num);
				}
				break;
			case 2: 
				System.out.println("출고 할 상품을 선택해 주세요");
				name = sc.next();
				System.out.println("출고 할 갯수를 입력해 주세요");
				num = sc.nextInt();
				
				tr = find(arr,name);//있다면 몇번째인지 없다면 -1
				
				if(tr < 0) {
					System.out.println("없는 제품입니다.");
				}else {
					arr[tr].out(num);
				}
				
				break;
			case 3: 
				System.out.println("삭제할 제품을 선택해 주세요");
				name = sc.next();
				tr = find(arr,name);
				
				if(tr < 0) {
					System.out.println("존재하지 않는 제품입니다.");
				}else {
				remove(arr,name,tr);
				System.out.println("삭제 되었습니다.");
				}
				break;
			case 4: 
				show(arr);
				break;
			case 5: 
				bl = false;
				System.out.println("이용 감사합니다.");
				break;			
			default:
				System.out.println("숫자를 잘못 입력 하셨습니다.");
			}
		}
		
		
	}
	public static int find(Inventory[] arr, String name) {
		for(int i = 0; i < index; i++) {
			if(arr[i].getGoods().equals(name)) {
				return i;
			}
		}
		return -1;
	}
	
	public static void show(Inventory[] arr) {
		System.out.println("현재 입고 상황은");
		for(int i =0; i < index; i++) {
			System.out.println(arr[i].getGoods()+" : "+arr[i].getNum());
		}
		System.out.println("입니다");
	}
	
	public static void remove(Inventory[] arr, String name, int tr) {
		for(int i = tr; i < index; i++) {
			arr[i] = arr[i+1];
			
			
		}
		
		
		index--;
		
		
	}
}