import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter no of elements");
        int n=scan.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the element");
        for(int i=0;i<n;i++){

            arr[i]= scan.nextInt();
        }
        //bubble(arr);
        insertion(arr);
        for(int i=0;i<n;i++){
            System.out.println(arr[i] + " ");
        }

    }
    public static void bubble(int arr[]){
        for(int i=0;i< arr.length;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
    }

    public static void selection(int arr[]){
        for(int i=0;i< arr.length-1;i++){
            int min=i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                    int temp=arr[min];
                    arr[min]=arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    public static void insertion(int a[]){
        for(int i=1;i<a.length;i++){
            int key=a[i];
            for(int j=i-1;j>=0;j--){
                if(a[j]>key){
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
    }
}
