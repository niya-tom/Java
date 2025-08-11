import java.util.Scanner;
class ArrayCommon{
public static void main(String args[]){
int[] arr=new int[4];
int[] arr2=new int[4];
Scanner sc=new Scanner(System.in);
System.out.println("Enter element for first array:");
for(int i=0;i<4;i++){
arr[i]=sc.nextInt();
}
System.out.println("Enter element for second array:");
for(int j=0;j<4;j++){
arr2[j]=sc.nextInt();
}
System.out.println("Common element in both array :");
for(int i=0;i<4;i++){
for(int j=0;j<4;j++){
if (arr[i]==arr2[j])
System.out.print(arr[i]+",");}}
}
}