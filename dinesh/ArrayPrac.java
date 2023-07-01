package dinesh;
//greedy problems:  Two city scheduling and Valid Parenthesis String
import java.util.*;

public class ArrayPrac {
	String str;
	cities[] city = {new cities(3,4),new cities(5,6)};
	
	ArrayPrac(String str){
		this.str = str;
		 //cities[] city = {new cities(3,4),new cities(5,6)};// {cities(2,3),cities(3,4)};
		int[] array = new int[] {1, 2, 3, 4, 5};
		//city[0]= cities(2,3);
	}
	
	void prt() {
		System.out.println("length is: "+str.length());
		System.out.println("3rd char is: "+str.charAt(2));
		System.out.println("city 1 is: "+city[1].a);
	}

	public static void main(String[] args) {
		ArrayPrac str1 = new ArrayPrac("te(ting");
		str1.prt();
		if(str1.str.charAt(2)=='(') {
			System.out.println("yes ");
		}else {
			System.out.println("no");
		}
	}
	
}


class cities{
	int a,b;
	cities(int x,int y){
		a=x;b=y;
	}
}