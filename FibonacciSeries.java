package week3day1;

public class FibonacciSeries {
	public static void main(String[]args) {
int range=8,fstnum=0,sndnum=1,sum;

System.out.println(fstnum);
System.out.println(sndnum);
for(int i=1;i<=range;i++) {
sum=fstnum+sndnum;
	fstnum=sndnum;
	sndnum=sum;
	System.out.println(sum);
}
}}