package FunctionalProblem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class arraylist {
public static void main(String[] args) {
	ArrayList<Integer> list=new ArrayList<>();
	list.add(10);
	list.add(30);
	System.err.println(list);
	List<Integer> list2= Arrays.asList(1,3,7,8,9);
	
	for(Integer value :list) {
		System.err.println(value);
	}
	boolean isvalueEmpty=list.isEmpty();
	System.err.println("value of list  = "+isvalueEmpty);
}
}
