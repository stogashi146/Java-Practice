
public class Chapter08 {
	public static void main(String[] args) {
		int num = 1;
		while(num < 5) {
			System.out.println(num * num);
			num++;
		}

		int array1[] = {1,2,3,4};

		for(int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);

		}

		for(int i:array1) {
			if(i%2==0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
