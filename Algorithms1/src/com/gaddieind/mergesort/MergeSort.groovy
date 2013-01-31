package com.gaddieind.mergesort

class MergeSort {
	
	public static void main(String[] args){
		List myList = [8,3,4,2,5,6,1,7,9,0]
		List sorted = sort(myList)
		
		System.out.println(sorted == myList.sort());
		assert sorted == myList.sort()
	}
	
	
	private static List sort(List someList){
		if(someList.size() == 1) return someList
		
		List finalList = new ArrayList()
		int half = someList.size() / 2
		List left = sort(someList.subList(0, half))
		List right = sort(someList.subList(half, someList.size()))
		int i, j = 0
		
		for(int k = 0; k < someList.size(); k++){
			if(i == left.size()){
				finalList.add(k, right.get(j))
				j++
				continue
			}
			
			if(j == right.size()){
				finalList.add(k, left.get(i))
				i++
				continue
			}
			
			if(left.get(i) < right.get(j)){
				finalList.add(k, left.get(i))
				i++
			}else{
				finalList.add(k, right.get(j))
				j++
			}
		}
		
		return finalList
	}
}
