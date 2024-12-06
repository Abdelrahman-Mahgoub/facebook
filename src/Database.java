import com.google.gson.*;
import java.io.*;
import java.util.*;

public class Database {
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    // Generic method to read data from a JSON file
    public static <T> List<T> readFromFile(String filePath, Class<T[]> clazz) {
        try (Reader reader = new FileReader(filePath)) {
            T[] array = gson.fromJson(reader, clazz);
            return array != null ? new ArrayList<>(Arrays.asList(array)) : new ArrayList<>();
        } catch (FileNotFoundException e) {
            // File doesn't exist, return an empty list
            return new ArrayList<>();
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    // Generic method to write data to a JSON file
    public static <T> void writeToFile(String filePath, List<T> data) {
        try (Writer writer = new FileWriter(filePath)) {
            gson.toJson(data, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
