public class helloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println(helloWorld.find(new int[]{1, 2, 3, 4, 6, 7, 8}));
		System.out.println(helloWorld.find(new int[]{1, 2, 5}));
	}
	
    static Integer find(final int[] array) {
        for (int i = array[0]; i < array[0] + array.length - 1; i++) {
          if (array[i] != (i + 1)) {
            System.out.println(array[i]);
            return array[i];
          }
        }
        return null;
    }
}
