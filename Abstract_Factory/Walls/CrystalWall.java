package Abstract_Factory.Walls;

public class CrystalWall implements Wall{
    private String material;
    
    @Override
    public void setMaterial(){
        this.material = "Crystal";
        System.out.println("Se creó una pared de " + material);
    }
}
