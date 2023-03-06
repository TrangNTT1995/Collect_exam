package Animal;

public class Dog extends Animal{
    public String màu_sắc;
    public int cân_nặng;

    public Dog(String tên, int tuổi, String giống) {
        super(tên, tuổi, giống);
    }
    public void setMàu_sắc(String màu_sắc){
        this.màu_sắc=màu_sắc;
    }

    public void setCân_nặng(int cân_nặng) {
        this.cân_nặng = cân_nặng;

    }public void displayInfoDog(){
        System.out.println(Tên + " "+ Tuổi + " "+ Giống + " "+màu_sắc +" "+cân_nặng);
    }
}
