/**
 * Created by jc320680 on 15/08/17.
 */
public class Billing {
    public static void main(String[] args) {
    double tax = 8;
        double priceOfPhotobook = 25;
        double quatity = 2;
        double bookWithTax = (priceOfPhotobook * tax);
        double couponValue = 3;
        computeBill(bookWithTax);
        computeBill(priceOfPhotobook,quatity);
        computeBill(couponValue, priceOfPhotobook, quatity);

    }

    public static void computeBill(double bookWithTax){
        System.out.println(bookWithTax);
    }

    public static void computeBill(double priceOfPhotobook,double quatity) {
        System.out.println((priceOfPhotobook * quatity));
    }

    public static void computeBill(double priceOfPhotobook, double quatity , double couponValue){
        System.out.println(((priceOfPhotobook*quatity)-couponValue) * (8/100));

    }
}
