package test.serialization.json;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map.Entry;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class JsonTest {

  public static void main(String[] args) throws IOException {

    URL obj = new URL("https://jsonplaceholder.typicode.com/posts");
    HttpURLConnection con = (HttpURLConnection) obj.openConnection();

    con.setRequestMethod("GET");

    BufferedReader in = new BufferedReader(
            new InputStreamReader(con.getInputStream()));
    String inputLine;
    StringBuffer response = new StringBuffer();

    while ((inputLine = in.readLine()) != null) {
        response.append(inputLine);
    }
    in.close();

    System.out.println(response.toString());

    JsonArray array = new Gson().fromJson(response.toString(), JsonArray.class);
    loopToPrintListJson(array, 0);
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