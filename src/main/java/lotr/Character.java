package lotr;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public abstract class Character {
    private int hp;
    private int power;
    public int getHp() { return Math.max(0, hp); }
    public void setHp(int hp) { this.hp = Math.max(0, hp); }

    public abstract void kick(Character whoKick);

    public boolean isAlive() {
        return getHp() > 0;
    }
    public int getPower() { return power; }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" + "hp=" + hp + ", power=" + power + "}";
    }
}
