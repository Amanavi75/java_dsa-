package array;


public class SecondLargestElement {

    static int findMax(int [] arr){

        int max =0;

        int n = arr.length;
        for(int i=0;i<n;i++){

            if(arr[i]>max){
                max = arr[i];
            }
        }

        return max ;
    }


    static int SecondLargest(int [] arr){
        int n = arr.length;

        int mx = findMax(arr);
        for(int i =0;i<n;i++){
             if(arr[i]==mx){
                arr[i]=Integer.MIN_VALUE;
             }
        }
        int secondLar = findMax(arr);// new updated array
        return secondLar;

    }
}


// * right the find max function thereafter we disappear the max value from the array and if we again find the maximum for the remaining array then that maximum will be the seconLargest element  

//* to make it disappear we will make the fir max as negative of infinity */
