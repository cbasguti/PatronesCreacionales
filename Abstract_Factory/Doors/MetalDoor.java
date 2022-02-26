package Abstract_Factory.Doors;

public class MetalDoor implements Door{
    private String material;

    @Override
    public void setMaterial(){
        this.material = "Metal";
        System.out.println("Se creó una puerta de " + material);
    }
}
