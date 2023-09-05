import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class B {

	public static void main(String[] args) {
		
		List <Integer>list= Arrays.asList(54,24,28,10,19,5,22,26,16);
		 
		  List<Integer> list2 = list.stream().sorted().collect(Collectors.toList());
		  System.out.println(list2);

	}

}
