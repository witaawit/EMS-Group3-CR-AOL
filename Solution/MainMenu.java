package Solution;

import java.util.Scanner;

public class MainMenu {
  private Scanner sc = new Scanner(System.in);
  private MenuDisplay display = new MenuDisplay();
  private MenuController controller = new MenuController();

  public void runSystem() {
    int choice = 0;
    while (choice != 5) {
      display.clearScreen();
      display.showMenu();
      System.out.print("\nPlease Enter choice :");
      choice = Integer.parseInt(sc.nextLine());
      controller.handle(choice);
      display.pressContinue(sc);
    }
  }
}