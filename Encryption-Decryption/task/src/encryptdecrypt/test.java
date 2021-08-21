package encryptdecrypt;



abstract class IntBinaryOperation {

    protected int firstArg;
    protected int secondArg;

    public IntBinaryOperation(int firstArg, int secondArg) {
        this.firstArg = firstArg;
        this.secondArg = secondArg;
    }

    public abstract int perform();
}

class Addition extends IntBinaryOperation{

    public Addition(int firstArg, int secondArg){
        super(firstArg,secondArg);
    }

    @Override
    public int perform(){
        return super.firstArg+super.secondArg;
    }

}

class Multiplication extends IntBinaryOperation {

    public Multiplication(int firstArg, int secondArg){
        super(firstArg,secondArg);
    }
    @Override
    public int perform(){
        return super.firstArg*super.secondArg;
    }

}

// declare and implement your classes here
public class test {
    public static void main(String[] args) {
        System.out.printf("%s dolor sit %s", "Lorem", "ipsum", "amet");
    }
}
