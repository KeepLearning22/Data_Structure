package ads;

//create pascal triangle
//		1
//	  1   1	
//  1   2   1
//1   3   3   1	  
//	  
	  
	  
import java.util.ArrayList;
import java.util.List;


public class PascalTriangle {
	public static List<List<Integer>> createTriangle(int rowcount){
		List<List<Integer>> triangle = new ArrayList<>();
		if(rowcount==0)
			return triangle;
		List<Integer> first_row=new ArrayList<>();
		first_row.add(1);
		triangle.add(first_row);
		
		for(int i=1;i<rowcount;i++) {
			List<Integer> prev_row = triangle.get(i-1);//returns previous row(list)
			List<Integer> row = new ArrayList<>();
			
			row.add(1);//each row have first element as 1
			for(int j=1;j<i;j++) {
				row.add(prev_row.get(j-1)+prev_row.get(j));
			}
			row.add(1);
			triangle.add(row); //adding the created row in origional pascal triangle
		}
		return triangle;
	  }
  public static void main(String args[]) {
	createTriangle(4);
  }
  
}
