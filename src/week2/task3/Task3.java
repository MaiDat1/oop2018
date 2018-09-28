package week2.task3;
public class Task3 {
    class Xemay{
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
    public void Run(Xemay s1){
        if(s1.phankhoi>=150)
            System.out.println(" Phan Khoi Lon ");
        else System.out.println(" Xe May Binh Thuong");

    }
    public  void tocdo (Xemay s1, Xemay s2){
        if(s1.phankhoi==s2.phankhoi){
            if(s1.hang==s2.hang)
                System.out.println(" Bang nhau");
            else System.out.println(" Khong bang");
        }
        else if(s1.phankhoi>s2.phankhoi)
            System.out.println("Toc do "+s1.name +" >" + " toc do "+s2.name);
        else System.out.println("Toc do "+s1.name +" <" + " toc do "+s2.name);


    }

}









    class ConMeo {

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
    public void SoSanh(ConMeo s1, ConMeo s2){
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



}





    class CaiQuat {

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
    public boolean Sosanh(CaiQuat s1 , CaiQuat s2){
        if(s1.feature.equals(s2.feature)){
            return true;
        }
        else    return false;
    }


}

}
