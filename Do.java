import java.util.Scanner;
public class Do {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan  = new Scanner(System.in);
		System.out.println("输入菱形行数：");
		int n = scan.nextInt();
		if(n%2==0){
			n++;
		}
		for(int i=0;i<n/2+1;i++){
			for(int j=n/2+1;j>i+1;j--){
				System.out.print(" ");
			}
			for(int j=0;j<2*i+1;j++){
				if(j==0||j==2*i){
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=n/2;i>0;i--){
			for(int j=0;j<n/2-i;j++){
				System.out.print(" ");
			}
			for(int j=0;j<2*i+1;j++){
				if(j==1||j==2*i-1){
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
