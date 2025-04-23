
import java.util.PriorityQueue;
import java.util.Scanner;

public class PrizeDrows {
    public static void main(String[] args) {
        
        //код ниже заменить на ввод с консоли
        PriorityQueue<ToyStore> toyStore = new PriorityQueue<>();
        toyStore.add(new ToyStore(512, "Матрешка", 45));
        toyStore.add(new ToyStore(1024, "Шаркунок", 5));
        toyStore.add(new ToyStore(24, "Головоломка", 25));
    }
    
    // Создадим меню, позволяющее пользователю выбирать критерии фильтрации. 
    // Используем Scanner для ввода данных от пользователя.
    Scanner scanner = new Scanner(System.in);

    //Используем цикл while для запроса хочет ли посетительучаствовать в розыгрыше игрушки.
    boolean continueFiltering = true;
        while (continueFiltering) {
            
            //вызов класса розыгрыша игрушки
            //После каждого выбора критерия спросим у пользователя, хочет ли он добавить еще один критерий. 
            System.out.print("Хотите участвовать в розыгрыше игрушки? (yes/no): ");
            String response = scanner.nextLine();
            //проверка правильности ввода System.out.println(response);
            continueFiltering = response.equalsIgnoreCase("yes");

        }
}