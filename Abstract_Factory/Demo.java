package Abstract_Factory;

import Abstract_Factory.MazeFactory.EasyMaze;
import Abstract_Factory.MazeFactory.Maze;

public class Demo {
    public static Application config() {
        Application app;
        Maze factory;
        factory = new EasyMaze();
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = config();
        app.print();
    }
}
