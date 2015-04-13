
public class SoftwareTest_E2_1 {
	public static void main(String[] args){
		//1 2 4 5 7
		calculate(1, 2);
		//1 3 4 5 7
		calculate(-1, 2);
		//1 3 4 6 7
		calculate(-2, 2);
	}
	
	//输入x，y，求结果r
	//中间值t的求值方式为：若x>=0,t=x^2+1，若x<0，t=-x^2+1
	//若t>0，r=t-y,若t<=0，r=t+y；
	public static int calculate(int x, int y) {
		int t = 0;
		if (x >= 0) {
			t = x * x + 1;
		} else {
			t = -x * x + 2;
		}
		int r = 0;
		if (t > 0) {
			r = t - y;
		} else {
			r = t + y;
		}
		return r;
	}
	
}
