package Abstract_Factory.Doors;

public class CrystalDoor implements Door{
    private String material;
    
    @Override
    public void setMaterial(){
        this.material = "Crystal";
        System.out.println("Se creó una puerta de " + material);
    }
}
