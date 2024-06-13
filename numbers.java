import java.util.*;
import java.io.*;
class numbers{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int[]arr={5,6,88,2,36,95};
        int first=0,second=0; 
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>first){
                second=first;
                first=arr[i];
            }
            else if(arr[i]>second){
                second=arr[i];
            }
        }
        System.out.println(second);
    }
}
