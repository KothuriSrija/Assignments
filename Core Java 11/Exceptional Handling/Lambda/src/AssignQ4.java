import java.util.ArrayList;
import java.util.function.Predicate;
interface RemoveDup
{
    public int removeDup(String str);
}
public class AssignQ4 {
    public ArrayList<String> removeOddLength(ArrayList<String> employeeList){
        ArrayList<String> list = new ArrayList<>();
        Predicate<String> filterEmp = (p)-> {
            if(Math.floorMod(p.length(),2)==0)
                return  true;
            else
                return false;
        };

        employeeList.stream()
                .filter(filterEmp)
                .forEach(p->list.add(p));

        return  list;
    }
    public static void main(String[] args) {
        ArrayList<String> employeeList = new ArrayList<>();
        employeeList.add("Kitkat");
        employeeList.add("Cadbury");
        employeeList.add("Munch");
        employeeList.add("Silk");
        employeeList.add("Snickers");

        AssignQ4 assignQ4 = new AssignQ4();
        System.out.println(assignQ4.removeOddLength(employeeList));

    }
}