public class Arrange {
    private int[] numbers;

    public Arrange(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] getNumbers() {
        return numbers;
    }
    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public void ejer1() {
        int maxPos = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[maxPos]) {
                maxPos = i;
            }
        }
        System.out.println("1) La posicion del mayor numero es: " + (maxPos + 1));
    }
    public void ejer2(){
        int maxPosPrime = -1;
        for (int i = 0; i < 10; i++) {
            if (prime(numbers[i]) && (maxPosPrime == -1 || numbers[i] > numbers[maxPosPrime])) {
                maxPosPrime = i;
            }
        }

        if (maxPosPrime != -1) {
            System.out.println("2) La posicion del mayor numero primo es: " + (maxPosPrime + 1));
        } else {
            System.out.println("2) No se encontro ningun numero primo");
        }
    }
    public static boolean prime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void ejer3(){
        int[] primes = new int[10];
        int coun1 = 0;

        for (int i = 100; i <= 300 && coun1 < 10; i++) {
            if (prime(i)) {
                primes[coun1] = i;
                coun1++;
            }
        }
        System.out.println("3) Los 10 numeros primos entre 100 y 300 son:");
        for (int primo : primes) {
            System.out.println(primo);
        }
    }
    public void ejer4(){
        System.out.println("4) Los numeros terminados en 4 estan en las posiciones:");
        for (int i = 0; i < 10; i++) {
            if (numbers[i] % 10 == 4) {
                System.out.println(i + 1);
            }
        }
    }
    public void ejer5(){
        int max = numbers[0];
        for (int i = 1; i < 10; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        int coun2 = 0;
        for (int i = 0; i < 10; i++) {
            if (numbers[i] == max) {
                coun2++;
            }
        }
        if (coun2>1){
            System.out.println("5) El mayor numero es " + max + " y esta repetido " + coun2 + " veces");
        } else {
            System.out.println("5) El mayor numero es " + max + " y solo se repite una vez");
        }
    }
}
