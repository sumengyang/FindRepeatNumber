/*有一个长度为100数组，里面的数字从0到99，其中有2个数字重复，请找出重复的那个数。  
第2题与第1题是不一样的，因为第2题是要求0~99，正好100个数字，有两个数字重复，则必然有一个数字是缺失的。
第1题的解放中，只有方法3是可以的。*/

public class RepeatNumberII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// 类似于哈希的方法，记录每个数据出现的次数或者来标记是否出现过，如果在遍历数组的工程中发现某个数据已经出现过，则该数字就是所求的重复数字。
	public int method1(int[] a) {
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

	// 方法2：假设a重复了2次，b缺失，则数组求和以后减去(1+2+3+……+99)以后得到的就是a-b的值，
	// 同时对数组求平方和然后减去(1*1+2*2+……+99*99)得到a*a-b*b的值，然后解方程组可以得到a的值，同时也可以得到b的值。
	public int method2(int[] a) {
		int sum = 0;
		int sum0 = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i] - i;
			sum0 = sum0 + a[i] * a[i] - i * i;
		}
		sum0 = sum0 / sum;
		return (sum + sum0) / 2;
	}
}
