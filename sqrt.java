
public class sqrt {
	public static double squareRoot(double c, double l){
        double t = c;
        double root;                 
        int count = 0;
       while (true)
        {
            count++;
            root = 0.5 * (t + (c / t));
            if (Math.abs(root - t) < l)
                break;
            t = root;
        }
      return root;
}
	public static void main (String[] args)
    {
        double c = 327;
        double l = 0.00001;
     
        System.out.println(squareRoot(c, l));
    }
}