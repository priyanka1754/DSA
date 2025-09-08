// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        int n=3;
        for(int i=1;i<=n;i++){
            for(int j=1;j<n-i+1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

output:

  *
 **
***

      or

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==n || j==n || (i+j)>n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}






//equi;ateral triangle..
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<n-i+1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

    * 
   * * 
  * * * 
 * * * * 
* * * * * 
