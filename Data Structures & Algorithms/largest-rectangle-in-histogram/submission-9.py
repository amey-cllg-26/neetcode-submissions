class Solution:
    def largestRectangleArea(self, heights: List[int]) -> int:
        stack=[]
        n=len(heights)
        maxArea=0
        for i in range(n+1):
            currHeight=0 if i==n else heights[i]
            while stack and currHeight<heights[stack[-1]]:
                h=heights[stack.pop()]
                left=stack[-1] if stack else -1
                width=i-left-1
                maxArea=max(maxArea,h*width)
            stack.append(i)
        return maxArea
