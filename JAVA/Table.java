// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Table{
    public static void printTable(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+(n*i));
        }
    }
    
    public static boolean isPrime(int n){
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                return false;
            }
        return true;
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter 3 numbers ");
        
        if(args.length<=0){
            System.out.println("Error:There should be 3 numbers:");
        }
        else if(args.length==3){
            for(int i=0;i<=args.length;i++){
                if(isPrime(Integer.parseInt(args[i]))){
                    printTable(Integer.parseInt(args[i]));
                }
                else{
                    System.out.println("Divide by Zero(0)"+Integer.parseInt(args[i])/10);
                }
            }
        }
    }
}