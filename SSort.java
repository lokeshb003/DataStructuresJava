class SSort {
    public static int SelectionSort (int[]arr) {
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j])
               min=j;
            
            
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
                }

        }
        return 0;
        
    }
    

    public static void main(String[] args) {
       int []arr={5,6,4,7,8,5,3,8,6,1};
       SelectionSort(arr);
       for(int i:arr){
        System.out.print(" "+i);
        }
    }
}
