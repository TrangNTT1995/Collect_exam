package Animal;

public class Cat extends Animal{
    public String màu_lông;
    public int chiều_cao;

    public Cat(String tên, int tuổi, String giống) {
        super(tên, tuổi, giống);
    }

    public void setMàu_lông(String màu_lông) {
        this.màu_lông = màu_lông;
    }

    public void setChiều_cao(int chiều_cao) {
        this.chiều_cao = chiều_cao;
    }
    public void displayInfoCat(){
        System.out.println(Tên +" "+ Tuổi +" "+Giống +" "+ màu_lông +" " +chiều_cao);
        ;
    }
}
