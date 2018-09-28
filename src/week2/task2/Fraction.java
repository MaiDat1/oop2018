package week2.task2;

public class Fraction {
    private int numerator;
    private int denominator;
    public Fraction(int numerator, int denominator) {
        this.numerator= numerator;
        this.denominator=denominator;

    }

    public boolean equals(Fraction obj){
        return (numerator*obj.denominator == denominator*obj.numerator);
    }

    public Fraction add(Fraction other) {
        Fraction phansomoi= new Fraction(numerator,denominator);
        phansomoi.numerator = this.numerator*other.denominator + this.denominator * other.numerator;
        phansomoi.denominator = this.denominator*other.denominator;
        return phansomoi;
    }

    public Fraction subtract(Fraction other) {
        Fraction phansomoi = new Fraction(numerator,denominator);
        phansomoi.numerator=this.numerator * other.denominator - this.denominator * other.numerator;
        phansomoi.denominator = this.denominator * other.denominator;
        return phansomoi;
    }

    public Fraction multiply(Fraction other) {
        Fraction phansomoi = new Fraction(numerator,denominator);
        phansomoi.numerator=this.numerator * other.numerator;
        phansomoi.denominator = this.denominator * other.denominator;
        return phansomoi;
    }

    public Fraction divide(Fraction other) {
        Fraction phansomoi = new Fraction(numerator,denominator);
        phansomoi.numerator= this.numerator * other.denominator;
        phansomoi.denominator= this.denominator * other.numerator;
        return phansomoi;

    }

    public void Out( ){

        System.out.println(numerator + "/" +denominator);
    }
    public static void main(String[] args){
        Fraction a = new Fraction(1,2);
        Fraction b = new Fraction(3,4);
        Fraction c = a.add(b);
        c.Out();
        if(a.equals(b) == true)
            System.out.println("bang nhau");
        else
            System.out.println("khong bang");
    }
}


