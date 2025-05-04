/*Write a java program to exchange the value of 4 variables W,G,K,A such that the value of W will move to A,
  A to K, K to G and finally G to W. Exchange using with and without using extra variables.    */
public class QUE_5 {

	public static void main(String[] args)
	{
        System.out.println("before swaping");
        int w =1;
        int a =2;
        int k =3;
        int g =4;
        System.out.println("w" + w +""+"a"+a+""+"k"+k+""+"g"+g);
        System.out.println("after swaping");
        w=w+a+k+g;
        a=w-(a+k+g);
        k=w-(a+k+g);
        g=w-(a+k+g);
        w=w-(a+k+g);
        System.out.println("w" + w +""+"a"+a+""+"k"+k+""+"g"+g);
          System.out.println("With variable");
          int W =1;
          int G =2;
          int K =3;
          int A =4;
          int Z;
          Z = A;
          A = W;
          W = G;
          G = K;
          K = Z;
          System.out.println(W);
          System.out.println(G);
          System.out.println(K);
          System.out.println(A);
          
	}

}
