//given an int array A of size n you can increase the value of 1 element by 1.find the min time in sec to make all elements equal.
class MinTimetoEqual
{
    public static void main(String a[]){
        int i;
        int[] arr={3 ,4  , 1, 2};
        int n=arr.length;
        int min=arr[0];
        for(i=1;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        int time=0;
        for(i=0;i<n;i++){
            time+=arr[i]-min;
        }
        System.out.println(time);
    }
}