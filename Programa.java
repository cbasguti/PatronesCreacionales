import Factory_Method.*;

public class Programa { 
    private static MazeGameFactory mazeGame;

    public static void main(String[] args) {
        initialize();
        runGame();
    }

    static void initialize() {
        mazeGame = new MazeGameA();
    }

    static void runGame(){
        mazeGame.createMaze();
    }
}



