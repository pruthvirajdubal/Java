public class programm309 {

    public static void main(String[] args) {
        int balance =10000;

        int [] transations ={2000,-1500,3000,-1000,500};

        for(int i=0;i<transations.length;i++)
        {
            balance+=transations[i];
        }
        System.out.println("Final Balance:"+balance);
    }
    
}
