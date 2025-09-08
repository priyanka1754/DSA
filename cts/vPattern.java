// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        int n=5;
        for(int i=1;i<=(n/2)+1;i++){
            for(int j=1;j<=n;j++){
                if(i==j || i==n-j+1){
                    System.out.print(j);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


output:
1   5
 2 4 
  3  

=== Code Execution Successful ===
