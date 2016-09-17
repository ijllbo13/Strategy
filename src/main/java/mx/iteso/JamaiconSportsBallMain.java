package mx.iteso;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.balls.*;

/*

1 checkpoint - Add 5 more ball types to the code
1 checkpoint - Add a new behavior that can be different between balls
2 checkpoints - Alter the code to be able to set the bouncing behavior dynamically (suggestion: use Ball’s constructor and/or getters/setters)
1 checkpoint - Finish the main class to print all available ball types
2 checkpoints - Complete unit tests


** PONER LAS CONSTANTES EN INTERFACES, por ejemplo los sintrgs public static String NORMAL_BOUNCE = "I'm bouncing irregularly!"; en BounceBehavior
*
* */


public class JamaiconSportsBallMain {
    public static void main (String[] args) {

        Ball soccer = new SoccerBall();
        Ball base = new BaseballBall();
        Ball american = new AmericanFootballBall();
        Ball basket = new BasketBallBall();
        Ball beach = new BeachBall();
        Ball golf = new GolfBall();
        Ball pingPong = new PingPongBall();
        Ball crystal = new CrystalBall();


        System.out.println(soccer.roll());
        System.out.println(soccer.performBounce());
        System.out.println(soccer.performDeflate());
        System.out.println(soccer.performInflate());
        System.out.println(soccer.performAerialDrift());
        soccer.setBounceBehavior(2);
        System.out.println(soccer.performBounce());

        System.out.println();

        System.out.println(american.roll());
        System.out.println(american.performBounce());
        System.out.println(american.performDeflate());
        System.out.println(american.performInflate());
        System.out.println(american.performAerialDrift());
        american.setBounceBehavior(3);
        System.out.println(american.performBounce());

        System.out.println();

        System.out.println(base.roll());
        System.out.println(base.performBounce());
        System.out.println(base.performDeflate());
        System.out.println(base.performInflate());
        System.out.println(base.performAerialDrift());
        base.setBounceBehavior(1);
        System.out.println(base.performBounce());

        System.out.println();

        System.out.println(basket.roll());
        System.out.println(basket.performBounce());
        System.out.println(basket.performDeflate());
        System.out.println(basket.performInflate());
        System.out.println(basket.performAerialDrift());
        basket.setBounceBehavior(2);
        System.out.println(basket.performBounce());

        System.out.println();

        System.out.println(beach.roll());
        System.out.println(beach.performBounce());
        System.out.println(beach.performDeflate());
        System.out.println(beach.performInflate());
        System.out.println(beach.performAerialDrift());
        beach.setBounceBehavior(2);
        System.out.println(beach.performBounce());

        System.out.println();

        System.out.println(golf.roll());
        System.out.println(golf.performBounce());
        System.out.println(golf.performDeflate());
        System.out.println(golf.performInflate());
        System.out.println(golf.performAerialDrift());
        golf.setBounceBehavior(3);
        System.out.println(golf.performBounce());

        System.out.println();

        System.out.println(pingPong.roll());
        System.out.println(pingPong.performBounce());
        System.out.println(pingPong.performDeflate());
        System.out.println(pingPong.performInflate());
        System.out.println(pingPong.performAerialDrift());
        pingPong.setBounceBehavior(2);
        System.out.println(pingPong.performBounce());

        System.out.println();

        System.out.println(crystal.roll());
        System.out.println(crystal.performBounce());
        System.out.println(crystal.performDeflate());
        System.out.println(crystal.performInflate());
        System.out.println(crystal.performAerialDrift());
       crystal.setBounceBehavior(1);
        System.out.println(crystal.performBounce());


    }
}
