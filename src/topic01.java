
public class topic01 {
	/**
	 * 1，2，3，4，四个数字组合成3位数字，不相同的组合，一共有多少种
	 */

	public static void main(String[] args) {
		int x,y,z;
		for( x = 1;x<5;x++) {
			for(y = 1;y<5;y++) {
				if(x == y)
					continue;
				for(z = 1;z<5;z++) {
					if(z == x || z == y)
						continue;
					System.out.println(x+","+y+","+z);
				}
				
			}
		}
	}
	
}
