class Test {
    public static void main(String[] args) {
        System.out.println("-----TESTING FOR THE DEFAULT CONSTRUCTOR-----");
        VipCustomer vipCustomer1 = new VipCustomer();
        System.out.println(vipCustomer1.getName());
        System.out.println(vipCustomer1.getEmailAddress());
        System.out.println(vipCustomer1.getCreditLimit());
        System.out.println("-----TESTING FOR THE 2 PARAMETERS CONSTRUCTOR-----");
        VipCustomer vipCustomer2 = new VipCustomer("onur@icloud.com" , 300);
        System.out.println(vipCustomer2.getName());
        System.out.println(vipCustomer2.getEmailAddress());
        System.out.println(vipCustomer2.getCreditLimit());
        System.out.println("-----TESTING FOR THE 3 PARAMETERS CONSTRUCTOR-----");
        VipCustomer vipCustomer3 = new VipCustomer("Onur" ,"onur@icloud.com" , 300);
        System.out.println(vipCustomer3.getName());
        System.out.println(vipCustomer3.getEmailAddress());
        System.out.println(vipCustomer3.getCreditLimit());
    }
}
