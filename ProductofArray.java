//given n array of int A.find and return the array of same size where the  ith element of product arraywill  eequal to product of all elements divided  ythe ith elemetof the array

class ProductofArray
{
    public static void main(String a[]){
        int i;
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        int[] prefixprod=new int[n];
        prefixprod[0]=arr[0];
        for(i=1;i<arr.length;i++){
            prefixprod[i]=arr[i]*prefixprod[i-1];
        }
        int[] result=new int[n];
        for(i=0;i<n;i++){
            int lp=1;
            if(i==0){
                lp=1;
            }
            else{
                lp=prefixprod[i-1];
            }
            int rp=1;
            if(i==n-1)
            {
                rp=1;
            }
            else{
                rp=prefixprod[n-1]/prefixprod[i];
            }    
            result[i]=lp*rp;
         }
         for(i=0;i<n;i++){
             System.out.print(result[i]+" ");
         }
    }
 }