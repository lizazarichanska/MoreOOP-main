package lotr;

import java.util.Random;

public class King extends Character {
    public King() {
        super(new Random().nextInt(11) + 5, new Random().nextInt(11) + 5);
    }
    @Override
    public void kick(Character whoKick) {
        whoKick.setHp(whoKick.getHp() - new Random().nextInt(11) + 5);
    }
}
