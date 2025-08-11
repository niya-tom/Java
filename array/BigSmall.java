import java.util.Scanner;
class BigSmall
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int[] arr=new int[10];
System.out.println("enter the no:of elements:");
int n=sc.nextInt();
for(int i=0;i<n;i++){
   System.out.println("enter the elements:");
   arr[i]=sc.nextInt();
}
int big=arr[0],small=arr[0];
for(int i=0;i<n;i++){
 if(arr[i]>big){
	big=arr[i];
}
if(arr[i]<small){
	small=arr[i];
}}
System.out.println("Smallest="+small);
System.out.println("Largest="+big);
}}

