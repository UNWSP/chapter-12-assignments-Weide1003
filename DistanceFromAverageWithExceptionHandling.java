package ch12;

import java.util.*;
public class DistanceFromAverageWithExceptionHandling {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int size=0;
double arr[];
try {
System.out.print("Enter array size: ");

size=sc.nextInt();

arr=new double[size];
}catch(InputMismatchException e) {

System.out.println("Invalid array size");
sc.close();
return;
}catch(NegativeArraySizeException e) {

System.out.println("Negative array size.\nSetting size to default value 5.");

size=5;
}
arr=new double[size];
System.out.println("Enter "+size+" double value: ");
try {
double sum=0;
for(int i=0;i<size;i++) {

arr[i]=sc.nextDouble();
sum+=arr[i];
}
double avg=sum/size;

System.out.println("Average: "+avg);
System.out.println("Distance of each element from average value.");
System.out.printf("%10s %30s\n", "Value","Distance from Average");

for(int j=0;j<size;j++) {
String dist=String.format("%.2f", Math.abs(avg-arr[j]));
System.out.printf("%10s %30s\n",arr[j],dist);
}
}catch(InputMismatchException e) {

System.out.println("Invalid double value");
}
sc.close();
}

}
