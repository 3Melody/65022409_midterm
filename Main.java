public class Main{
    public static void main(String[] args) {
       Product p = new Product("chair", 500.0);
       Electronics e = new Electronics("Television", 20000.0, "Samsung", "Neo QLED");
       Smartphone s = new Smartphone("Iphone", 40000.0, "Apple", "Iphone 99", "ios");
       Book b = new Book("OOP Programming", 250.0, "John Doe", 300);
       
        p.getName();
        p.getPrice();
        System.out.println("****************************");
        e.getName();
        e.getPrice();
        e.getBrand();
        e.getModel();
          System.out.println("****************************");
        s.getName();
        s.getPrice();
        s.getBrand();
        s.getModel();
        s.getOperatiogSystem();
        System.out.println("****************************");
        b.getName();
        b.getPrice();
        b.getAuthor();
        b.getPages();
    }
}

class Product{
    String name;
    Double price;

    Product(String name,Double price){
        this.name = name;
        this.price = price;
    }
    

    public String setName(){
        return name;
    }

    public Double setPrice(){
        return price;
    }

   
    public void getName(){
        System.out.println("Product name : "+this.name);
    }

    public void getPrice(){
        System.out.println("Product price : "+this.price);
    }
}

class Electronics extends Product{
    String brand;
    String model;

    Electronics(String name,Double price,String brand,String model){
        super(name, price);
        this.brand = brand;
        this.model = model;
    }

    public String setBrand(){
        return brand;
    }

    public String setModel(){
        return model;
    }

    public void getBrand(){
        System.out.println("Brand : "+this.brand);
    }

    public void getModel(){
        System.out.println("Model : "+this.model);
    }
}

class Smartphone extends Electronics{
    String OperatingSystem;
    
       Smartphone(String name,Double price,String brand,String model,String OperatingSystem){
        super(name, price, brand, model);
        this.OperatingSystem = OperatingSystem;
    }

    public String setOperatingSystem(){
        return OperatingSystem;
    }

    public void getOperatiogSystem(){
        System.out.println("Operating System : "+OperatingSystem);
    }
}

class Book extends Product{
    String author;
    int pages;

    Book(String name,Double price,String author,int pages){
        super(name, price);
        this.author = author;
        this.pages = pages;
    }

    public String setAuthor(){
        return author;
    }

    public int setPages(){
        return pages;
    }

    public void getAuthor(){
        System.out.println("Author : "+this.author);
    }

    public void getPages(){System.out.println("Number of Pages : " + this.pages);}
}


