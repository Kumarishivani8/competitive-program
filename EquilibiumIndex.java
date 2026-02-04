// given n array count no of equalbilium index the index is said to be equalbilium if sum of left side element is equal to sum of right side element
class EquiliiumIndex
{
    public static void main(String a[]){
        int i;
        int c=0;
        int[] arr={-3,2,4,-1};
        int n=arr.length;
        int[] prefixsum=new int[n];
        prefixsum[0]=arr[0];
        for(i=1;i<arr.length;i++){
            prefixsum[i]=arr[i]+prefixsum[i-1];
        }
        for(i=0;i<n;i++){
            int ls=0;
            if(i==0){
                ls=0;
            }
            else{
                ls=prefixsum[i-1];
            }
            int rs=0;
            if(i==n-1)
            {
                rs=0;
            }
            else{
                rs=prefixsum[n-1]-prefixsum[i];
            }    
            if (ls==rs)
            {
                c++;
            }
         }
         System.out.println(c);
    }
 }