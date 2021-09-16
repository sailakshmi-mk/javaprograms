package Arithmetic;

interface Operations{
    public Double Addition(Double n1,Double n2);
    public Double Subtraction(Double n1,Double n2);
    public Double Multiplication(Double n1,Double n2);
    public Double Division(Double n1,Double n2);
}

public class Result implements Operations{
    public Double Addition(Double n1,Double n2){
        return (n1+n2);
    }
    public Double Subtraction(Double n1,Double n2){
        return (n1-n2);
    }
    public Double Multiplication(Double n1,Double n2){
        return (n1*n2);
    }
    public Double Division(Double n1,Double n2){
        return (n1/n2);
    }
}
