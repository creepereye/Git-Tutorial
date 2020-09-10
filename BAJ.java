
package BAEKJOON;
import java.util.Stack;

class Solution {
    public static String solution(String number, int k) {
        Stack<Character> stack=new Stack<Character>();//*ť ��� while�� ��� character���*
        char v[]=new char[number.length()-k];
        for(int i=0;i<number.length();i++)
        {
        	char c=number.charAt(i);
        	while (!stack.isEmpty()&&stack.peek()<c&&k-->0) {
        		stack.pop();
			}
        	stack.push(c);
        }
        for(int i=0;i<v.length;i++)
        {
        	v[i]=stack.get(i);
        }
        return new String(v);
    }
}
public class aasd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(Solution.solution("4177252841", 4));
	}

}
