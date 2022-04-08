class House {

    private String basement; 
    private String structure; 
    private String roof; 
    private String interior; 

    public void setBasement(String basement) {

        this.basement = basement; 
    }

    public void setStructure(String structure) {

        this.structure = structure;
    }

    public void setRoof(String roof) {

        this.roof = roof; 
    }

    public void setInterior(String interior) {

        this.interior = interior;
    }
}

interface HouseBuilder {

    public void buildBasement(); 
    public void buildStructure();
    public void buildRoof();
    public void buildInterior();
    public void getHouse();
}

class IglooBuilder implements HouseBuilder {

    private House house; 

    public IglooBuilder() {

        this.house = new House();
    }

    public void buildBasement() {

        house.setBasement("Ice Bars");
    }

    public void buildStructure() {

        house.setStructure("Ice blocks");
    }

    public void buildRoof() {

        house.setRoof("Ice dome");
    }

    public House getHouse() {

        return house; 
    }
}