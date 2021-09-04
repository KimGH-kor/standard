package ch01;


import java.util.Scanner;

public class Hotel {
	static int[][] arr = new int[4][4];
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int i = 0;
		boolean re = true;
		int in = 0;
		int out = 0;
		
		line();
		while(re) {
			System.out.println("1.���� 2.��� 3.������Ȳ 4.����");
			try{
				i = sc.nextInt();
			}catch(Exception e) {
				System.out.println("���ڸ� �����ּ���");
				sc = new Scanner(System.in);
			}
			switch (i) {
			case 1: //����
				roomInfo();
				System.out.println("������ ���ϴ� ������ �Է��� �ּ���");
				try{
				in = sc.nextInt();
				stay(in);
				}catch(Exception e) {
					System.out.println("���ڸ� �����ּ���");
					sc = new Scanner(System.in);
				}
				line();
				break;
				
			case 2: //���
				roomInfo();
				System.out.println("����� ���ϴ� ������ �Է��� �ּ���");
				try{
				out = sc.nextInt();
				live(out);
				}catch(Exception e) {
					System.out.println("���ڸ� �����ּ���");
					sc = new Scanner(System.in);
				}
				line();
				break;
				
			case 3: //���� ��Ȳ
				roomInfo();
				line();
				break;
				
			case 4: //����
				re = false;
				line();
				break;
			default:
				System.out.println("��ȣ�� �ٽ� �����ּ���");
			}

		}
		}
	
	
	public static void stay(int in) {//����
		try {
		int x = (in%10)-1;//ȣ��
		int y = (in/100)-1;//����
		int z = (in/10%10);//��� ���� ������ 0
		if(y < 4 && z == 0 && x < 4) {
			if(arr[y][x] == 0) {
				arr[y][x] = 1;
				System.out.println(in+"�� ������ �Ϸ�Ǿ����ϴ�. ���� �Ϸ� �Ǽ���~!");
			}else {
				System.out.println("�̹� ���� ���Դϴ�.");
			}
		}else {
			System.out.println("���� ���Դϴ�. �ٽ� ���� �ּ���");
		}
		}catch(Exception e) {

		}
	}
	
	public static void live(int out) {//���

		int x1 = (out%10)-1;
		int y1 = (out/100)-1;
		int z1 = (out/10%10);
		if(y1 < 4 && z1 == 0 && x1 < 4) {
			if(arr[y1][x1] == 1) {
				arr[y1][x1] = 0;
				System.out.println(out+"�� ����� �Ϸ�Ǿ����ϴ�. �̿��� �ּż� �����մϴ�");
			}else {
				System.out.println("�̹� ����Դϴ�. �ٽ� ���� �ּ���");
			}
		}else {
			System.out.println("���� ���Դϴ�. �ٽ� ���� �ּ���");
		}
	}
	
	public static void roomInfo() {//��Ȳ
		star();
		System.out.println("���� ���� ��Ȳ��");
		int j = 401;
		
		while(true) {
			System.out.print(j);
			if(arr[(j/100)-1][(j%10)-1] == 0) {
				System.out.print("(���) ");
			}else {
				System.out.print("(���) ");
			}
			
			if(j == 104) {
				break;
			}
			
			if(j%10 == 4) {
				j -=104;
				System.out.println();
			}
			j++;					
		}
		System.out.println();
		System.out.println("�Դϴ�.");
		star();
	}
	public static void line() {
		System.out.println("==========================================");
	}
	public static void star() {
		System.out.println("********************************");
	}
}
