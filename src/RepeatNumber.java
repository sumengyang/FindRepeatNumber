//有一个数组a[100],其中存储了1-99的整数，且只有一个数字是重复的。要求实现一个算法给出这个重复的数。
//题目的意思是总共有100个数字，1-99必须都有，然后有一个数是重复的。

public class RepeatNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// 方法1：有个结论如下：1^2^3……98^99 = 0，因此该题目可以利用这个规律。对所有的数据进行异或运算，最后的结果就是重复的数字。
	// 一个规律：在异或到N得过程中(1^2^3^……^N)，
	// 如果N = 4M，则异或结果为4M，
	// 如果N = 4M + 1，则异或结果为1，
	// 如果N = 4M + 2，则异或结果为4M + 1，
	// 如果N = 4M + 3，则异或结果为0.
	public int method1(int[] a) {
		int result = a[0];
		for (int i = 1; i < a.length; i++) {
			result ^= a[i];
		}
		return result;
	}

	// 方法2：因为1到99都存在，因此可以对所有的数组求和然后减去(1+2+3……+99),最后的结果就是重复的数字。
	public int method2(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i] - i;
		}
		return sum;
	}

	// 类似于哈希的方法，记录每个数据出现的次数或者来标记是否出现过，如果在遍历数组的工程中发现某个数据已经出现过，则该数字就是所求的重复数字。
	public int method3(int[] a) {
		int len = a.length;
		int[] buffer = new int[len];
		for (int i = 0; i < a.length; i++) {
			buffer[i] = 0;
		}
		int j = 0;
		for (; j < a.length; j++) {
			if (a[buffer[j]] == 0)
				a[buffer[j]] = buffer[j];
			else
				break;
		}
		return buffer[j];
	}
}
