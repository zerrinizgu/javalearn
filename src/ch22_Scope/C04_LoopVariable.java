package ch22_Scope;

public class C04_LoopVariable {
    public static void main(String[] args) {
        int yas=33;
        System.out.println("yas = " + yas);
        for (int i = 0; i <yas ; i++) {
            System.out.println("yas = " + yas);
            int maas=30000;
            System.out.println("maas = " + maas);

            C01_InstanceVariable obj=new C01_InstanceVariable();
            System.out.println("obj.name = " + obj.name);
            obj.nonStaticMethod();
            C01_InstanceVariable.staticMethod();


        }

    }
}
