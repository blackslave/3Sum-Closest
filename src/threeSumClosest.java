/**
 * 傳入一個整數陣列與一個target整數，傳回陣列中任三個元素合計最接近target的值。
 * 	Given array nums = [-1, 2, 1, -4], and target = 1.

	The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 * @author black
 *
 */
public class threeSumClosest {
	public static void main(String []args){
		Solution Solution = new Solution();
		int[] nums = {1,1,-1,-1,3};
		int target = -1;
		System.out.println(Solution.threeSumClosest(nums, target));
	}
}
