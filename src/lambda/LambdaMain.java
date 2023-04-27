package lambda;

import java.util.stream.Stream;

public class LambdaMain {
    public static void main(String[] args){

        Math plusLambda = (first, second) -> first + second;
        System.out.println(plusLambda.Calc(4, 2));

        Math minusLambda = (first, second) -> first - second;
        System.out.println(minusLambda.Calc(4, 2));

    }


}
