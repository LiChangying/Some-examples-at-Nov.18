import java.util.*;
public class YangHuiTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("������������ǵ�����");
		int n = scan.nextInt();
		int b[][] = new int[n][];
		for(int i=0;i<b.length;i++){//�б���
			b[i] = new int[i+1];
			for(int j=0;j<=b[i].length-1;j++){//�б���
				if(i==0||j==0||j==b[i].length-1){//��������ߵ�Ԫ�ض���1
					b[i][j] = 1;
					
				}else{
					b[i][j] = b[i-1][j] + b[i][j-1];
					
				}System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
