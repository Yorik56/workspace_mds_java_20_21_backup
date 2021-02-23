package test.serialization.json;

import java.util.Arrays;

import com.google.gson.Gson;

import test.serialization.json.entities.Class1;
import test.serialization.json.entities.Class2;

public class JsonTest {

  public static void main(String[] args) {

    Class1 class1 = new Class1(10,"aze","qwert",new Class1(11, "subAze", "subQwert", null, null),
        Arrays.asList(
            new Class1(12, "listF1", "listL1", null, null),
            new Class1(13, "listF2", "listL2", null, null),
            new Class1(14, "listF3", "listL3", null, null)
            ));

    // Sérialisation
    String data = new Gson().toJson(class1);

    System.out.println(data);

    // Désérialisation
    Class1 class1Output = new Gson().fromJson(data, Class1.class);
    System.out.println(class1Output);

    // Désérialisation dans un mauvais objet
    Class2 class2Output = new Gson().fromJson(data, Class2.class);
    System.out.println(class2Output);
  }

}