import java.util.ArrayList;
public class AssignQ2 {
    /*
    @Override
    public String toString() {
        return "AssignQ2{" +
                "totalPrice=" + totalPrice +
                ", status='" + status + '\'' +
                '}';
    }
*/
	public AssignQ2(int totalPrice, String status) {
        this.totalPrice = totalPrice;
        this.status = status;
    }
	public int getTotalPrice() {
        return totalPrice;
    }
	public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
	public String getStatus() {
        return status;
    }
	public void setStatus(String status) {
        this.status = status;
    }
	private int totalPrice;
    private String status;

    public static ArrayList<AssignQ2> listOfOrders(ArrayList<AssignQ2> orders) {
        ArrayList<AssignQ2> listOrders = new ArrayList<>();


        for(AssignQ2 order:orders){
            if((order.getStatus().equals("ACCEPTED") || order.getStatus().equals("COMPLETED"))&& order.getTotalPrice()>1000){
                System.out.println("Inside if");
                AssignQ2 or = new AssignQ2(order.getTotalPrice(),order.getStatus());
                listOrders.add(or);
            }
        }

        return listOrders;
    }
    public static void main(String[] args) {
        AssignQ2 a1 = new AssignQ2(1001,"ACCEPTED");
        AssignQ2 a2 = new AssignQ2(1000,"ACCEPTED");
        AssignQ2 a3 = new AssignQ2(1050,"COMPLETED");
        AssignQ2 a4 = new AssignQ2(100,"ACCEPTED");
        AssignQ2 a5 = new AssignQ2(1002,"ACCEPTED");
        AssignQ2 a6 = new AssignQ2(1500,"REJECTED");
        AssignQ2 a7 = new AssignQ2(500000,"COMPLETED");

        ArrayList<AssignQ2> list = new ArrayList<>();
        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);
        list.add(a5);
        list.add(a6);
        list.add(a7);
        System.out.println(list);
        System.out.println(listOfOrders(list));



    }
}