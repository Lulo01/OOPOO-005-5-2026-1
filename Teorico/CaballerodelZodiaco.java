
package caballeros_del_zodiaco;

public abstract class CaballerodelZodiaco {
    private String Type;
    private String Name;
    private String Armor;
    private String Hability;
    private String Representation;
    
    public CaballerodelZodiaco (String Type, String Name, String Armor, String Hability, String Representation) {
        this.Type= Type;
        this.Name= Name;
        this.Armor= Armor;
        this.Hability= Hability;
        this.Representation= Representation;
       
        }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getArmor() {
        return Armor;
    }

    public void setArmor(String Armor) {
        this.Armor = Armor;
    }

    public String getHability() {
        return Hability;
    }

    public void setHability(String Hability) {
        this.Hability = Hability;
    }

    public String getRepresentation() {
        return Representation;
    }

    public void setRepresentation(String Representation) {
        this.Representation = Representation;
    }
    
    public static void main (String [] args) {
        
       System.out.println ("\tTipo\tNombre\tArmadura\tHabilidad\tRepresentacion");
       System.out.println(CaballeroOro.getType + CaballeroBronce.getType + CaballeroPlata.getType);
       System.out.
    }
        
  
    
   
