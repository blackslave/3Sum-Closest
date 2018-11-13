/**
 * 設定一個min整數記錄targer與合計值sum之間，最短的距離，並把當時的sum值記錄下來回傳。
 */
import java.util.Arrays;
public class Solution {
	public int threeSumClosest(int[] nums, int target) {
		if (nums.length<3) return 0;
		int min = Integer.MAX_VALUE;
		int result = 0;
		Arrays.sort(nums);
		for(int i=0;i<nums.length;i++)
		{
			int high=nums.length-1;
			int low=i+1;
			while(low<high)
			{
				int sum= nums[i]+ nums[high]+ nums[low];
				if(Math.abs(target-sum)<min)
				{
					min = Math.abs(target-sum);
					result = sum;
				}
				if(target==sum) return sum;
				if(sum>target)	high--;
				else low++;
			}
		}
		return result;
    }
}
