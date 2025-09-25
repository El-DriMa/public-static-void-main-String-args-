import java.util.InputMismatchException;
import java.util.Scanner;

public class Tutorial {

    public static String evenOrOdd(int number){
        if(number%2==0) return "Number is even"; else return "Number is odd";
    }
    public static class Student {
        private String name;
        private int age;

        Student(){
            this.name="";
            this.age=0;
        }

        Student(String name,int age){
            this.name=name;
            this.age=age;
        }
    }

    public class Door{
        public void open(){push();}
        void push(){}
    }
    public class VaultDoor extends Door{
        @Override
        public void open(){ pull(); }
        void pull(){}
    }
    public static void main(String[] args){
        System.out.println("Hello World!");
        int num=3110; int num1=1;
        //2
        char h='H'; char w='w'; char r='r'; char d='d';
        float floatie=2.0f;
        boolean tf=true;
        // H3110 w0r1d 2.0 true
        System.out.println(" "+h+num+" "+w+"0"+r+num1+d+" "+floatie+" "+tf);

        if(num==num1){
            System.out.print("Numbers are equal");
        }else{
            System.out.println("Numbers are not equal");
        }

        int[] arr= new int[5];
        for(int i=0;i<5;i++){
            arr[i]=438/(i+3);
        }
        for(int el:arr){
            System.out.print(" "+el+", ");
        }

        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter to check if number is even or odd :");
        try {
            int num2 = sc.nextInt();
            System.out.println(evenOrOdd(num2));
        }catch(InputMismatchException e){
            System.out.println("YOU SHOULD INPUT NUMBER!!!!!!!!!!!!!!");
        }

        Student empty=new Student();
        Student amna=new Student("Amna",22);
        System.out.println("Empty student is "+empty.name+","+empty.age);
        System.out.println("Other student is "+amna.name+","+amna.age);
        System.out.println("Student name length is: "+amna.name.length());

        int doNum=5;
        do{
            System.out.println("Number in loop is: "+doNum);
            doNum+=3;
        }while(doNum<10);

        System.out.println("Choose you FIGHTEEEEER: (1-3) ");
        int choice=sc.nextInt();
        switch(choice){
            case 1: System.out.println("You choose Anakin Skywalker"); break;
            case 2: System.out.println("You choose Drima"); break;
            case 3: System.out.println("You choose IDK"); break;
            default: System.out.println("are you dumb????");
        }
    }
}
