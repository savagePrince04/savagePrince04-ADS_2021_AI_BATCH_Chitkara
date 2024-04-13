package Lec17;
public class Sieve_of_Eratosthenes {
        public static void main(String[] args) {
            int n = 100;
            PrimeSieve(n);
        }
         // index--> false ko prime index consider krege
        //	index--> true hoga usko not prime index
        public static void PrimeSieve(int n) {
            boolean[] prime = new boolean[n + 1];
            prime[0] = true;// not prime
            prime[1] = true;// not prime
            for (int i = 2; i * i <= n; i++) {
                if (prime[i] == false) {
                    for (int j = 2; i * j < prime.length; j++) {
                        prime[i * j] = true;
                    }
                }

            }

            for (int i = 2; i < prime.length; i++) {
                if (prime[i] == false) {
                    System.out.print(i + " ");
                }
            }

        }

    }
