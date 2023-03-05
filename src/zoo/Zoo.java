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

    public void deleteLion() {
        lionCage.getAnimal();
    }

    public void createLion(Lion lion) {
        lionCage.addAnimal(lion);
    }
    public void createSnake(Snake snake) {
        snakeTerrarium.addAnimal(snake);
    }
    public void deleteSnake(){
        snakeTerrarium.getAnimal();
    }
    public void createWolf(Wolf wolf) {
        wolfCage.addAnimal(wolf);
    }
    public void deleteWolf() {
        wolfCage.getAnimal();
    }

    @Override
    public String toString() {
        return lionCage.toString() + "  " + wolfCage.toString() + "   " + snakeTerrarium.toString();
    }
}