import java.util.*;

public class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];  // To store the result
        Stack<Integer> stack = new Stack<>(); // Stack to store indices of temperature
        

        // Loop through each day
        for (int i = 0; i < n; i++) {
            // If current temp is higher than temp at stack's top index
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prevIndex = stack.pop(); // index of the day with a lower temp
                answer[prevIndex] = i - prevIndex; // Calculate how many days to wait
            }

            // Push the current day index to the stack
            stack.push(i);
        }

        return answer; // Return the final result
    }
}
