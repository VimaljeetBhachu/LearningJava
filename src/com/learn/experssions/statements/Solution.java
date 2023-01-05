package com.learn.experssions.statements;
import java.util.Arrays;
//Leetcode
class Solution {
	//704. Binary Search
	public int binarySearch(int[] nums, int target) {
        int low = 0;
        int high = nums.length -1;
        //System.out.println(nums.length);
        while(low <= high) {
        	int mid = (low+high)/2;
        	if(target == nums[mid]) return mid+1;
        	else if(nums[mid] < target) low = mid+1;
        	else high = mid-1;
        }
        
        return -1;
    }
	//35. Search Insert Position
	public int searchInsert(int[] nums, int target) {
        
        int start = 0, end = nums.length-1;

        if(target>nums[end])    return end+1;
        if(target<nums[start])  return start;

        while(start<=end){
        int mid = start + (end-start)/2;
        if(nums[mid]==target)   return mid;
        if(nums[mid]>target)    end = mid-1;
        if(nums[mid]<target)    start = mid+1;
    }
    return start;
    }
	//977. Squares of a Sorted Array
	public int[] sortedSquares(int[] nums) {
        int i = 0;
        int size = nums.length;
        int[] squareNums = new int[size];  
        while(i < size) {
            squareNums[i] = nums[i] * nums[i];
            i++;
        }
        for (i = 0; i < size; i++)   {  
            for (int j = i + 1; j < size; j++)   {  
                int tmp = 0;  
                if (squareNums[i] > squareNums[j])   {  
                    tmp = squareNums[i];  
                    squareNums[i] = squareNums[j];  
                    squareNums[j] = tmp;  
                }  
            }   
        }
        return squareNums;
    }
	public int[] sortedSquaresOptimized(int[] A) {
		    for (int i = 0; i < A.length; i++) 
		      A[i] = A[i] * A[i];
		    Arrays.sort(A);
		    return A;
	}
	//189. Rotate Array
	public int[] rotate(int[] nums, int k) {
        int i = 0;
        int end = 0;
        int size = nums.length -1;
        while(i < k) {
        	end = nums[size];
        	for(int j = size; j > 0; j--){
        		nums[j] = nums[j-1];        
            }
        	nums[0] = end;
        	i++;
        	System.out.println(end);
        }
        return nums;
    }
	public int[] rotatereverse(int[] nums, int k) {
        int i = 0;
        int start = 0;
        int size = nums.length -1;
        while(i <= (size+1)-k+1) {
        	
        	start = nums[0];
        	for(int j = 0; j < size; j++){
        		nums[j] = nums[j+1];        
            }
        	nums[size] = start;
        	System.out.println(start);
        	i++;
        }
        return nums;
        
    }
	//283. Move Zeroes
    public int[] moveZeroes(int[] nums) {
    	if(nums.length == 0 || nums == null) return nums;
    	 int left = 0, right = 0;
    	 int temp;
    	 //traversing 0 to end of array
    	 while(right < nums.length) {
    		 if(nums[right] == 0) {
    			 ++right;
    		 }
    		 else {
    			 temp = nums[left];
    			 nums[left] = nums[right];
    			 nums[right] = temp;
    			 ++right;
    			 ++left;
    		 }
    	 }
    	 return nums;
    }
    //167. Two Sum II - Input Array Is Sorted
    public int[] twoSum(int[] nums, int target) {
   	 	int left = 0, right = nums.length -1;
   	 	int[] num = new int[2];
   	 	//traversing 0 to end of array
   	 	while(left < right) {
   	 		if(nums[left]+nums[right] == target) {
   	 			num[0] = left+1;
   	 			num[1]= right+1;
   	 			return num;
   	 		}
   	 		if(nums[left]+nums[right]<target) left++;
   	 		else right--;
   	 	}
   	 	return nums;
    }
    //344. Reverse String
    public char[] reverseString(char[] s) {
    	System.out.println("Original String "+ Arrays.toString(s));
        int left = 0, right = s.length - 1;
        char temp;
        while(left<right) {
        		temp = s[left];
        		s[left] = s[right];
        		s[right] = temp;
        		left++;
        		right--;
        }
        return s;
    }
    //557. Reverse Words in a String III
    public String reverseWords(String s) {
    	System.out.println("Original String : "+ s);
    	char[] cS = s.toCharArray();
    	int i, left = 0, right = 0;
        char temp;
        for(right=0;right<cS.length;right++) {
        	if(cS[right] == ' ') {
        		reverse(cS, left, right-1);
        		left = right+1;
        	}
        }
        reverse(cS, left, right-1);
        return new String(cS);
    }
    public void reverse(char[] cS,int left,int right) {
        while(left<right) {
    		char temp = cS[left];
    		cS[left] = cS[right];
    		cS[right] = temp;
    		left++;
    		right--;
        }
    }
    //876. Middle of the Linked List
    public ListNode middleNode(ListNode head) {
        ListNode slowPtr = head;
        ListNode fastPtr = head;

        // Travel until the fast pointer reaches
        // the last node or null
        while (fastPtr != null && fastPtr.next!= null) {

        	// Slow pointer moves 1 node
        	slowPtr = slowPtr.next;

        	// Fast pointer moves 2 nodes
        	fastPtr = fastPtr.next.next;
        }

    return slowPtr;
    }
    //19. Remove Nth Node From End of List
    public ListNode removeNthFromEnd(ListNode head, int n) {
    	
    	if(head == null)
            return null;
     
        //get length of list
        ListNode p = head;
        int len = 0;
        while(p != null){
            len++;
            p = p.next;
        }
     
        //if remove first node
        int fromStart = len-n+1;
        if(fromStart==1)
            return head.next;
     
        //remove non-first node    
        p = head;
        int i=0;
        while(p!=null){
            i++;
            if(i==fromStart-1){
                p.next = p.next.next;
            }
            p=p.next;
        }
     
        return head;
    }
    //3. Longest Substring Without Repeating Characters
//    public int lengthOfLongestSubstring(String s) {
//
//    }
    public static void main(String args[]) {
    	Solution sol = new Solution();
    	int[] num = {-1,0,3,5,9,12};
    	char[] s = {'A',' ','m','a','n',',',' ','a',' ','p','l','a','n',',',' ','a',' ','c','a','n','a','l',':',' ','P','a','n','a','m','a'};
    	int target = 9;
    	int target2 = 2;
    	String sReverse = "Let's take LeetCode contest";
    	//System.out.println(sol.binarySearch(num, target));
    	//System.out.println(sol.searchInsert(num, target2));
    	//System.out.println(Arrays.toString(sol.sortedSquares(num)));
    	//System.out.println(Arrays.toString(sol.sortedSquaresOptimized(num)));
    	//189. Rotate Array
    	//System.out.println(Arrays.toString(sol.rotate(num, target2)));
        //System.out.println("");
    	//System.out.println(Arrays.toString(sol.rotatereverse(num, target2)));
    	//283. Move Zeroes
    	//System.out.println(Arrays.toString(sol.moveZeroes(num)));
        //167. Two Sum II - Input Array Is Sorted
    	//System.out.println(Arrays.toString(sol.twoSum(num, target2)));
    	//344. Reverse String
    	//System.out.println("String after reverse "+Arrays.toString(sol.reverseString(s)));
    	//557. Reverse Words in a String III
    	System.out.println("String after reverse : " + sol.reverseWords(sReverse));
    }
}
