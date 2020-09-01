package greedy_algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
class pair implements Comparable<pair>
{
	pair(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	int x;
	int y;
	@Override
	public int compareTo(pair o) {
		if(y!=o.y)
		{
			return y-o.y;
		}
		else {
			return x-o.x;
		}
		
	}
}
public class test_1931 {
	static ArrayList<pair> list=new ArrayList<pair>();
	static int input=0;
	static int x=0;
	static int y=0;
	static int num=0;
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//객체 생성
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int result=0;
		input=Integer.parseInt(bf.readLine());
		for(int i=0;i<input;i++)
		{
			StringTokenizer sc=new StringTokenizer(bf.readLine());
			x=Integer.parseInt(sc.nextToken());
			y=Integer.parseInt(sc.nextToken());
			list.add(new pair(x,y));
		}
		//객체 비교후정렬
		Collections.sort(list);
		int number=-1;
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).x>=number)
			{
				number=list.get(i).y;
				result++;
			}
		}
		System.out.println(result);
	}
}
