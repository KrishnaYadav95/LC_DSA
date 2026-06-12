class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> st= new Stack<>();
        Stack<Integer> revst= new Stack<>();
        for(int i=0;i<sandwiches.length ; i++){
            st.push(sandwiches[i]);
        }
        while(!st.isEmpty()){
            revst.push(st.pop());
        }
        // step->2 add students in a queue
        Queue<Integer> q= new LinkedList<>();
        for(int i=students.length -1;i>=0;i--){
            q.add(students[i]);
        }
        int count=0;
        while(!q.isEmpty()&& !revst.isEmpty()){
        if(q.peek()==revst.peek()){
            q.poll();
            revst.pop();
            count=0;
        }else{
            q.offer(q.poll());
            count++;
        }
        if(count==revst.size()) return count;
        }
        return q.size();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna