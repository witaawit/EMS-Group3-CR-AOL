package Solution;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManager {
  public void createFile(EmployDetail emp) {
    try {
      File file = new File(getFile(emp.getEmploy_id()));
      if (file.createNewFile()) {
        FileWriter myWriter = new FileWriter(getFile(emp.getEmploy_id()));
        myWriter.write(emp.toFormattedString());
        myWriter.close();
        System.out.println("\nEmployee has been Added :)\n");
      } else {
        System.out.println("\nEmployee already exists :(");
      }
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  public void viewFile(String s) throws Exception {
    File file = new File(getFile(s));
    Scanner sc = new Scanner(file);
    while (sc.hasNextLine()) {
      System.out.println(sc.nextLine());
    }
    sc.close();
  }

  public void updateFile(String s, String o, String n) throws IOException {
    File file = new File(getFile(s));
    Scanner sc = new Scanner(file);
    String fileContext = "";
    while (sc.hasNextLine()) {
      fileContext = fileContext + "\n" + sc.nextLine();
    }
    FileWriter myWriter = new FileWriter(getFile(s));
    fileContext = fileContext.replaceAll(o, n);
    myWriter.write(fileContext);
    myWriter.close();
    sc.close();
  }

  public void removeFile(String ID) {
    File file = new File(getFile(ID));
    if (file.exists()) {
      if (file.delete()) {
        System.out.println("\nEmployee has been removed Successfully");
      } else {
        System.out.println("\nFailed to delete the file. Check file permissions or if it's in use.");
      }
    } else {
      System.out.println("\nEmployee does not exists :( ");
    }

  }

  private String getFile(String id) {
    return "file" + id + ".txt";
  }
}
