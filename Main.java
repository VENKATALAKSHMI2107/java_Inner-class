class  College{
    private  static String Name="Dr.Mgr";
    String  Location="Chennai";

     static class Department{
        static int dept_count=3;
        public void deatils(){
            System.out.println("\t\t\tStatic Inner class");
            System.out.println("college name is :"+Name);//static mem access directly
            College c=new College();
            System.out.println("college loaction is :"+c.Location);//non static with obj ref we can access
        }
     }
    class ClassRoom{
        static int classroom_count=10;
        void display(){
            System.out.println("\t\t\tNonStatic Inner class");
            System.out.println("college name is :"+Name);//static mem access directly
            System.out.println("college loaction is :"+Location);

        }
    }
}
    
    class Main {
        public static void main(String[] args) {
            College.Department d=new College.Department();
            d.deatils();
            System.out.println("department count is:"+College.Department.dept_count);
            College c=new College();
            College.ClassRoom cr=c.new ClassRoom();
            cr.display();
            
            System.out.println("class room  count is:"+College.ClassRoom.classroom_count);

        }
    
}
