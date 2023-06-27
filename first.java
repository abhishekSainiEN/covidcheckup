package covid checkup;

mport java.util.*;

// Compiler version JDK 11.0.2

class Dcoder
{
   static int detail(int...arr){
      int result=0;
      for(int a:arr){
        result=result+a;
        }
        return result;
       
        }
       
   public static void main(String args[])
   {
     Date d1=new Date();
     System.out.println(d1);
    
System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    
     Scanner sc=new Scanner(System.in);
    System.out.println("Hello, Dcoder!");
    System.out.println("covid 19 vaccine center today applicant \n");
    System.out.println("check list of regular vaccine oppintment\n");
   
  
System.out.println("today list of applicant\n");
System.out.println("check applicant detail in row wise\n");  
    String [] arr={"aman","raman","chaman","ashu"};
    //int [] ae={1,2,3};
   for(int i=0;i<arr.length;i++){
     System.out.println(arr[i]);
    }
   
    System.out.println("check today vaccination applicant");
    //int p=0;
    //while(p<=10){
     // p++;
    int userInput=sc.nextInt();
   
    String a=arr[0];
    String b=arr[1];
    String c=arr[2];
    String d=arr[3];

    if(userInput==1){
      System.out.println("name:" +a);
      int fg=detail(17);
    int  w=detail(123456789);
   System.out.println("age:"+fg+"  number:"+w);
   
   
        }else if(userInput==2){
          System.out.println("name:" +b);
          int h=detail(19);
    int  i=detail(123456789);
   System.out.println("age:"+h+"  number:"+i);
   
          }else if(userInput==3){
            System.out.println("name:" +c);;
            int f=detail(19);
    int  w1=detail(123456789);
   System.out.println("age:"+f+"  number:"+w1);
   
            }else if(userInput==4){
              System.out.println("name:" +d);
              int l=detail(54);
    int  u=detail(123456789);
   System.out.println("age:"+l+"  number:"+u);
   
      }else{
        System.out.println("invalid");
   // }
   
   }
   }
}