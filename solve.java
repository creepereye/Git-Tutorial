
package main;

class Solution {
	
	static int mx=0;// A�� �̷���� ����ū ������ ���� ������ �ε���
	
	
	static int cnt=0;//�����Ǳ�� ���µ� ��°��ּڰ�
	
	
	public static void solve(char c)//1. ���ϴ� ���ĺ����� �ٲٴµ���� �ּڰ� 2.
	{
			cnt++;
			if(c<='M')
			{
				cnt+=c-'A';
			}
			else {
				cnt+='Z'-c+1;//A�� ������ ������ A�� �־ �����ľ��Ҷ�
			}
	}
    
    public static int solve_(int s,String name)
    {
    	if(s+1==name.length())
    	{
    		return 0;
    	}
    	else if(s-1==-1)
    	{
			return name.length()-1;
		}
    	else 
    	{
			return s;
		}
    }
    
    public static int solution(String name) 
    {
    	int turn=name.length()-1;
    	for(int i=0;i<name.length();i++)
    	{
    		solve(name.charAt(i));
    		
    	}
    	return mx;
    }
}
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(Solution.solution("M"));
	}

}

