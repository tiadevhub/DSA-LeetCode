class Solution {
    public int nthUglyNumber(int n) {
        PriorityQueue<Long>pq=new PriorityQueue<>();
        HashSet<Long>set=new HashSet<>();
        pq.add(1L);
        set.add(1L);
        Long ugly=1L;
        for(int i=1;i<=n;i++){
            ugly=pq.poll();
          
           if(set.add(2*ugly)){
            pq.add(2*ugly);
           }


           
           if(set.add(3*ugly)){
            pq.add(3*ugly);
           }

           
           if(set.add(5*ugly)){
            pq.add(5*ugly);
           }
        }
        return ugly.intValue();
    }
}