import java.util.*;
public class YangHuiTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入杨辉三角的行数");
		int n = scan.nextInt();
		int b[][] = new int[n][];
		for(int i=0;i<b.length;i++){//行遍历
			b[i] = new int[i+1];
			for(int j=0;j<=b[i].length-1;j++){//列遍历
				if(i==0||j==0||j==b[i].length-1){//如果是两边的元素都是1
					b[i][j] = 1;
					
				}else{
					b[i][j] = b[i-1][j] + b[i][j-1];
					
				}System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
