package javaOOPs;

interface TvRemote {
void turnOnTv();
void turnOffTv();
void incVolume();
 String brandName = "sony";

}
interface SmartTvRemote extends TvRemote{
    void switchToNetflix();
}
class Tv implements SmartTvRemote{
    @Override
    public void turnOnTv(){
        System.out.println("turning on tv");
    }
    public void turnOffTv(){
        System.out.println("turning off tv");
    }
    public void incVolume(){
        System.out.println("increasing volume");
    }
    @Override
    public void switchToNetflix(){
        System.out.println("switching to netflix");
    }

}
    public class AbstractInterfacePractice4 {

    public static void main(String[] args) {
        System.out.println("brand name of tv is: "+TvRemote.brandName);
        SmartTvRemote sony = new Tv();
        sony.turnOnTv();
        sony.incVolume();
        sony.turnOffTv();
        sony.switchToNetflix();
    }
}
