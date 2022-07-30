public class text {
    public static void main(String[] args) {
        /*
        singleone singleone1=singleone.getsingleone();
        singleone singleone2=singleone.getsingleone();
        singleone1.setnum(1);
        singleone1.setName("张三");
        System.out.println(singleone1.getnum());
        //System.out.println(singleone1.getName());
        singleone2.setnum(2);
        System.out.println(singleone1.getnum());

         */
        /*
        SingleOne2 singleOne2=SingleOne2.getSingleOne2();
        SingleOne2 singleOne21=SingleOne2.getSingleOne2();
        singleOne2.setnum(1);
        System.out.println(singleOne2.getnum());
        singleOne21.setnum(2);
        System.out.println(singleOne2.getnum());

         */

        IdentityCardNo no1 = null;
        IdentityCardNo no2 = null;
        no1=IdentityCardNo.getinstance();
        no2=IdentityCardNo.getinstance();
        no1.setIdentityCardNo("12345678");
        System.out.println(no2.getIdentityCardNo());




    }
}
