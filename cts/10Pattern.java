// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        int n=5;
        for(int i=0;i<=n;i++){
                for(int j=0;j<i;j++){
                    System.out.print((i+j)%2+" ");
            }
            System.out.println();
        }
    }
}

output:
1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 

=== Code Execution Successful ===
