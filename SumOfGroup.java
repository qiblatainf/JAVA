
public class SumOfGroup {
	
	public static boolean groupSum(int start, int[] nums, int target) {
		  
		  
		if (start >= nums.length) return (target == 0);
		  if (groupSum(start + 1, nums, target - nums[start])) return true;
		  if (groupSum(start + 1, nums, target)) return true;
		  return false;
		  
		  
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int start = 0;
		int [] nums = {2,4,8};
		int target = 15;
		
		System.out.println(groupSum(start, nums, target));

	}

}
