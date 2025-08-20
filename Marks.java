public class Marks {
    public  static void main(String[]args){
        int m[]={10,30,40,60,99};
        String s[]={"kiran","raju","venky","lucky","karthikuu"};
        int n=m.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                    String newvar=s[j];
                    int temp=m[j];
                    if(m[j]>m[j+1]){
                        s[j]=s[j+1];
                        m[j]=m[j+1];
                        m[j+1]=temp;
                        s[j+1]=newvar;}}}
        for(int i=0;i<=n-1;i++){
            System.out.println(m[i]+" "+s[i]);}}}


















































