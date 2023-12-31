package j100_CodeChallange.Challange01;

public class Task03_PrimitiveDataType {
    public static void main(String[] args) {
        /*
         * Primitive data type
                byte: only takes whole numbers
	 	        short: only takes whole numbers
	 	        int(used more often): only takes whole numbers
	 	        long: only takes whole numbers

	 	        float: can take decimals (MUST have F or f at the end)
	 	        double( used more often): can take decimals

	 	        boolean: true or false boolean expressions
	 	        char: character within single quote ''
	 	        	 	also takes number
         * Range: double > float >long > int >short > byte
         * !!! soutv degeri ile yazdirma
         */

        //byte, short, integer,long, double, float veri tiplerinin max ve min degerlerini yazdiralim.


        //Her data type bir tane olmak uzere 4 variable create ediniz. (float, double, char, boolean)
        //Degiskenler icin anlamli isimler kullanip, print ediniz


//byte, short, integer,long, double, float data type'larının max ve min degerlerini print eden code create ediniz.

        byte byteMinValue=Byte.MIN_VALUE;//byte type assaignment(atama) aypılan variable create edildi.
        System.out.println("byteMinValue = " + byteMinValue);

        byte byteMaxValue=Byte.MAX_VALUE;// -128
        System.out.println("byteMaxValue = " + byteMaxValue); // 127

        System.out.println("Short.MIN_VALUE = " + Short.MIN_VALUE); //-32768
        System.out.println("Short.MAX_VALUE = " + Short.MAX_VALUE); //32767

        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);//-2147483648
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);//2147483647

        System.out.println("Long.MIN_VALUE = " + Long.MIN_VALUE);//-9223372036854775808
        System.out.println("Long.MAX_VALUE = " + Long.MAX_VALUE);//9223372036854775807

        System.out.println("Double.MIN_VALUE = " + Double.MIN_VALUE);// 4.9E-324
        System.out.println("Double.MAX_VALUE = " + Double.MAX_VALUE); // 1.7976931348623157E308

    }
}
