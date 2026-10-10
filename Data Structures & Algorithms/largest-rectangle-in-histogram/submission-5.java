class Solution {
    public int largestRectangleArea(int[] heights) {
      Deque<Integer> stack=new ArrayDeque<>();
      int n=heights.length;
      int maxArea=0;
      for(int i=0;i<=n;i++){
        int currHeight=(i==n)?0:heights[i];
        while(!stack.isEmpty()&&currHeight<heights[stack.peek()]){
            int h = heights[stack.pop()];
            int left=stack.isEmpty()?-1:stack.peek();
            int width=i-left-1;
            maxArea=Math.max(maxArea,h*width);
        }
        stack.push(i);
      }
        
        return maxArea;
    }
}