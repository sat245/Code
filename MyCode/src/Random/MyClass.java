package Random;

class MyClass {
    int a;
    String b;

    public static int sum(int a,int b){
        return a+b;
    }
    public static void main(String args[]) throws Exception {

        Class a = MyClass.class;
        MyClass obj = new MyClass();



        System.out.print(obj.sum(2,3));

    }

}
