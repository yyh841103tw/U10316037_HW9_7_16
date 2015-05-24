public class Array{
  public static void main(String[] args) {
    int array[][] = { { 4, 2 }, { 1, 7 }, { 4, 5 }, { 1, 2 }, { 1, 1 }, { 4, 1 } };
    System.out.println("Your array is :\n{ 4, 2 }, { 1, 7 }, { 4, 5 }, { 1, 2 }, { 1, 1 }, { 4, 1 } ");
    sort(array);

        System.out.print("You new array is:\n");
	for (int i = 0; i < array.length; i++) {
   	System.out.print("{" + array[i][0] + ", " + array[i][1] + "}");
  	


     }
  }

  public static void sort(int array[][]) {
    for (int i = 0; i < array.length; i++) {
      double currentMin = array[i][0];
      int currentMinIndex = i;

      for (int j = i; j < array.length; j++) {
        if (currentMin > array[j][0] || (currentMin == array[j][0] && array[currentMinIndex][1] > array[j][1])) {
          currentMin = array[j][0];
          currentMinIndex = j;
        }
      }

     
      if (currentMinIndex != i) {
        int temp0 = array[currentMinIndex][0];
        int temp1 = array[currentMinIndex][1];
        array[currentMinIndex][0] = array[i][0];
        array[currentMinIndex][1] = array[i][1];
        array[i][0] = temp0;
        array[i][1] = temp1;
      

      }
    }
  }

 }
