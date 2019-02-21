package Assignment7;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<News> Data = new ArrayList();
        boolean user = true;
        while (user){
            System.out.println("Menu");
            System.out.println("1. Insert News");
            System.out.println("2. View List News");
            System.out.println("3. Average Rate");
            System.out.println("4. Exit");

            Scanner sc = new Scanner(System.in);
            int Yourchoice = sc.nextInt();
            switch (Yourchoice){
                case 1:{
                    System.out.println("ID enter");
                    int ID = sc.nextInt();

                    System.out.println("Title enter");
                    String Title = sc.nextLine();

                    System.out.println("PublishDate enter");
                    String PD = sc.nextLine();

                    System.out.println("Author enter");
                    String At = sc.nextLine();

                    System.out.println("Content enter");
                    String Ct = sc.nextLine();

                    System.out.println("3 Numbers enter");
                    int nb1 = sc.nextInt();
                    int nb2 = sc.nextInt();
                    int nb3 = sc.nextInt();

                    Data.add(new News(ID,Title,PD,At,Ct, new int[]{nb1, nb1, nb3}));
                    break;
                }
                case 2: {
                    for (News item: Data){
                        item.Display();
                    }
                    break;
                }
                case 3: {
                    for (News item: Data){
                        item.Calculate();
                        item.Display();
                    }
                    break;
                }
                case 4: {
                    user = false;
                    System.out.println("Thank you! EXIT!");
                    break;
                }

            }
        }


    }
}
