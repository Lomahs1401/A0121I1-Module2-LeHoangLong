public class DemoFan {
    public static void main(String[] args) {
        Fan fan =new Fan(Fan.FAST,true,10,"yellow");
        Fan fan1 =new Fan(Fan.MEDIUM,false,5,"blue");
        System.out.println(fan);
        System.out.println(fan1);
    }
}
