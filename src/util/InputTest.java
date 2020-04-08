package util;


public class InputTest {
    public static void main(String[] args) {
        Input test = new Input();

//        System.out.println(test.getString());

//        System.out.println(test.yesNo());

//        System.out.println(test.getInt(3,9));

//        System.out.println(test.getInt());

//        System.out.println(test.getDouble());

        String[] names = {"Rick", "Stacey", "Brad", "Becca"};
        String x;
        try {
            x = names[100];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught!");
            x = "";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("This will always run.");
        }

    }





}
