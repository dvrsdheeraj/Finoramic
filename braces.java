import java.util.*;
public class braces {
    public int braces(String A) {
        Stack<Character> s=new Stack<Character>();
        int index=0;
        while (index<A.length())
        {
            char c=A.charAt(index);
            if(c=='(' || c=='+' || c=='-'|| c=='*'|| c=='/')
            {
                s.push(c);
            }
            else if(c==')')
            {
                if(s.peek()=='(')
                {
                    return 1;
                }
                else
                {
                    while(!s.isEmpty() && s.peek()!='(')
                    {
                        s.pop();
                    }
                    s.pop();
                }
            }
            index++;
        }
        return 0;
    }
}
