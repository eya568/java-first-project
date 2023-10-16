
import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author eyaso
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Produit p = new Produit(1021,"Lait","Delice",4.0f,new Date("22/07/2030"));
        Magasin m = new Magasin(1245,"Esharika");
        m.addProduct(p);
        m.details();
        m.sizeshow();
        
       
        
    }

    


public static class Produit {
    public int id;
    public String libel;
    public String brand;
    public float price;
    public Date dateExp;
    
    //for empty object
    public Produit(){}
    //for regular object
    public Produit(int id,String brand,String libel,float price,Date dateExp){
        this.id = id;
        this.brand = brand;
        this.libel = libel;
        if(price >= 0){
            this.price = price;
        }else{
            this.price = 0;
        }
        
        this.dateExp = dateExp;
    }
    //afficher produit
     public String toString() {
        return "id: " + id + ", libellé: " + libel + ", marque: " + brand + ", prix: " + price + ", date d'expiration: " + dateExp;
    }
    }


public static class Magasin{
    private final int id;
    private final String adresse;
    private final int capacity = 50;
    private final ArrayList <Produit> products = new ArrayList<>();
    private int stock = 0;
    
    //constct magasin
    public Magasin(int id,String adresse){
        this.id = id;
        this.adresse = adresse;
    }
   
        /**
         *
         * @param produit
         * @return
         */
        public boolean addProduct(Produit produit){
        if (stock < capacity){
            products.add(produit);
            stock++;
            System.out.println("Product added successfully.");
            return true;
        }else{
            System.out.println("capcity max reached");
            return false;
        }  
    }
    
    //afficher detail
    public void details(){
        System.out.println("magasin id: "+id+" addresse: "+adresse);
        for (int i = 0;i < stock; i++){
            System.out.println(products.get(i).toString());
        }
    }
    //savoir le nb total produit
    public void sizeshow(){
        System.out.println("bn total de produits: "+stock);
    }
    
}   
}



 


