package class_objects.Travel_details;
/*
Abhi ERROR aa rahi hai resolve karenge dekh ke
 */
public class BusTicket {
    int tickeNo;
    float ticketPrice,totalAmount;
    Person person ;

    public int getTickeNo() {
        return tickeNo;
    }

    public void setTickeNo(int tickeNo) {
        this.tickeNo = tickeNo;
    }

    public float getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(float ticketPrice) {

        this.ticketPrice = ticketPrice;
    }

    public float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }


    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    void calculateTotal(){
        try {
            System.out.println("Person age" + getPerson().getAge());
        }
        catch (Exception e){
            e.printStackTrace();
        }
        if(getPerson().getAge() < 16){
            setTotalAmount(getTicketPrice()-(getTicketPrice()/2));
        }
        else if(getPerson().getAge()>=60){
            setTotalAmount(getTicketPrice()-(getTicketPrice())/4);
        }
        else if(getPerson().getGender() == 'f' || getPerson().getGender() =='F')
            setTotalAmount(getTicketPrice()-(getTicketPrice())*(10/100));
        else
            setTotalAmount(getTicketPrice());

    }
}