class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;
        
        for (int i = 0; i <= n; i++) {
            int currentHeight = (i < n) ? heights[i] : 0;
            
            while (!stack.isEmpty() && heights[stack.peek()] >= currentHeight) {
                int h = heights[stack.pop()];
                int left = stack.isEmpty() ? -1 : stack.peek();
                int width = i - left - 1;
                maxArea = Math.max(maxArea, h * width);
            }
            
            stack.push(i);
        }
        
        return maxArea;
    }
}