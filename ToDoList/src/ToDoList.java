import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        int choice;

        System.out.println("=== TO-DO LIST APP ===");

        while (true) {
            System.out.println("\n1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Delete Task");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter a new task: ");
                    String task = sc.nextLine();
                    tasks.add(task);
                    System.out.println("✅ Task added!");
                    break;

                case 2:
                    if (tasks.isEmpty()) {
                        System.out.println("📭 No tasks found!");
                    } else {
                        System.out.println("\nYour Tasks:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;

                case 3:
                    if (tasks.isEmpty()) {
                        System.out.println("❌ No tasks to delete!");
                    } else {
                        System.out.println("\nEnter task number to delete: ");
                        int taskNum = sc.nextInt();
                        sc.nextLine();
                        if (taskNum > 0 && taskNum <= tasks.size()) {
                            tasks.remove(taskNum - 1);
                            System.out.println("🗑️ Task deleted!");
                        } else {
                            System.out.println("⚠️ Invalid task number!");
                        }
                    }
                    break;

                case 4:
                    System.out.println("👋 Exiting To-Do List... Have a nice day!");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("⚠️ Invalid choice. Try again!");
            }
        }
    }
}
