
import com.Driver.Race.Driver;
import com.Driver.Race.Mechanic;

public class Main
{
    public static void main(String[] args)
    {
        Driver driver1=new Driver("sreenath","banglore",50000);
        Driver driver2=new Driver("thiru","kadapa",70000);
        System.out.println("driver1 " +" "+ driver1.getName() +" "+ driver1.getAddress()+" " + driver1.getSalary());
        System.out.println("driver2 " +" "+ driver2.getName() +" "+ driver2.getAddress() +" " + driver2.getSalary());
        Driver baseengineer=new Mechanic("ajay","proddatur",900000);
        Driver datastrategest=new Mechanic("kranthi","banglore",100000);
        Driver driversuppoet=new Mechanic("sai","kakinada",80000);
        System.out.println("Driver3"+ " " + baseengineer.getName() +" "+ baseengineer.getAddress()+  " " + baseengineer.getSalary());
        System.out.println("Driver4"+ " " + datastrategest.getName() + " " + datastrategest.getAddress()+ " " + datastrategest.getSalary());
        System.out.println("Driver5" + " " + driversuppoet.getName()+ " " + driversuppoet.getAddress() + " " + driversuppoet.getSalary());

    }
}