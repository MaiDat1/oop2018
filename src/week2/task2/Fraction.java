package week2.task2;

public class Fraction {
    private int numerator;
    private int denominator;
    public Fraction(int numerator, int denominator) {
        this.numerator= numerator;
        this.denominator=denominator;

    }
    public  void setNumerator(int numerator){
        this.numerator=numerator;
    }
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    public int getNumerator(){
        return numerator;
    }
    public int getDenominator(){
        return denominator;
    }

    public boolean equals(Object obj){
        Fraction fraction = (Fraction) obj;
        if((this.numerator*((Fraction)obj).denominator - this.denominator*((Fraction)obj).denominator)==0  )
            return true;
        else return false;
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
}


