class Calculator{
    int a;
    int b;
    int Addition;
    int Multiplication;
    int Substraction;

    void Addition(int a,int b)
    {
    Addition=a+b;
    }
    void DisplayAddition()
    {
        System.out.println("Addition of two numbers is"+Addition);
    }


    void Substraction(int a,int b)
    {
    Substraction=a-b;
    }
    void DisplaySubstraction()
    {
        System.out.println("Substraction of two numbers is"+Substraction);
    }


    void Multiplication(int a,int b)
    {
    Multiplication=a*b;
    }
    void DisplayMultiplication()
    {
        System.out.println("Multiplication of two numbers is"+Multiplication);
    }
    public static void main(String[] args) {
        Calculator c1=new Calculator();
        Calculator c2=new Calculator();
        Calculator c3=new Calculator();
        Calculator c4=new Calculator();
        Calculator c5=new Calculator();

        c1.Addition(3,5);
        c2.Addition(8,9);
        c3.Addition(6,3);
        c4.Addition(3,7);
        c5.Addition(5,5);

        c1.Substraction(3,5);
        c2.Substraction(8,9);
        c3.Substraction(6,3);
        c4.Substraction(3,7);
        c5.Substraction(5,5);

        c1.Multiplication(3,5);
        c2.Multiplication(8,9);
        c3.Multiplication(6,3);
        c4.Multiplication(3,7);
        c5.Multiplication(5,5);

        c1.Display();
        c2.display();
        c3.display();
        c4.display();
        c5.display();

        c1.display();
        c2.display();
        c3.display();
        c4.display();
        c5.display();

        c1.display();
        c2.display();
        c3.display();
        c4.display();
        c5.display();



    }
}