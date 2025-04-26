

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ToyStore {
    private List<Toy> toys;

    public ToyStore(List<Toy> toys) {
        this.toys = toys;
    }
    
    //получаем разыгрываемую игрушку
    public Toy getToyPrizeDrows() {
        BringToyByRate random = new BringToyByRate();
        Toy toy = random.chooseByRate(toys);
        return toy;
    }

    //записываем в файл разыгранную игрушку
    public void savePrizeDrows() {
        Toy toy = getToyPrizeDrows();
        String text = toy.toString();
        try(FileWriter writer = new FileWriter("SpecialModuleMiddleTest2java/ToysPrizeDrows.txt", true))
        { 
            writer.write(text);
            writer.append('\n');
            writer.flush();
        }
        catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        toys.remove(toy);
    }

}