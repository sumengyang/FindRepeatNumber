/*��һ������Ϊ100���飬��������ִ�0��99��������2�������ظ������ҳ��ظ����Ǹ�����  
��2�����1���ǲ�һ���ģ���Ϊ��2����Ҫ��0~99������100�����֣������������ظ������Ȼ��һ��������ȱʧ�ġ�
��1��Ľ���У�ֻ�з���3�ǿ��Եġ�*/

public class RepeatNumberII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// �����ڹ�ϣ�ķ�������¼ÿ�����ݳ��ֵĴ�������������Ƿ���ֹ�������ڱ�������Ĺ����з���ĳ�������Ѿ����ֹ���������־���������ظ����֡�
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

	// ����2������a�ظ���2�Σ�bȱʧ������������Ժ��ȥ(1+2+3+����+99)�Ժ�õ��ľ���a-b��ֵ��
	// ͬʱ��������ƽ����Ȼ���ȥ(1*1+2*2+����+99*99)�õ�a*a-b*b��ֵ��Ȼ��ⷽ������Եõ�a��ֵ��ͬʱҲ���Եõ�b��ֵ��
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
