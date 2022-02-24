import java.util.*;

public class CollectionBirthQ4 {
    int date,month,year;
    
    public CollectionBirthQ4(int date,int month,int year){
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public String toString(){
        return date+"-"+month+"-"+year;
    }

    public int getYear(){
        return year;
    }
    
    public static void main(String[] args) {
        LinkedList<CollectionBirthQ4> dob = new LinkedList<>();
        

        dob.add(new CollectionBirthQ4(04,10,2000));
        dob.add(new CollectionBirthQ4(22,03,1989));
        dob.add(new CollectionBirthQ4(20,12,2002));
        dob.add(new CollectionBirthQ4(26,07,2007));
        dob.add(new CollectionBirthQ4(28,01,2000));
        dob.add(new CollectionBirthQ4(12,12,2012));
        dob.add(new CollectionBirthQ4(22,03,1997));

        for (int i = 0 ; i<dob.size();i++){
            int year = dob.get(i).getYear();
            if (year%400==0 || year%100==0 || year%4==0){
                System.out.println(dob.get(i)+" : Born in Leap Year.");
            }else{
                System.out.println(dob.get(i)+" : Not Born in a Leap Year.");
            }
            
        }
    }
    
}