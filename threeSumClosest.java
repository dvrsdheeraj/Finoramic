import java.util.*;
public class threeSumClosest {
    public int threeSumClosest(ArrayList<Integer> A, int B) {
        int min=Integer.MAX_VALUE;
        int result=0;
        Collections.sort(A);
        for(int i=0;i<A.size();i++)
        {
            int j=i+1;
            int k=A.size()-1;
            while(j<k)
            {
                int s=A.get(i)+A.get(j)+A.get(k);
                int d=Math.abs(s -B);
                if(d==0) return s;
                if(d<min)
                {
                    min=d;
                    result=s;
                }
                if(s<=B)
                {
                    j++;
                }
                else
                {
                    k--;
                }
            }
        }
            return result;

    }
}
