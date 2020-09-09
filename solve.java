
package main;

class Solution {
	
	static int mx=0;// A로 이루어진 가장큰 길이의 값의 마지막 인덱스
	
	
	static int cnt=0;//최적의길로 가는데 드는값최솟값
	
	
	public static void solve(char c)//1. 원하는 알파벳으로 바꾸는데드는 최솟값 2.
	{
			cnt++;
			if(c<='M')
			{
				cnt+=c-'A';
			}
			else {
				cnt+='Z'-c+1;//A가 없을때 있을떄 A가 있어서 지나쳐야할때
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

