package week2.task3;
public class Xemay {
    private String name , theloai , hang;
    private int phankhoi;
    public Xemay(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhankhoi() {
        return phankhoi;
    }

    public void setPhankhoi(int phankhoi) {
        this.phankhoi = phankhoi;
    }

    public String getTheloai() {
        return theloai;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }
    public void getinfo(){// Ham xuat thong tin
        System.out.println("Ten xe may"+name);
        System.out.println("Phan khoi:"+phankhoi);
        System.out.println("The loai:"+theloai);
        System.out.println("Hang san xuat:"+hang);
    }
    public static void Run(Xemay s1){
        if(s1.phankhoi>=150)
            System.out.println(" Phan Khoi Lon ");
        else System.out.println(" Xe May Binh Thuong");

    }
    public static void tocdo (Xemay s1, Xemay s2){
        if(s1.phankhoi==s2.phankhoi){
            if(s1.hang==s2.hang)
                System.out.println(" Bang nhau");
            else System.out.println(" Khong bang");
        }
        else if(s1.phankhoi>s2.phankhoi)
            System.out.println("Toc do "+s1.name +" >" + " toc do "+s2.name);
        else System.out.println("Toc do "+s1.name +" <" + " toc do "+s2.name);


    }
    public static void main(String[] args) {
        Xemay s1 = new Xemay();
        s1.name = "Wave RSX";
        s1.phankhoi = 110;
        s1.theloai = "Xe so";
        s1.hang = "Honda";
        s1.getinfo();
        Run(s1 );
        System.out.println("----------------------------------");
        Xemay s2 = new Xemay();
        s2.name =" Jupiter";
        s2.phankhoi = 200;
        s2.theloai =" Xe Con";
        s2.hang = " Yamaha";
        s2.getinfo();
        Run(s2);
        tocdo(s1,s2);


    }

}









public class ConMeo {

    private String name, chungloai, maulong;
    private Double cannang;

    public ConMeo() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChungloai() {
        return chungloai;
    }

    public void setChungloai(String chungloai) {
        this.chungloai = chungloai;
    }

    public String getMaulong() {
        return maulong;
    }

    public void setMaulong(String maulong) {
        this.maulong = maulong;
    }

    public Double getCannang() {
        return cannang;
    }

    public void setCannang(Double cannang) {
        this.cannang = cannang;
    }

    public void getinfo() { // Ham xuat thong tin
        System.out.println("Ten con meo:" + name);
        System.out.println("Chung loai :" + chungloai);
        System.out.println("Mau long:" + maulong);
        System.out.println("Can nang:" + cannang);

    }
    public void Keu(){
        System.out.println("Meo.....Meo.....");
    }
    public static void SoSanh(ConMeo s1, ConMeo s2){
        if(s1.cannang.equals(s2.cannang)  )
            System.out.println("Bang can nhau   ");
        else System.out.println(" Khong Bang Can Nhau");
        if(s1.chungloai.equals(s2.chungloai))
            System.out.println(" Cung chung loai");
        else System.out.println(" Khac chung loai");
        if (s2.maulong.equals(s1.maulong))
            System.out.println(" Cung mau long");
        else System.out.println("khong cung mau long");
    }

    public static void main(String[] args) {
        ConMeo s1 = new ConMeo();
        ConMeo s2 = new ConMeo();
        s1.name = "Shizuka";
        s1.chungloai = "Meo Batu";
        s1.maulong = "Xam";
        s1.cannang = 4.2;
        s1.getinfo();
        s1.Keu();
        s2.name=" Miku";
        s2.chungloai = " Meo Ai Cap";
        s2.maulong ="Xam";
        s2.cannang= 3.0;
        s2.getinfo();
        s2.Keu();
        SoSanh(s1,s2);

    }

}





public class CaiQuat {

    private String name, feature;
    private int age;

    public CaiQuat(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void getinfo(){ // Ham xuat thong tin
        System.out.println("Ten:" +name);
        System.out.println("Han su dung(nam):"+age);
        System.out.println("Dac diem:"+feature);
    }
    public void Run(){
        System.out.println("Vu....Vu....");
    }
    public static boolean Sosanh(CaiQuat s1 , CaiQuat s2){
        if(s1.feature.equals(s2.feature)){
            return true;
        }
        else    return false;
    }

    public static void main(String[] args) {
        CaiQuat s1 = new CaiQuat();
        s1.name = "Quat dien";
        s1.age = 10;
        s1.feature = "Quat treo tuong";
        s1.getinfo();
        s1.Run();
        CaiQuat s2 = new CaiQuat();
        s2.name = "Quat Giay";
        s2.age = 1;
        s2.feature = "Quay dung suc nguoi";
        s2.getinfo();
        s2.Run();
        if(s1.feature.equals(s2.feature)== true)
            System.out.println("Cung Loai");
        else System.out.println(" Khac loai");

    }

}
