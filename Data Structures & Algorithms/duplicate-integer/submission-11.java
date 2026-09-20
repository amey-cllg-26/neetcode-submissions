
class Solution{
 public boolean hasDuplicate(int[] nums){
  Set<Integer> seen = new HashSet<>(nums.length * 4 / 3 + 1);
  sort(nums);
  for(int num:nums){
    if (seen.contains(num))
     {return true;}
  seen.add(num);
  }
 return false;
 }
}
