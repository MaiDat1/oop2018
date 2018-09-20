package week1;
public class StudentManagement {

    public static Student std[] = new Student[100];

    public static boolean sameGroup(Student s1, Student s2) {
        String group1 = s1.getGroup();
        String group2 = s2.getGroup();
        if( group1.equals(group2)){
            return true;
        }
        else
            return false;
    }
    public static void studentsByGroup() {
        int [] checker = new int [6];
        for(int i=0;i<6;i++){
            checker[i]=0;
        }
        for(int i=0;i <6;i++) {
            if (checker[i] == 0) {
                System.out.println("Lop: " + std[i].getGroup());
                for (int j = i; j < 6; j++) {
                    if (std[i].getGroup().equals(std[j].getGroup())) {
                        System.out.println(std[j].getName());
                        checker[j] = 1;
                    }
                }
            }
            System.out.println("--------------------------------------------");
        }
    }

    public static void removeStudent(String id) {
        // TODO:
        for(int i=0;i<6;i++){
            if(std[i].getId().equals(id)){
                std[i].setName("");
                std[i].setId("");
                std[i].setGroup("");
                std[i].setEmail("");
                break;
            }
        }
    }

    public static void main(String[] args) {
        // TODO:
        Student student = new Student();
        student.setName (" Mai Thanh Danh");
        student.setGroup(" K62-CF");
        student.setId(" 17020672");
        student.setEmail("fornavita4@gmail.com");
        System.out.println( student.getName());
        student.getInfo();
        std[0]= new Student();
        std[0].getInfo();

        std[1]= new Student( " Mai Hai Dang" , " 17020672 " , " fornavita4@gmail.com");
        std[1].getInfo();

        std[2] = new Student ( student );
        std[2].getInfo();

        std[3]= new Student( " Le Hai Dang ", " 17026455" ," haidang@gmail.com");
        std[3].getInfo();

        std[4]=new Student ( " Dinh The Hiep ", " 17023645", " dinhhiep@gmail.com");
        std[4].getInfo();

        std[5]= new Student();
        std[5].setName(" Doan Duc Dung");
        std[5].setGroup("INT22042");
        std[5].setId("17026487");
        std[5].setEmail("ducdung@gmail.com");

        if(sameGroup(std[3],std[4])==true)
            System.out.println(" Cung Lop");
        else System.out.println(" Khong cung lop");
        if(sameGroup(std[4],std[5])==true)
            System.out.println(" Cung lop");
        else System.out.println("Khong cung lop");
        if(sameGroup(std[5],std[3])==true)
            System.out.println("Cung lop");
        else System.out.println("Khong cung lop");

        studentsByGroup();
        removeStudent("1702672");
    }
}