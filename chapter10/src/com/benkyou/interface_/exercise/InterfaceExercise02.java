package exercise;

public class InterfaceExercise02 {
    public static void main(String[] args) {
        
    }
}

interface IZ {
int x = 0;
}

class IY {
int x = 1;
}

class IX extends IY implements IZ {
    public void pX() {
        // System.out.println(x); // The field x is ambiguous
        System.out.println("IZ:" + IZ.x + ", IY:" + super.x);
    }
    public static void main(String[] args) {
        new IX().pX();
    }
}
