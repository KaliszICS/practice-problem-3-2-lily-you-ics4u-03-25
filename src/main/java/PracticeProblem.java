public class PracticeProblem {

	public static void main(String args[]) {
		int q1 = towerOfHanoi(4);
		System.out.println(q1);

	}

	public static int towerOfHanoi(int num){
		if(num < 3){
			return -1;
		}
		if(num == 3){
			return 7;
		}

		return 2 * towerOfHanoi(num-1) + 1;
	}
}