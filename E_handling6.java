class E_handling6 extends Exception{
    private static int AccId[]={1000,1001,1002,1003};

    private static String Name[]={"Sombit","Sounak","Soudeep","Soumava"};

    private static int AccBalance[]={3600,6000,5000,800};

    E_handling6(){}

    E_handling6(String str){
        super(str);
    }

    public static void main(String[] args) {
        try{
            System.out.println("ACCOUNT ID"+"\t"+"NAME"+"\t"+"BALANCE");

            for(int i=0;i<5;i++){
                System.out.println(AccId[i]+"\t"+Name[i]+"\t"+ AccBalance[i]);

                if(AccBalance[i]<1000){
                     E_handling6 me=new E_handling6("Cant process,balance is low");

                     throw me;
                }
            }
        }catch(E_handling6 e){
           e.printStackTrace();
        }
    }
}
  