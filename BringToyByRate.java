import java.util.List;

//метод выбора призовой игрушки и запись в массив
class BringToyByRate {
    public Toy chooseByRate(List<Toy> toys) {
        double completeRate = 0.0;
        for (Toy toy : toys) {
            completeRate += toy.getRate();
        }
        double rate = Math.random() * completeRate;
        double countRate = 0.0;
        for (Toy toy : toys) {
            countRate += toy.getRate();
            if (countRate >= rate)
                return toy;
        }
        throw new RuntimeException("Should never be shown.");
    }

}

