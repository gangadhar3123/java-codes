import java.util.Arrays;

public class EvenAndRight {

    public static void main(String[]args){
        int Array[]={3,6,9,12,8};
        int len=Array.length;
        int Even_Array[]=new int[3];
        int Odd_Array[]=new int[2];
        int g=0;
        int o=0;
        int f=0;
        for(int i=0;i<=Array.length-1;i++){
            if(Array[i]%2==0){

                Even_Array[g]=Array[i];
                g+=1;
            }else{
                Odd_Array[f]=Array[i];
                f+=1;
            }
        }

        for(int i=0;i<Even_Array.length-1;i++)
        {
            for(int j=0;j<Even_Array.length-1-i;j++){
                int temp=Even_Array[j];
                if(Even_Array[j]>Even_Array[j+1]){
                    Even_Array[j]=Even_Array[j+1];
                    Even_Array[j+1]=temp;
                }}
        }

        System.out.println(Arrays.toString(Even_Array));
        for(int i=0;i<Odd_Array.length;i++)
        {
            int min_index=i;
            for(int j=i+1;j<Odd_Array.length;j++){
                if(Array[j]>Array[min_index]){
                    min_index=j;}}
            int temp=Odd_Array[min_index];
                    Odd_Array[min_index]=Odd_Array[i];
                    Odd_Array[i]=temp;


                }
        System.out.println(Arrays.toString(Odd_Array));
            }

        }

//        for(int i=0;i<=Array.length-1;i++){
//            if(Array[i]%2==0){
//                for(int j=0;i<=Array.length-1;j++){
//                    for(int k=0;k<=Array.length-1-i;k++){
//                        int temp=Array[k];
//                        if(Array[k]>Array[k+1]){
//                            Array[k]=Array[k+1];
//                            Array[k+1]=temp;
//                        }
//
//                    }
//                }
//            }else if(Array[i]%2!=0){
//
//                for(int a=0;i<Array.length;i++)
//                {
//                    int min_index=a;
//                    for(int j=a+1;j<Array.length;j++){
//                        int temp=Array[j];
//                        if(Array[j]<Array[min_index]){
//                            Array[j]=Array[min_index];
//                            Array[min_index]=temp;
//                            min_index=temp;
//
//                        }
//                    }
//
//                }
//            }
//            System.out.println(Arrays.toString(Array));
//        }



