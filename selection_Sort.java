import java.util.Arrays;

public class selection_Sort {
    public static void main(String[]args){
    int Array[]={2,42,1,4,33};
    int target=33;
    int len=Array.length;
for(int i=0;i<Array.length;i++)
    {
        int min_index=i;
        for(int j=i+1;j<Array.length;j++){
            int temp=Array[j];
            if(Array[j]<Array[min_index]){
                Array[j]=Array[min_index];
                Array[min_index]=temp;
                min_index=temp;

            }
        }

    }
System.out.println(Arrays.toString(Array));

int result=0;
        int left=0;
        int right=len;

while( left<right){

    int middle=left+right/2;
if(Array[middle]==target){
    System.out.println(Array[middle]);

}else if(Array[middle]<target){
    left=middle+1;
}else {
    right=middle-1;
}

}




}
}
