package practice2;
import java.util.Scanner;

public class StarTriangle{
   public int x;
   public StarTriangle(int star) {
	   x=star;
   }
   
   public String toString() {
	   StringBuilder res=new StringBuilder();
	   for (int i=1;i<=x;i++) {
		   for(int j=1;j<=i;j++) {
			   res.append("[*]");
		   }
		   res.append("\n");
	   }
	   return res.toString();
   }



public static void main(String[] args) {
	StarTriangle small=new StarTriangle(9);
	System.out.println(small.toString());
	
} }