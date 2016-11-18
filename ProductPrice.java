import java.util.*;
public class ProductPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入消费金额：");
		float r = 0f;
		float price = scan.nextFloat();
		int grade =(int)( price / 200);
		switch(grade){
		case 1:
			r = 0.95f;
			break;
		case 2:
			r = 0.9f;
			break;
		case 3:
			r = 0.85f;
			break;
		case 4:
			r = 0.8f;
			break;
		case 5:
			r = 0.75f;
			break;
		case 6:
			r = 0.7f;
			break;
		default:
			r = 0f;
		}
		System.out.println("折扣为"+r);
		System.out.println("应支付："+(price*r)+"￥");
	}

}
