import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;

public class Sorting {
    public static void main(String[]args){
int Array[]={2,42,1,4,33};
for(int i=0;i<Array.length-1;i++)
{
    for(int j=0;j<Array.length-1-i;j++){
        int temp=Array[j];
        if(Array[j]>Array[j+1]){
        Array[j]=Array[j+1];
        Array[j+1]=temp;
    }}
}
System.out.println(Arrays.toString(Array));
    }
}
