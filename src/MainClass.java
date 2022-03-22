class invalidAmount extends Exception{
    public invalidAmount(String str){
        super(str);
    }
};

class invalidUPI extends Exception{
    public invalidUPI(String str){
        super(str);
    }
};

class invalidUPIPin extends Exception{
    public invalidUPIPin(String str){
        super(str);
    }
};


class verify extends Exception{

    public void CheckDetails(int amount,String senderUPI,int upiPin)throws invalidAmount,invalidUPI,invalidUPIPin {

        if(amount==0){
            throw new invalidAmount("Amount should be greater than 0");
        }
        if(senderUPI.isEmpty())
        {
            throw new invalidUPI("Senders upi is invalid");
        }
        if(upiPin==0){
            throw new invalidUPIPin("Wrong upi pin");
        }
    }
};

class MainClass {

    public static void main(String[] args) {

        try {
            verify obj = new verify();
            obj.CheckDetails(200,"abc@upi",1234);
        }
        catch(invalidAmount | invalidUPI | invalidUPIPin e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Exception not caught.");
        }

    }

}