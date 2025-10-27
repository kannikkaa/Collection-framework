package javaOOPs;

interface RockStarGames{
    void fire();
}
class TommyVecatti implements RockStarGames {
    public void fire(){
        System.out.println("Firing......");
    }
    public void hit() {
        System.out.println("Hitting......");
    }
    public void run(){
        System.out.println("Running...........");
    }
}

    public class Oops3 {
        public static void main(String[] args) {
TommyVecatti myGame = new TommyVecatti();
myGame.fire();
myGame.hit();
        }
    }

