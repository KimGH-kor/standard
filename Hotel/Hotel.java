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
			System.out.println("1.숙박 2.퇴실 3.숙박현황 4.종료");
			try{
				i = sc.nextInt();
			}catch(Exception e) {
				System.out.println("숫자를 눌러주세요");
				sc = new Scanner(System.in);
			}
			switch (i) {
			case 1: //숙박
				roomInfo();
				System.out.println("숙박을 원하는 객식을 입력해 주세요");
				try{
				in = sc.nextInt();
				stay(in);
				}catch(Exception e) {
					System.out.println("숫자를 눌러주세요");
					sc = new Scanner(System.in);
				}
				line();
				break;
				
			case 2: //퇴실
				roomInfo();
				System.out.println("퇴실을 원하는 객식을 입력해 주세요");
				try{
				out = sc.nextInt();
				live(out);
				}catch(Exception e) {
					System.out.println("숫자를 눌러주세요");
					sc = new Scanner(System.in);
				}
				line();
				break;
				
			case 3: //숙박 현황
				roomInfo();
				line();
				break;
				
			case 4: //종료
				re = false;
				line();
				break;
			default:
				System.out.println("번호를 다시 눌러주세요");
			}

		}
		}
	
	
	public static void stay(int in) {//숙박
		try {
		int x = (in%10)-1;//호실
		int y = (in/100)-1;//층수
		int z = (in/10%10);//가운데 수는 무조건 0
		if(y < 4 && z == 0 && x < 4) {
			if(arr[y][x] == 0) {
				arr[y][x] = 1;
				System.out.println(in+"방 예약이 완료되었습니다. 좋은 하루 되세요~!");
			}else {
				System.out.println("이미 숙박 중입니다.");
			}
		}else {
			System.out.println("없는 방입니다. 다시 눌러 주세요");
		}
		}catch(Exception e) {

		}
	}
	
	public static void live(int out) {//퇴실

		int x1 = (out%10)-1;
		int y1 = (out/100)-1;
		int z1 = (out/10%10);
		if(y1 < 4 && z1 == 0 && x1 < 4) {
			if(arr[y1][x1] == 1) {
				arr[y1][x1] = 0;
				System.out.println(out+"방 퇴실이 완료되었습니다. 이용해 주셔서 감사합니다");
			}else {
				System.out.println("이미 빈방입니다. 다시 눌러 주세요");
			}
		}else {
			System.out.println("없는 방입니다. 다시 눌러 주세요");
		}
	}
	
	public static void roomInfo() {//현황
		star();
		System.out.println("현재 숙박 현황은");
		int j = 401;
		
		while(true) {
			System.out.print(j);
			if(arr[(j/100)-1][(j%10)-1] == 0) {
				System.out.print("(빈방) ");
			}else {
				System.out.print("(사용) ");
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
		System.out.println("입니다.");
		star();
	}
	public static void line() {
		System.out.println("==========================================");
	}
	public static void star() {
		System.out.println("********************************");
	}
}
