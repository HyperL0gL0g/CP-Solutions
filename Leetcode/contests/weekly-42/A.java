import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class A {
    public static void main(String[] args) {
    }
    //real code
    public int countStudents(int[] students, int[] sandwiches) {
        HashMap<Integer,Integer> map  = new HashMap<>();
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<students.length;i++)
        {
            map.put(i,students[i]);
            q.add(i);
        }
        for(int j : sandwiches)
        {
            boolean flag  =false;
            for(int i=0;i<q.size();i++)
            {
                int curr = q.poll(); //current student
                if(map.get(curr)==j) //if current choice == sandwich
                {
                    map.remove(curr);//remove the current student
                    flag=true;
                    break;
                }
                else
                {
                    q.add(curr);
                }
            }
            if(flag==false)
                break;
        }
        return map.size();

    }
}
