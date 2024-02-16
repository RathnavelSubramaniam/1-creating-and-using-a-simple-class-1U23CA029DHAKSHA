class Persona{
String FirstName;
String lastName;
 int age;
Persona (String fName,String lName,int a) {
 FirstName = fName;
lastName = lName;
 age = a;
 }
String getfullname(){
return FirstName+" "+lastName;
     }
     }
 class Person{
     public static void main(String args[]){
                                                                            
     Persona a1 = new Persona("Jhon","Doe",30);
     Persona a2 = new Persona("Alice","Smith",25);
    System.out.println("Person 1:"+a1.getfullname());
 System.out.println("Person 2:"+a2.getfullname());
 double average = ((a1.age + a2.age)/2.0);
         System.out.println("Average Age:"+average);
     }
 }