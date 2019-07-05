class Calculator{
    Floor floor;
    Carpet carpet;
    Calculator(Floor floor,Carpet carpet){
        this.floor=floor;
        this.carpet=carpet;
    }
    int getTotalCost(){
        return carpet.getCost() * floor.getArea();
    }
}