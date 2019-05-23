public class TotalPrice extends MealPrice{
    public static void main(String args[]){
        double tipPercent = 0.20;
        MealPrice p1 = new MealPrice();
        System.out.println("The meal price is "+p1.price);
        System.out.println("The tip is "+p1.price*tipPercent);
        System.out.println("The total cost is "+(p1.price+(p1.price*tipPercent)));
}
}