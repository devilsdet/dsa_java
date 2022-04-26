package dsa_java.recursion;

import java.util.ArrayList;
import java.util.List;

public class SortAnArrayRecursively_03 {

	public static void main(String[] args) {
		int[] num = {5, 2, 7, 8, 3};
		
		List<Integer> numList = new ArrayList<>();
		for(int i=0; i<num.length; i++) {
			numList.add(num[i]);
		}
		
		List<Integer> output = sortArray(numList);
		for(int i=0; i<output.size(); i++) {
			System.out.print(output.get(i) + "  ");
		}

	}

	private static List<Integer> sortArray(List<Integer> numList) {
		if(numList.size() == 1) {
			return numList;
		}
		int n = numList.get(numList.size() - 1);
		numList.remove(numList.size() - 1);
		numList = sortArray(numList);
		numList = insert(numList, n);
		return numList;
		
	}
	
	private static List<Integer> insert(List<Integer> numList, int n) {
		if(numList.size() == 0) {
			numList.add(n);
			return numList;
		} else if(numList.get(0)>= n) {
			numList.add(0, n);
			return numList;
		} else if(numList.get(numList.size() -1) <= n) {
			numList.add(numList.size(), n);
			return numList;
		}
		int temp1 = numList.get(numList.size() - 1);
		numList.remove(numList.size() - 1);
		numList = insert(numList, temp1);
		numList.add(temp1);
		return numList;
	}

}
