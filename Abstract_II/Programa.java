package Abstract_II;

import Basic.Maze;
import Abstract_II.Factories.EasyFactory;
import Abstract_II.Factories.MazeFactory;

public class Programa {
    private static MazeGame configGame(){
        MazeGame app = new MazeGame();
        Maze maze;
        MazeFactory factory;
        factory = new EasyFactory();
        maze = app.CreateMaze(factory);
        app.setMaze(maze);
        return app;
    }

    public static void main(String[] args) {
        MazeGame app = configGame();
        app.print();
    }
}
