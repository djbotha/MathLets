public class Factorial{

  public static void main(String[] args) {
    String cmd = args[0];

    switch(cmd){
      case "-f":
        System.out.println(getFact(Integer.parseInt(args[1])));
        break;
      case "-c":
        System.out.println(choose(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
        break;
    }
  }

  // n choose k function
  public static int choose(int n, int k){
    return (getFact(n)/(getFact(k)*getFact(n-k)));
  }

  // get the factorial of an integer n
  public static int getFact(int n){
    if (n>1)
      return n*getFact(n-1);
    else
      return 1;
  }
}
