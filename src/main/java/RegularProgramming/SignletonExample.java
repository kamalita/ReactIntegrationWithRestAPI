/*
 * Copyright (c) 2020.
 * Kamalita's coding
 */

package RegularProgramming;
//import java.security.*;

class SignletonExample{

    public static void main(String[] args)  {
        try {
//            Singleton singleton = Singleton.Singleton();
//            System.out.println("in main "+singleton.hashCode());
          Singleton ss=Singleton.getInstance();
            System.out.println("in main after getInst "+ss.hashCode());
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

class Singleton{
    String id="kamalita";
    private static Singleton singleton=null;
   private Singleton(){
        System.out.println("caught");
       if (singleton != null){
           throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
       }
    }

    private static class SingletonCreater               //Bill Pugh Singleton Implementation
    {
        private static final Singleton singletonOne=new Singleton();
    }
    public static Singleton getInstance()
    {
        System.out.println("in getIns construct "+SingletonCreater.singletonOne.hashCode());
        return SingletonCreater.singletonOne;
    }
//

//  Threadsafe but unnecessery blockage

//    public static synchronized Singleton Singleton(){
//
//       if(singleton==null){
//           singleton=new Singleton();
//           System.out.println("in 2nd construct "+singleton.hashCode());
//       }
//        System.out.println("in return construct "+singleton.hashCode());
//        return singleton;
//    }


    //threadSafe
//    public static Singleton Singleton(){
//
//        if(singleton==null)
//        {
//            synchronized (Singleton.class)
//            {
//                if(singleton==null) {
//                    singleton = new Singleton();
//                    System.out.println("in 2nd construct " + singleton.hashCode());
//                }
//            }
//        }
//        System.out.println("in return construct "+singleton.hashCode());
//        return singleton;
//    }

}


