
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
        Mechanic baseengineer=new Mechanic("ajay","proddatur",900000);
        Mechanic datastrategest=new Mechanic("kranthi","banglore",100000);
        Mechanic driversuppoet=new Mechanic("sai","kakinada",80000);
        System.out.println("mechanic1" + baseengineer.getName() +" "+ baseengineer.getAddress()+  " " + baseengineer.getSalary());
        System.out.println("mechanic2" + datastrategest.getName() + " " + datastrategest.getAddress()+ " " + datastrategest.getSalary());
        System.out.println("mechanic3" + driversuppoet.getName()+ " " + driversuppoet.getAddress() + " " + driversuppoet.getSalary());

    }
}