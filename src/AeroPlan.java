public class AeroPlan extends JavaApplication49{
    public void walk(){
        System.out.println("AeroPlan is Flying");
    }
    public static void main(String[] args){
        AeroPlan garuda = new AeroPlan();
        garuda.function();
        garuda.fuel();
        garuda.walk();
    }
}
