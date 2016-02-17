public class Container {

  public static void main(String[] args){
    int contSize = 20;
    int tempWeight = 0;
    int tempValue = 0;

    int[][] objects = {{3, 5},{2, 3},{4, 3},{4, 7},{1, 2},{6, 10}};
    int temp = 0;
    for (int i=1; i<=objects.length; i++) {
      temp+= choose(objects.length+1, i);
      System.out.println(temp);
    }

    for (int i = 0; i<objects.length; i++) {
      // System.out.println(objects[i][0]);

      if (tempWeight+objects[i][0] < contSize) {
        tempWeight+= objects[i][0];
        tempValue+= objects[i][1];
      }else {
         break;
      }
      System.out.println(objects[i][0] + " " + objects[i][1]);
      System.out.println(tempWeight + " " + tempValue);
      System.out.println();
      // tempWeight = objects[i][0];
      // tempValue = objects[i][1];
      //
      // if (tempWeight<) {
      //
      // }
    }




  }

  public static int choose(int n, int k){
		return (getFact(n)/(getFact(k)*getFact(n-k)));
	}


	// Method to get the factorial of an integer n
	public static int getFact(int n){
		if (n>1)
			return n*getFact(n-1);
		else
			return 1;
	}

}
