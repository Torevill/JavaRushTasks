package com.javarush.task.task13.task1328;

public abstract class AbstractRobot implements Attackable, Defensable{
    public abstract String getName();



    private static int hitCount;
    private static int hitCountA;
    public BodyPart attack() {
        BodyPart attackedBodyPart = null;
        hitCount = hitCount + 1;

        if (hitCount == 1) {
            attackedBodyPart = BodyPart.ARM;
        } else if (hitCount == 2) {
            attackedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 3) {
            attackedBodyPart = BodyPart.LEG;
        }else if(hitCount == 4){
            hitCount = 0;
            attackedBodyPart = BodyPart.CHEST;

        }
        return attackedBodyPart;
    }

    public BodyPart defense() {
        BodyPart defencedBodyPart = null;
        hitCountA = hitCountA + 1;

        if (hitCountA == 1) {
            defencedBodyPart = BodyPart.HEAD;
        } else if (hitCountA == 2) {
            defencedBodyPart = BodyPart.LEG;
        } else if (hitCountA == 3) {
            defencedBodyPart = BodyPart.ARM;
        } else if(hitCountA == 4){
            hitCountA = 0;
            defencedBodyPart = BodyPart.CHEST;
        }
        return defencedBodyPart;
    }


}
