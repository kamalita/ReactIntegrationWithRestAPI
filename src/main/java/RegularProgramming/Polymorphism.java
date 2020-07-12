/*
 * Copyright (c) 2020.
 * Kamalita's coding
 */

package RegularProgramming;

public class Polymorphism extends PolymorphismSecond implements IPolymorphism{
    public static void main(String[] args) {
        PolymorphismSecond obj1=new Polymorphism();
        obj1.overloading(1);
        obj1.overloading(2);
        Polymorphism obj3= new Polymorphism();
        obj3.overloading(3);
        obj3.overloading(4);
        PolymorphismSecond obj2= new PolymorphismSecond();
        obj2.overloading(5);
        obj2.overloading(6);

        IPolymorphism obj4=new Polymorphism();
        obj4.overloading(7);
        obj4.overloading(8);
        IPolymorphism obj5= new PolymorphismSecond();
        obj5.overloading(9);
        obj5.overloading(10);
    }
    @Override
    public void overloading(short i){
        System.out.println("int overloading(short i) in Ply1 "+i);
    }

    @Override
    public int overloading(int i) {
        System.out.println("int overloading(int i) in Ply1 "+i);
        return 0;
    }

    int overloading(){
        System.out.println("int overloading() in Ply1");
        return 0;
    }
}
class PolymorphismSecond  implements IPolymorphism{
    @Override
    public void overloading(short i){
        System.out.println("int overloading(short i) in Ply2 "+ i);
    }
    @Override
    public int overloading( int i){
        System.out.println("int overloading() in Ply2 "+i);
        return 0;
    }
}
interface IPolymorphism{
    void overloading(short i);
    int overloading( int i);
}

