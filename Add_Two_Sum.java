public class Add_Two_Sum {
    public static void main(String[]args){
        int array_elements[]={1,2,3,4,5};
        int target=8;
        for(int i=0;i<=array_elements.length-1;i++){
            for(int j=i;j<=array_elements.length-1;j++){
                if(i==j){
                    continue;
                }else if(target==(array_elements[i]+array_elements[j])){
                    System.out.println("the indice are: "+i
                    +" "+j);
                    break;
                }
            }
        }
    }
}

