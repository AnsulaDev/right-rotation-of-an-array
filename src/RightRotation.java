class RightRotation {
    static void rightrotation(int a[],int n){
        int res =a[n-1];
        for(int i=n-2;i>=0;i--){
            a[i+1] =a[i];


        }
        a[0] = res;


    }
    public static void main(String args[]){
        int a[] = {10, 5, 0, 8, 0, 9};
        int n = 6;
        rightrotation(a,n);
        for(int i =0;i<n;i++){
            System.out.print(a[i] + " ");
        }
    }
}
