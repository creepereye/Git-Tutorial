
package test_;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] people = new int[Math.max(lost[lost.length-1], reserve[reserve.length-1])];
        int answer = n;

        for (int l : lost) 
            people[l-1]--;
        for (int r : reserve) 
            people[r-1]++;

        for (int i = 0; i < people.length; i++) {
            if(people[i] == -1) {
                if(i-1>=0 && people[i-1] == 1) {
                    people[i-1]--;
                }else if(i+1< people.length && people[i+1] == 1) {
                    people[i+1]--;
                }else 
                    answer--;
            }
        }
        return answer;
    }
}
public class DF {
	
	public static void main(String[] args) {
		int n=5;
		int lost[]= {2,4};
		int reserve[]= {3};
		Solution a=new Solution();
		System.out.print(a.solution(n, lost, reserve));
	}

}
