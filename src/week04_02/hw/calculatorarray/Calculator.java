package week04_02.hw.calculatorarray;

public class Calculator {
    int sum(int ... val){
        int res = 0;
        for(int i : val){
            res += i;
        }
        return res;
    }

    int sub(int ... val){
        int res = val[0];
        for(int i = 1; i < val.length; i++){
            res -= val[i];
        }
        return res;
    }

    int mul(int ... val){
        int res = 1;
        for(int i : val){
            res *= i;
        }
        return res;
    }

    double div(int ... val) {
        double res = 1;
        for(int i : val){
            res /= i;
        }
        return res;
    }
}
