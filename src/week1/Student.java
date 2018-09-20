package week1;
public class Student {

    private String name,id,group,email;

    public void setName(String name )
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
    public void setId (String id )
    {
        this.id = id ;
    }

    public String getId()
    {
        return id;
    }
    public void setGroup( String group)
    {
        this.group = group;
    }
    public String getGroup(){
        return group;
    }
    public void setEmail( String Email) {
        this.email = email;
    }
    public String getEmail()
    {
        return email;
    }

    Student() {

        name="Student";
        id = "000 ";
        group="INT22041";
        email=" uet@vnu.edu.vn";
    }

    Student(String n, String sid, String em) {
        name = n;
        id = sid;
        group = " INT22041";
        email = em;
    }

    Student(Student s) {
        name = s.name;
        id = s.id;
        group= s.group;
        email= s.email;
    }

    public void getInfo() {

        System.out.println( "thong tin:" + name +" , "+ id + " ," + group + ", " + email);
    }
}