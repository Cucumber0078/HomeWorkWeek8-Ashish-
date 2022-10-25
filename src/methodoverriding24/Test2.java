package methodoverriding24;

 class Test2 {
    public static void main(String[] args) {
        SBI s= new SBI();
        ICICI i= new ICICI();
        AXIS a= new AXIS();
        System.out.println("Sbi Rate of Interest: "+s.getRateOfInterest());
        System.out.println("Icici Rate Of Inrerest: " + i.getRateOfInterest());
        System.out.println("Axis Rate Of Interest: "+ a.getRateOfInterest());

    }
}
