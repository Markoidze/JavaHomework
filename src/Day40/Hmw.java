//package Day40;
//
//public class Hmw {
    //*********************************************************************************************
//    What will be the output of the following Java program?
//    class X {
//        Class X
//        Members
//    }
//
//    class Y {
//        Class Y
//        Members
//    }
//
//    class Z extends X, Y {
//        Class Z
//        Members
//    }
//}
// Answer: 10
//    //*********************************************************************************************
//    What will be the output of the following Java program?
//    class A
//    {
//        int i = 10;
//    }
//
//    class B extends A
//    {
//        int i = 20;
//    }
//
//    public class MainClass
//    {
//        public static void main(String[] args)
//        {
//            A a = new B();
//
//            System.out.println(a.i);
//        }
//    }
// Answer: inner classes can not have static declaration
//    //*********************************************************************************************
//    What will be the output of the following Java program?
//    class A
//    {
//        {
//            System.out.println(1);
//        }
//    }
//
//    class B extends A
//    {
//        {
//            System.out.println(2);
//        }
//    }
//
//    class C extends B
//    {
//        {
//            System.out.println(3);
//        }
//    }
//
//    public class MainClass
//    {
//        public static void main(String[] args)
//        {
//            C c = new C();
//        }
//    }
// Answer: 1.2.3
//    //*********************************************************************************************
//    What will be the output of the following Java program?
//    class A
//    {
//        String s = "Class A";
//    }
//
//    class B extends A
//    {
//        String s = "Class B";
//
//        {
//            System.out.println(super.s);
//        }
//    }
//
//    class C extends B
//    {
//        String s = "Class C";
//
//        {
//            System.out.println(super.s);
//        }
//    }
//
//    public class MainClass
//    {
//        public static void main(String[] args)
//        {
//            C c = new C();
//
//            System.out.println(c.s);
//        }
//    }
// Answer: A. B C
//    //*********************************************************************************************
//    What will be the output of the following Java program?
//    class A
//    {
//        static
//        {
//            System.out.println("THIRD");
//        }
//    }
//
//    class B extends A
//    {
//        static
//        {
//            System.out.println("SECOND");
//        }
//    }
//
//    class C extends B
//    {
//        static
//        {
//            System.out.println("FIRST");
//        }
//    }
//
//    public class MainClass
//    {
//        public static void main(String[] args)
//        {
//            C c = new C();
//        }
//    }
// Answer: "THIRD", "SECOND"
//    //*********************************************************************************************
//    What will be the output of the following Java program?
//    class A
//    {
//        public A()
//        {
//            System.out.println("Class A Constructor");
//        }
//    }
//
//    class B extends A
//    {
//        public B()
//        {
//            System.out.println("Class B Constructor");
//        }
//    }
//
//    class C extends B
//    {
//        public C()
//        {
//            System.out.println("Class C Constructor");
//        }
//    }
//
//    public class MainClass
//    {
//        public static void main(String[] args)
//        {
//            C c = new C();
//        }
//    }
// Answer: Class A Constructor
//Class B Constructor
//Class C Constructor
//    //*********************************************************************************************
//    What will be the output of the following Java program?
//    class X
//    {
//        static void staticMethod()
//        {
//            System.out.println("Class X");
//        }
//    }
//
//    class Y extends X
//    {
//        static void staticMethod()
//        {
//            System.out.println("Class Y");
//        }
//    }
//
//    public class MainClass
//    {
//        public static void main(String[] args)
//        {
//            Y.staticMethod();
//        }
//    }
// Answer: Class Y
//    //*********************************************************************************************
//    What will be the output of the following Java program?
//    class X
//    {
//        public X(int i)
//        {
//            System.out.println(1);
//        }
//    }
//
//    class Y extends X
//    {
//        public Y()
//        {
//            System.out.println(2);
//        }
//    }
//}

//Which two classes use the Shape class correctly?
//
//        A. public class Circle implements Shape
//{
//    private int radius;
//}
//B. public abstract class Circle extends Shape
//{
//    private int radius;
//}
//C. public class Circle extends Shape
//{
//    private int radius;
//    public void draw();
//}
//D. public abstract class Circle implements Shape
//{
//    private int radius;
//    public void draw();
//}
//E. public class Circle extends Shape
//{
//    private int radius;
//    public void draw()
//    {
//        /* code here */
//    }
//}
//F. public abstract class Circle implements Shape
//{
//    private int radius;
//    public void draw()
//    {
//        /* code here */
//    }
//}
//a) B,E
//        b) A,C
//        c) C,E
//        d) T,H
//
//        What will be the output of the following Java program?
//
//class A
//{
//    int i;
//    void display()
//    {
//        System.out.println(i);
//    }
//}
//class B extends A
//{
//    int j;
//    void display()
//    {
//        System.out.println(j);
//    }
//}
//class inheritance_demo
//{
//    public static void main(String args[])
//    {
//        B obj = new B();
//        obj.i=1;
//        obj.j=2;
//        obj.display();
//    }
//}
//a) 0
//        b) 1
//       Answer:  c) 2
//        d) Compilation Error
//
//        What will be the output of the following Java program?
//
//class A
//{
//    int i;
//}
//class B extends A
//{
//    int j;
//    void display()
//    {
//        super.i = j + 1;
//        System.out.println(j + " " + i);
//    }
//}
//class inheritance
//{
//    public static void main(String args[])
//    {
//        B obj = new B();
//        obj.i=1;
//        obj.j=2;
//        obj.display();
//    }
//}
//a) 2 2
//        b) 3 3
//       Answer:  c) 2 3
//        d) 3 2
//
//        What will be the output of the following Java program?
//
//class A
//{
//    public int i;
//    public int j;
//    A()
//    {
//        i = 1;
//        j = 2;
//    }
//}
//class B extends A
//{
//    int a;
//    B()
//    {
//        super();
//    }
//}
//class super_use
//{
//    public static void main(String args[])
//    {
//        B obj = new B();
//        System.out.println(obj.i + " " + obj.j)
//    }
//}
//      Answer:  a) 1 2
//        b) 2 1
//        c) Runtime Error
//          d) Compilation Error
//
//        Which of this keyword must be used to inherit a class?
//        a) super
//        b) this
//        c) extent
//        Answer: d) extends
//
//        A class member declared protected becomes a member of subclass of which type?
//        a) public member
//        Answer:  b) private member
//        c) protected member
//        d) static member
//
//        Which of these is correct way of inheriting class A by class B?
//        a) class B + class A {}
//b) class B inherits class A {}
//c) class B extends A {}
//   Answer:   d) class B extends class A {}