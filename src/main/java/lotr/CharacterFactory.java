package lotr;

import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class CharacterFactory {
    @SneakyThrows
    public static Character createCharacter() {
        Random generator = new Random();
        Reflections reflections = new Reflections("chars");
        Set<Class<? extends Character>> subTypes = reflections.getSubTypesOf(Character.class);
        subTypes.remove(Noble.class);
        List<Class> subList = Arrays.asList(subTypes.toArray(new Class[0]));
        return (Character) subList.get(generator.nextInt(3)).newInstance();
    }
}
