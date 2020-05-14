import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.stream.Stream;

public class Utils {

  public static void loadStringsToArray(ArrayList<String> arrlist) throws IOException {
    Path path = Paths.get("BookTitles.txt");
    // System.out.println(path);
    arrlist.clear();

    // The stream file will also be closed here
    try (Stream<String> lines = Files.lines(path)) {
      Object[] arr = lines.toArray();

      for (Object t : arr) {
        arrlist.add(t.toString());
      }
    }
  }
}
