import java.util.Scanner;

public class Main {
    public static String changeName(String name){
      return name;
    }
    public static int add(int num1,int num2){
        return num1+num2;
    }

    public static class Student{
        private String name;

        public String getName(){return name;}
        public void setName(String name){this.name=name;}
    }

    public static class Student2{
        private String name;

        Student2(String name){
            this.name=name;
        }
        public String getName(){return name;}
        public void setName(String name){this.name=name;}
    }
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

      String firstName="Amna";
      firstName=changeName("Novo ime");
      System.out.println(firstName);

      int[] arr=new int[3];
      for(int i=0;i<3;i++){
          arr[i]=i+1;
      }
      for(int el:arr){
          System.out.println(el);
      }
      System.out.println("Addition of 4 and 5 is :"+add(4,5));

      Student s=new Student();
      s.setName("AMNAAAAAAAAAAAA");
      System.out.println("Student name is "+s.getName());

      System.out.print("Unesi svoje ime : ");
      String ime=sc.nextLine();
        System.out.print("Unesi svoje godine : ");
        int godine=sc.nextInt();

        System.out.println("ime : "+ime);
        System.out.println("godine : "+godine);

        Student2 s2=new Student2("Amna");
    }
}