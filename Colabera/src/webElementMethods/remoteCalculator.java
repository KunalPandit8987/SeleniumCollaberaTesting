package webElementMethods;

public class remoteCalculator implements varargsCalculator {
	public int add(int...arr) {
	int sum=0;
	for(int a: arr) {
		sum=sum+a;
	}
	return sum;

	}
}
