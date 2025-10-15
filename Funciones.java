package aed;

class Funciones { //hago el commit
    int cuadrado(int x) {
        
        return x*x;
    }

    double distancia(double x, double y) {
        return Math.sqrt(x*x+y*y);
    }

    boolean esPar(int n) {
        boolean res = false;
        if (n%2 == 0){
            res = true;
        }
        return res;
    }

    boolean esBisiesto(int n) {
        boolean res = false;
        if (n%400 == 0){
            res = true;
        }
        else if (n%100 == 0 ){
            res = false;
        }
        else if(n%4 == 0){
            res = true;
        }
        return res;
        
    }

    int factorialIterativo(int n) {
        int res = n;
        if(n==0)
            res = 1;
        else {
            for (int i = n-1; i != 0;i = i-1){
                res *= i;
            }
        }
        return res;
    }

    int factorialRecursivo(int n) {
            int res = 1;
            if(n!=0) {
                res = n;
                res *= factorialRecursivo(n - 1);
            }
            
    
            return res;
        }

    boolean esPrimo(int n) {
        boolean res = false;
        if(n==0 || n==1)
            res = false;
        else if (n==2) {
            res = true;
        }
        else {
            int i = n-1;
                while (i!=1 && n%i!= 0){
                res = true;
                i-=1;
                }
        }
        return res;
    }

    int sumatoria(int[] numeros) {
        // COMPLETAR
        return 0;
    }

    int busqueda(int[] numeros, int buscado) {
        // COMPLETAR
        return 0;
    }

    boolean tienePrimo(int[] numeros) {
        // COMPLETAR
        return false;
    }

    boolean todosPares(int[] numeros) {
        // COMPLETAR
        return false;
    }

    boolean esPrefijo(String s1, String s2) {
        // COMPLETAR
        return false;
    }

    boolean esSufijo(String s1, String s2) {
        // COMPLETAR
        return false;
    }
}
