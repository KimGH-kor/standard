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
			System.out.println("1.�԰� 2.��� 3.���� 4.��Ȳ 5.����");
			select = sc.nextInt();
			
			switch (select) {
			case 1: 
				System.out.println("�԰� �� ��ǰ�� �Է��� �ּ���");
				name = sc.next();
				System.out.println("��ǰ�� ������ �Է��� �ּ���");
				num = sc.nextInt();
				tr = find(arr, name);//�ִٸ� ���°���� ��� ���ٸ� -1
				
				if(tr < 0) {//���ٸ� �߰�
				arr[index] = new Inventory(name, num);
				index++;
				}else {//�ִٸ� ������ �߰�
					arr[tr].in(num);
				}
				break;
			case 2: 
				System.out.println("��� �� ��ǰ�� ������ �ּ���");
				name = sc.next();
				System.out.println("��� �� ������ �Է��� �ּ���");
				num = sc.nextInt();
				
				tr = find(arr,name);//�ִٸ� ���°���� ���ٸ� -1
				
				if(tr < 0) {
					System.out.println("���� ��ǰ�Դϴ�.");
				}else {
					arr[tr].out(num);
				}
				
				break;
			case 3: 
				System.out.println("������ ��ǰ�� ������ �ּ���");
				name = sc.next();
				tr = find(arr,name);
				
				if(tr < 0) {
					System.out.println("�������� �ʴ� ��ǰ�Դϴ�.");
				}else {
				remove(arr,name,tr);
				System.out.println("���� �Ǿ����ϴ�.");
				}
				break;
			case 4: 
				show(arr);
				break;
			case 5: 
				bl = false;
				System.out.println("�̿� �����մϴ�.");
				break;			
			default:
				System.out.println("���ڸ� �߸� �Է� �ϼ̽��ϴ�.");
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
		System.out.println("���� �԰� ��Ȳ��");
		for(int i =0; i < index; i++) {
			System.out.println(arr[i].getGoods()+" : "+arr[i].getNum());
		}
		System.out.println("�Դϴ�");
	}
	
	public static void remove(Inventory[] arr, String name, int tr) {
		for(int i = tr; i < index; i++) {
			arr[i] = arr[i+1];
			
			
		}
		
		
		index--;
		
		
	}
}