package zoo;

import animals.Lion;
import animals.Snake;
import animals.Wolf;
import cage.AnimalCage;

public class Zoo {
    private AnimalCage<Lion> lionCage;
    private AnimalCage<Wolf> wolfCage;
    private AnimalCage<Snake> snakeTerrarium;

    public Zoo(AnimalCage<Lion> lionCage, AnimalCage<Wolf> wolfCage, AnimalCage<Snake> snakeCage) {
        this.lionCage = lionCage;
        this.wolfCage = wolfCage;
        this.snakeTerrarium = snakeCage;
    }
}