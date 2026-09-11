class Solution:
    def hasDuplicate(self,nums):
        seen=set()
        for num in nums:
            if num in seen:
                return True
            seen.add(num)
        return False

    def main():
        solution=Solution()
        result=solution.hasDuplicate()
        print (result)