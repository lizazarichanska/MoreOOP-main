package kick;

import lotr.Character;

public class ElfKick implements BasicKick {
    public void kick(Character whoKick, Character whoIsKicked) {
        if (whoIsKicked.getPower() < whoKick.getPower()) {
            whoIsKicked.setHp(0);
        }
    }
}
