class Exam {
    public void M1(){
        System.out.println("BINUS Online Learning");
    }
}
class Derived extends Exam
{
    public void M2()
    {
        System.out.println("BINUS Online Learning");
    }
}
class Test
{
    public static void main(String[] args)
    {
        Derived d = new Derived(); // creating object
        d.M1(); // print BINUS Online Learning
        d.M2(); // print BINUS Online Learning
    }
}