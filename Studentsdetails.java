public class Studentsdetails{
    public static void main(String [] args){
         Students student1 = new Students();


         
         student1.age = 18;
         student1.Reg_no = 64;
         System.out.println("age of student1: " +student1.age);
         System.out.println("Reg_no of student1: " +student1.Reg_no);
         
         Students student2 = new Students();
         student2.age = 22;
         student2.Reg_no = 89;
         System.out.println(" age of student2: " + student2.age);
         System.out.println("Reg_no of student2: " +student2.Reg_no);
        }          
    }


    class Students{
        int age;
        int Reg_no;
    }
    


    

