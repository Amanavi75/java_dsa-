package array;

public class tripletTargetSum {
    static int tripletTarget(int[] arr ,int target){

        int triplet = 0;
        int n = arr.length;


        for(int i =0;i<n;i++){
            for(int j =i+1;j<n;j++){
                for(int k = j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        triplet++;
                    }
                }
            }
        }

        return triplet;
    }

    public static void main(String[] args) {
        int ar [] = {1,4,5,6,3};
        int tar = 12;

        int noOfTriplet = tripletTarget(ar, tar);
        System.out.println(noOfTriplet);
    }
}
