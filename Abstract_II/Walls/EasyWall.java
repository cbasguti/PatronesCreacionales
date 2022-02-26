package Abstract_II.Walls;

import Basic.*;

public class EasyWall extends Wall{
    private String material;

    public EasyWall(){
        this.material = "Glass";
    }

    public void print(){
        System.out.println("Esta pared está hecha de: " + material);
    }
}
