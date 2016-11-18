import java.util.Scanner;
public class JudgeMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("ÇëÊäÈëÔÂ·İ£º");
		int month = scan.nextInt();
		String str = null;
		switch(month){
		case 1:
		case 2:
		case 3:
			str = "´º¼¾";
			break;
		case 4:
		case 5:
		case 6:
			str = "ÏÄ¼¾";
			break;
		case 7:
		case 8:
		case 9:
			str = "Çï¼¾";
			break;
		case 10:
		case 11:
		case 12:
			str = "¶¬¼¾";
			break;
		default:
			str = "ÊäÈë´íÎó";
		}
		System.out.println("¼¾½ÚÊÇ£º"+str);
	}

}
