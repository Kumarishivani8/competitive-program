// give n array, count of element having atleast  one element  greater than  itself.
class countElement
{
    pulic static void main(String a[]){
        int i;
        int[] arr={1,2,3,4,6,8,7};
        int max=0;
        for(i=0;i<arr;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
         int c=0;
         for(i=0;i<arr[i];i++){
            if(arr[i]!= max){
                c++;
            }
         }
         System.out.println(c);
    }
 }

