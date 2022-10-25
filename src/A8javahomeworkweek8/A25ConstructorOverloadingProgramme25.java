package A8javahomeworkweek8;

public class A25ConstructorOverloadingProgramme25 {
        int id;
        String name;
        int age;
        //creating two arg constructor
        A25ConstructorOverloadingProgramme25(int i,String n){
            id = i;
            name = n;
        }
        //creating three arg constructor
        A25ConstructorOverloadingProgramme25(int i,String n,int a){
            id = i;
            name = n;
            age=a;
        }
        public void display(){System.out.println(id+" "+name+" "+age);}
        public static void main(String args[]){
            A25ConstructorOverloadingProgramme25 s1 = new A25ConstructorOverloadingProgramme25(111,"Karan");
            A25ConstructorOverloadingProgramme25 s2 = new A25ConstructorOverloadingProgramme25(222,"Aryan",25);
            s1.display();
            s2.display();
        }
    }

