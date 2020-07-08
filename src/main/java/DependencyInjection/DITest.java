package DependencyInjection;

import org.springframework.cglib.proxy.InterfaceMaker;

public class DITest {
    public static void main(String args[]){
        DITest diTest=new DITest();
        User user=diTest.new User(diTest.new Oracle());
        user.add("Data to be added.");
    }

    class User{
        Database database;
        //File file1;
        User(Database database){
            this.database=database;
        }
        public void add(String data){
            database.persist(data);
        }
    }

    public interface Database{
        abstract void persist(String data);
    }

    public class Mysql implements Database{
        public void persist(String data){
            System.out.println(data+ " persisted in Mysql");
        }
    }
    class Oracle implements Database{
        public void persist(String data){
            System.out.println(data+ " persisted in Oracle");
        }
    }
}



