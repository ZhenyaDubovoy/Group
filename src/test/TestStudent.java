package test;
import model.Group;
import model.Student;
import java.util.Scanner;
/**
 * Created by Евгений Дубовой on 02.09.2017.
 */
public class TestStudent {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void main(String[] args) {
         //allocate memory for student(initialize all fields)
        Group aco21 = new Group();
        System.out.print("1. Create Student \n 2. Show students \n 3. Find by id");
        Scanner sc = new Scanner(System.in);
        int choice1 = sc.nextInt();
        if (choice1 == 1)
        {

          System.out.print("input name, phone and birthyear on different lines \n");
            String n = sc.nextLine();
            String p = sc.nextLine();
            int y = sc.nextInt();
            Student k = new Student();
            k.init(n,p, y, aco21.listStud.size()+1);
            aco21.listStud.add(k);
            clearScreen();
            System.out.print("1. Create Student \n 2. Show students \n 3. Find by id");
            choice1 = sc.nextInt();
        }
        if (choice1 == 2)
        {
            for (int i = 0; i<aco21.listStud.size(); i++)
            {
                String l = String.format("Name %s Number %s birthyear %d", aco21.listStud.get(i).name, aco21.listStud.get(i).phone, aco21.listStud.get(i).birthYear);
                System.out.print(l);
            }
            clearScreen();
            System.out.print("1. Create Student \n 2. Show students \n 3. Find by id");
            choice1 = sc.nextInt();
        }
    }
}
