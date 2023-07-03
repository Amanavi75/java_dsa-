package segementtree;

public class buildst {
     static int tree[];

     public static void init(int n){
        tree = new int[4*n];
     }

    public static int buildSt(int arr[],int sti,int start , int end){
        if(start==end){
            tree[sti]=arr[start];
            return arr[start]; // formation of leaf nodes at the end 
        }
        int mid = (start+end)/2;
        buildSt(arr, 2*sti+1, start, mid); // building left subtree 
        buildSt(arr, 2*sti+2, mid+1, end); // building right sub tree 
        
        tree[sti]=tree[2*sti+1]+tree[2*sti+2];
        return tree[sti];
    }

    public static int getSumUtil(int sti,int si,int sj,int qi,int qj   ){
         if(qj<=si||qi>=sj){ // non overlapping 
            return 0; 
         } else if (si>=qi||sj<=qj){
            return tree[sti];// complete overlap 
         }else {
            //partial overlap
            int mid = (si+sj)/2;
            int left = getSumUtil(2*sti+1, si, mid, qi, qj);
            int right = getSumUtil(2*sti+2,mid+1, sj, qi, qj);
            
            return left+right;
         }
    }

     public static int getSum(int arr[],int qi,int qj){
        int n = arr.length;
         return getSumUtil(0,0,n-1,qi, qj);
     }

    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8};
        int n = arr.length;
        init(n);
        buildSt(arr, 0, 0, n-1); // building first node 

        for(int sti=0;sti<tree.length;sti++){
           System.out.print(tree[sti]+" ");
        }
        System.out.println(getSum(arr, 2, 5)) ; 
    }
}
