package Abstract_Factory.Walls;

public class MetalWall implements Wall{
    private String material;
    
    @Override
    public void setMaterial(){
        this.material = "Metal";
        System.out.println("Se creó una pared de " + material);
    }
}
