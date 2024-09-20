import java.util.List;
import java.util.ArrayList;
import java.util.AbstractMap;
import java.util.Map;

public class Util {
    public static final List<Map.Entry<String, String>> recipes = new ArrayList<>();
    public static final List<Map.Entry<String, String>> guitars = new ArrayList<>();

    static {
        recipes.add(new AbstractMap.SimpleEntry<>("Veg Manchurican Recipe", "http://rarerecipes.net/veg_manchurian_recipe.pdf"));
        recipes.add(new AbstractMap.SimpleEntry<>("Veg Recipe Cookbook", "https://www.angelfire.com/ultra/indiandelights/vastrecipes.pdf"));


        guitars.add(new AbstractMap.SimpleEntry<>("Taylor Wood and Steel", "https://woodandsteel.taylorguitars.com/wp-content/uploads/2023/02/3675-WoodSteel-Product-Guide-2023.pdf"));
        guitars.add(new AbstractMap.SimpleEntry<>("Guitar all-in-one for Dummies", "http://160592857366.free.fr/joe/guitar%20tabs/184%20Full%20Album%20Guitar%20Tab%20Books%20.pdf/Guitar%20All-in-One%20for%20Dummies.pdf"));
        guitars.add(new AbstractMap.SimpleEntry<>("Yamaha: Choosing an Electric", "https://www.yamaha.com/US/houseofworship/downloadables/How-to-Choose-Guides/Yamaha-Guide-to-Choosing-an-Electric-Guitar.pdf"));
        guitars.add(new AbstractMap.SimpleEntry<>("Emily by Julian Lage", "https://mistletoemusicschool.com/blog/wp-content/uploads/2020/05/Emily-Julian-Lage.pdf"));
    }

    public static List<Map.Entry<String, String>>getDownloads(String typeOfDownload){
        if (typeOfDownload.equals("recipes")){
            return recipes;
        }
        return guitars;
    }


}
