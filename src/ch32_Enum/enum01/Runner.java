package ch32_Enum.enum01;

public class Runner {
    public static void main(String[] args) {

Aylar ay=Aylar.AGUSTOS;
        System.out.println("ay = " + ay);
        System.out.println("ay.name() = " + ay.name());
        System.out.println("ay.hashCode() = " + ay.hashCode());
        System.out.println("ay.ordinal() = " + ay.ordinal());
switch (ay){
    case OCAK:
        System.out.println("31 gun");
        break;
    case SUBAT:
        System.out.println("28 gun");
    break;
    case MART:
        System.out.println("31 gun");
        break;
    case AGUSTOS:
        System.out.println("31 gun");
        break;
    default:
        System.out.println("yanlis");
        }









    }


}
