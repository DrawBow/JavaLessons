import com.sun.source.tree.WhileLoopTree;

import java.util.*;

public class Chapter5_1 {

    public static void main(String[] args) throws Exception {
        String[] heroes = new String[]{"leia", "luke", "obi-wan", "solo", "anakin", "sidius", "yoda", "chewbacca", "windu", "vader"};
        Map<String, Hero> map = addHeroesToMap(heroes);
        for (Map.Entry<String, Hero> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
        iterate(map);
    }
    public static Map<String, Hero> addHeroesToMap(String[] heroes) {
        //напишите тут ваш код
        HashMap<String, Hero> result = new HashMap();
        for (int i = 0; i < heroes.length; i++) {
            result.put(heroes[i], new Hero(heroes[i]));
        }
        return result;
    }

    public static class Hero {
        String name;
        public Hero(String name) {
            this.name = name;
        }
        @Override
        public String toString() {
            return name != null ? name.toUpperCase() : null;
        }
    }

    public static void iterate(Map<String, Hero> map) {
        Iterator <Map.Entry<String, Hero>> iter = map.entrySet().iterator();
        Map.Entry<String, Hero> pair;
        while(iter.hasNext()) {
            pair = iter.next();
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }

}

