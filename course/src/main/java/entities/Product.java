package entities;

public class Product {
    
    public String name;
    public double price;
    public int quantity;
    
    public double totalValueInStock (){
        
        return price * quantity;
    }
    public void addProducts (int quantity){
        if (quantity>0){
        this.quantity = this.quantity + quantity;
        }
        else{
            System.out.println("Insira um valor positivo");
        }
    }
    public void removeProducts (int quantity){
        if(quantity>0){
        this.quantity -= quantity;
        }
        else{
            System.out.println("Insira um valor positivo");
        }
    }
    public String toString(){
        return name 
                + ", " 
                + String.format("%.2f", price)
                + " reais, "
                + quantity 
                + " unidades, Total: " 
                + String.format("%.2f", totalValueInStock())
                +" reais";
    }
}
