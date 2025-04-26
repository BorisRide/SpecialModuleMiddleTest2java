

    /**
     * Магазин игрушек (Java)
     * Проект розыгрыша в магазине игрушек. 
     * Функционал содержит добавление новых игрушек и задания веса для выпадения игрушек.
     */
    
     import java.util.ArrayList;
     import java.util.List;
     import java.util.Scanner;
     
     public class Designer {
     
         public static void main(String[] args) {
     
             //Создадим методы для заполнения значений этих полей данных класса с помощью ввода с консоли
             Scanner scanner = new Scanner(System.in);
             List<Toy> toysOne = new ArrayList<Toy>();
             int counter = 0;
             boolean continueFiltering = true;        
             for(int i=1; i < 5 && continueFiltering == true; i++) {                
                 System.out.println("Введите ID игрушки:");
                 int id = scanner.nextInt();
                 System.out.println("Введите название игрушки:");
                 String name = scanner.next();
                 System.out.println("Введите вес (вероятность выпадения) игрушки:");
                 int dropRate = scanner.nextInt();
                 counter ++;
                 if(i == 1) {
                     Toy toy1 = new Toy(id, name, dropRate);
                     toysOne.add(toy1);
                 } else if(i == 2) {
                     Toy toy2 = new Toy(id, name, dropRate);
                     toysOne.add(toy2);
                 } else if(i == 3) {
                     Toy toy3 = new Toy(id, name, dropRate);
                     toysOne.add(toy3);
                 } else {
                     Toy toy4 = new Toy(id, name, dropRate);
                     toysOne.add(toy4);
                     System.out.print("Ввод закончен.");
                     break;
                 }
                
                 //После каждого ввода данных, пока нет 4-х игрушек, запрашивать, будет ли ещё ввод данных. 
                 System.out.print("Хотите добавить еще одну игрушку? (yes/no): ");
                 String response = scanner.next();
                 continueFiltering = response.equalsIgnoreCase("yes");    
               
             }
     
             //вывод очереди разыгрываемых игрушек, 
             //предполагаем, что как только заканчивается партия из разыгрываемых игрушек, сразу появляется такая же.
             List<Toy> toys = new ArrayList<Toy>();
             boolean continueRant = true;
             while (continueRant) {
                 toys.addAll(toysOne);
                 ToyStore toyStore = new ToyStore(toys);
                 for(int k = 1; k<=counter; k++) {
                     toyStore.savePrizeDrows();
                 }
                 
                 //После каждого запроса на вывод очереди разыгрываемых игрушек запрашивать, нужен ли ещё розыгрыш. 
                 System.out.print("Хотите получить ещё одну последовательность разыгрываемых игрушек? (yes/no): ");
                 String response = scanner.next();
                 continueRant = response.equalsIgnoreCase("yes");
             }
     
         }  
     
     }