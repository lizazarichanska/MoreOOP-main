package kick;

import lotr.Character;

import java.util.Random;

public class NobleKick implements BasicKick {
    private static final Random randomGenerator = new Random();
    public void kick(Character whoKick, Character whoIsKicked) {
        whoIsKicked.setHp(whoKick.getHp() - randomGenerator.nextInt(whoKick.getPower()));
    }
}
