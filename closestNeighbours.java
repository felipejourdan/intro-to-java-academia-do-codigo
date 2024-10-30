public class closestNeighbours {
	public static void main (String[] args) {
		int[] myArray = {4, -5, 1209, 6, 2, 111, 116, 33};
		int smaller = Math.abs(myArray[0] - myArray[1]);
		int smallerIndex = 0;
		System.out.println(smaller);

		for (int i = 1; i < myArray.length - 1; i++){
			if (Math.abs(myArray[i] - myArray[i+1]) < smaller ) {
				smaller = Math.abs(myArray[i] - myArray[i+1]);
				smallerIndex = i;
			}
		}
		System.out.println(myArray[smallerIndex] + " " + myArray[smallerIndex + 1]);
	}
}