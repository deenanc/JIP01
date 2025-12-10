package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> arrayList=new ArrayList<String>();
		
		arrayList.add("Comcast");
		arrayList.add("Ford");
		arrayList.add("Standard Charted");
		arrayList.add("PayPal");
		arrayList.add("Walmart");
		
		for(String company:arrayList) {
			System.out.println(company);
		}
		
		for(int i=0;i<arrayList.size();i++) {
			System.out.println(arrayList.get(i));
		}
		
		Iterator<String> it=arrayList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println(arrayList);

	}

}
