public class Primes {
    public static void main(String[] args) {
        // Replace this statement with your code
        int n =Integer.parseInt(args[0]);
        boolean[] prime = new boolean[(int)n+1];
        boolean valueToSet = true;
        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i < prime.length; i++) {
            prime[i] = valueToSet;
        }
        prime[0] = false;
        prime[1] = false;
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            for (int j = i * 2; j <= n; j += i) {
                prime[j] = false;
            }
        }
        int counter = 0;
        for(int j=0; j<prime.length; j++)
        {
            if(prime[j]==valueToSet){
                System.out.println(j);
                counter++;
            }
        }
        double precenteg = ((double)counter/n)*100;
        System.out.println("There are "+counter+" primes between 2 and "+ (int)n +" ("+(int)precenteg+"% are primes)");
    }
}