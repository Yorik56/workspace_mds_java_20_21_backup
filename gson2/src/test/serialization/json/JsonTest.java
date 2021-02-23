package test.serialization.json;


import java.util.Map.Entry;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class JsonTest {

  public static void main(String[] args) {

    JsonObject manualJson = new JsonObject();

    manualJson.addProperty("prop1", "10");

    JsonObject subObject = new JsonObject();
    subObject.addProperty("subProp1", "hello");
    subObject.addProperty("subProp2", true);

    manualJson.add("prop2", subObject);

    JsonArray subArray = new JsonArray();
    for (int i = 0; i < 5; i++) {
      JsonObject arrayItem = new JsonObject();
      arrayItem.addProperty("firstname", "f" + i);
      arrayItem.addProperty("lastname", "l" + i);

      subArray.add(arrayItem);
    }

    manualJson.add("prop3", subArray);

    // Sérialisation
    String data = new Gson().toJson(manualJson);

    System.out.println(data);

    // Désérialisation
    JsonObject jsonObjectOutput = new Gson().fromJson(data, JsonObject.class);
    System.out.println(jsonObjectOutput);

    loopToPrintJson(jsonObjectOutput, 0);
  }

  private static void loopToPrintJson(JsonObject jsonObjectOutput, int depth) {
    for (Entry<String, JsonElement> jsonElement : jsonObjectOutput.entrySet()) {
      if (jsonElement.getValue().isJsonObject()) {
        StringBuilder sb = DepthTabs(depth);
        System.out.println(sb.toString() + jsonElement.getKey());
        loopToPrintJson((JsonObject) jsonElement.getValue(), depth + 1);
      } else if (jsonElement.getValue().isJsonArray()) {
        StringBuilder sb = DepthTabs(depth);
        System.out.println(sb.toString() + jsonElement.getKey());
        loopToPrintListJson((JsonArray) jsonElement.getValue(), depth + 1);
      } else if (jsonElement.getValue().isJsonPrimitive()) {
        StringBuilder sb = DepthTabs(depth);
        System.out.println(sb.toString() + jsonElement.getKey() + ":" + jsonElement.getValue());
      }
    }
  }

  private static void loopToPrintListJson(JsonArray jsonArray, int depth) {
    for (JsonElement jsonElement : jsonArray) {
      if (jsonElement.isJsonObject()) {
        loopToPrintJson((JsonObject) jsonElement, depth + 1);
      } else if (jsonElement.isJsonArray()) {
        loopToPrintListJson((JsonArray) jsonElement, depth + 1);
      } else if (jsonElement.isJsonPrimitive()) {
        StringBuilder sb = DepthTabs(depth);
        System.out.println(sb.toString() + jsonElement);
      }
    }
  }

  private static StringBuilder DepthTabs(int depth) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < depth; i++) {
      sb.append("\t");
    }
    return sb;
  }
}