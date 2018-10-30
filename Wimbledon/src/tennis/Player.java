/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tennis;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Chris
 */
public class Player implements Comparable<Player> {

    int rank;
    List<Result> results;

    @Override
    public String toString() {
        return "Player{" + "rank=" + rank + "\tstrength=" + strength + ", speed=" + speed + ", forehand=" + forehand + ", backhand=" + backhand + ", serve=" + serve + ", combined=" + combined + ", combinedAdjustedForAge=" + combinedAdjustedForAge + ", name=" + name + ", atpPoints=" + atpPoints + ", age=" + age + '}';
    }

    private final int strength;
    private final int speed;
    private final int forehand;
    private final int backhand;
    private final int serve;
    private final int combined;
    private int combinedAdjustedForAge;
    private final String name;

    public int atpPoints = 0;

    public String getName() {
        return name;
    }

    public String getNameAndRank() {
        return name + "(" + rank + ")";
    }

    public int getCombined() {
        return combinedAdjustedForAge;
    }

    public Player() {
        this(DEFAULT_MAX_ATTRIBUTE);
    }

    private static final int DEFAULT_MAX_ATTRIBUTE = 100;

    public Player(final int die) {

        Dice dice = new Dice(die);

        strength = gauss100();// dice.roll();
        speed = gauss100();// dice.roll();
        forehand = gauss100();// dice.roll();
        backhand = gauss100();// dice.roll();
        serve = gauss100();// dice.roll();
        name = Name.generate();

        combined = strength + speed + forehand + backhand + serve;
        results = new ArrayList<>();

        age = 17 + dice.roll() / 5;

        int peak = 28;
        int yearsoffPeak = Math.abs(peak - age);

        combinedAdjustedForAge = combined - (yearsoffPeak * yearsoffPeak);

        System.out.println(this);

    }
    
    
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        int peak = 28;
        int yearsoffPeak = Math.abs(peak - age);

        combinedAdjustedForAge = combined - (yearsoffPeak * yearsoffPeak);
    }

    final int gauss100() {
        Random r = new Random();
        return ((int)(r.nextGaussian()*25))+50;
    }
    
    @Override
    public int compareTo(Player o) {
        return o.atpPoints - atpPoints;
    }

    void addResult(Result res) {
        results.add(res);
    }

    void showResults() {
        System.out.println("Results for " + getNameAndRank());
        for (Result res : results) {
            if (res.winner == this) {
                System.out.println("Win " + res);
            }
            else {
                System.out.println("Lose " + res);
            }
        }
    }
}
