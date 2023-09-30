//to find the index of the target element in a sorted and rotated array around a pivot
public class SortednRotaded {
    public static int search(int arr[], int tar, int si, int ei ){
        int mid = (si+ei)/2;
        // case 1  ; found
        if(arr[mid] == tar){
            return mid;
        }
        //case 2. on line 1
        if(arr[si]<= arr[mid]){
            //case a : left
            if(arr[si]<=tar && tar<=arr[mid]){
               return search(arr, tar, si, mid);

            }
            // right
            else{
                return search(arr, tar, mid+1, ei);
            }
        }
        //on line 2
        else{
            //right
            if(arr[mid]<=tar && tar<=arr[ei]){
                return search(arr, tar, mid+1, ei);
            }
            //left
            else{
                return search(arr, tar, si, mid-1);
            }
        }
        
           
        }
        
    public static void main(String args[]){
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0;
        int tarIdx = search(arr, target, 0, arr.length-1);
        System.out.println(tarIdx);
        


    }
        
    }
    

