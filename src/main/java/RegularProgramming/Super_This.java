/*
 * Copyright (c) 2020.
 * Kamalita's coding
 */

package RegularProgramming;

public class Super_This {

    public static void main(String[] args) {
        System.out.println("in parent main");
        Check super_this=new Check(23);
        super_this.main();
    }
    Super_This(){
        System.out.println("in super/base");
    }
}

class Check extends Super_This{
    Check(){
        super();
        System.out.println("in child/current");
    }
    Check(int i){
        this();
        System.out.println("in child/current using argument");
    }
    public void main() {
        System.out.println("in child/current main");

    }
}
