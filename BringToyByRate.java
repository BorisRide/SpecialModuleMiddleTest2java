import java.util.List;

class BringToyByRate {

    public Toy bringByRate(List<Toy> toys) {
        
        int countRate = 0;
        for (Toy toy : toys)
            countRate += toy.getDropRate();
        int rate = (int) (Math.random() * countRate);

        int fullRate = 0;
        for (Toy toy : toys) {
            fullRate += toy.getDropRate();
            if (fullRate >= rate)
                return toy;
        }
        throw new RuntimeException("Игрушка не будет разыграна");
    }
}

