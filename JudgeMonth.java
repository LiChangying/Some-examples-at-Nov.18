import java.util.Scanner;
public class JudgeMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("�������·ݣ�");
		int month = scan.nextInt();
		String str = null;
		switch(month){
		case 1:
		case 2:
		case 3:
			str = "����";
			break;
		case 4:
		case 5:
		case 6:
			str = "�ļ�";
			break;
		case 7:
		case 8:
		case 9:
			str = "�＾";
			break;
		case 10:
		case 11:
		case 12:
			str = "����";
			break;
		default:
			str = "�������";
		}
		System.out.println("�����ǣ�"+str);
	}

}
