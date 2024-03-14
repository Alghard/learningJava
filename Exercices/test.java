


public class test {
    public static int factorial(int n) {
        // Écrivez votre code ici
        int f = n;
        for (int i = n - 1; i > 0; i--){
            f = f*i;
        }       
        return f;
    }	
    	
    public static void main(String[] args) {
    	int f = factorial(3);
    	System.out.print(f);     
    }
} 