//��һ������a[100],���д洢��1-99����������ֻ��һ���������ظ��ġ�Ҫ��ʵ��һ���㷨��������ظ�������
//��Ŀ����˼���ܹ���100�����֣�1-99���붼�У�Ȼ����һ�������ظ��ġ�

public class RepeatNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// ����1���и��������£�1^2^3����98^99 = 0����˸���Ŀ��������������ɡ������е����ݽ���������㣬���Ľ�������ظ������֡�
	// һ�����ɣ������N�ù�����(1^2^3^����^N)��
	// ���N = 4M���������Ϊ4M��
	// ���N = 4M + 1���������Ϊ1��
	// ���N = 4M + 2���������Ϊ4M + 1��
	// ���N = 4M + 3���������Ϊ0.
	public int method1(int[] a) {
		int result = a[0];
		for (int i = 1; i < a.length; i++) {
			result ^= a[i];
		}
		return result;
	}

	// ����2����Ϊ1��99�����ڣ���˿��Զ����е��������Ȼ���ȥ(1+2+3����+99),���Ľ�������ظ������֡�
	public int method2(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i] - i;
		}
		return sum;
	}

	// �����ڹ�ϣ�ķ�������¼ÿ�����ݳ��ֵĴ�������������Ƿ���ֹ�������ڱ�������Ĺ����з���ĳ�������Ѿ����ֹ���������־���������ظ����֡�
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
