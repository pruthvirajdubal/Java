public class PROGRAMM37{
    public static void main(String [] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int a=0,b=1;

        int []arr=new int[n];
        arr[0]=a;
        arr[1]=b;

        for(int i =2;i<n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        for(int i=n-1;i>=0;i--){
            System.out.println(arr[i]+"");
        }
    }
}