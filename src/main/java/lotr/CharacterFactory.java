package lotr;

import lombok.SneakyThrows;

import java.util.Random;
import java.util.Set;
import org.reflections.Reflections;
import static org.reflections.scanners.Scanners.SubTypes;

public class CharacterFactory {
    @SneakyThrows
    public static Character createCharacter() {
        Reflections reflections = new Reflections("lotr");
        Set<Class<?>> subTypes =
                reflections.get(SubTypes.of(Character.class).asClass());
        subTypes.remove(Noble.class);
        Class cls = (Class) subTypes.toArray()[new Random().nextInt(subTypes.size())];
        return (Character) cls.getDeclaredConstructor().newInstance();
    }

    public static void main(String[] args) {
        lotr.Character ch = CharacterFactory.createCharacter();
        System.out.println(ch);
    }
}
