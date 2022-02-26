package Factory_Method;
import Basic.Maze;

public class MazeGameA extends MazeGameFactory{
        
    @Override
    public Maze createMaze() {
        return new MazeA();
    }

}


