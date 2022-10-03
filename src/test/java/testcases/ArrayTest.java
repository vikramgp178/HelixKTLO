package testcases;

public class ArrayTest {
//comment by vikram
	public static int z =100;
	public final static int q=300;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		z=400;
		//q=200;
		System.out.println("z:"+z);
		System.out.println("q:"+q);
		int[][][] array = new int[2][3][4];
		
	/*	array[0][0][0]=10;
		array[0][0][1]=20;
		array[0][0][2]=30;
		
		
		array[1][0][0]=10;
		array[1][0][1]=20;
		array[1][0][2]=30;
		
		array[2][0][0]=10;
		array[2][0][1]=20;
		array[2][0][2]=30;*/
		
		
	
	
		
		
		
		System.out.println("Array size :"+array.length);
		System.out.println("Array size :"+array[0].length);
		System.out.println("Array size :"+array[1].length);
		
		for(int i=0;i<array.length;i++) {
			for (int j=0;j<array[i].length;j++) {
				for (int k=0;k<array[i][j].length;k++) {
					array[i][j][k]=(int) (Math.random()*1000);
					System.out.print(array[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
			
		}
		
	}

}
