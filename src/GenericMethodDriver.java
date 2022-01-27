import java.util.ArrayList;

public class GenericMethodDriver {
    public static void main(String[] args) {
        GenericMethodsClass gmc = new GenericMethodsClass();

        Integer[] intArray = {1,2,3};
        String [] wordArray = {"This","is","fun"};

        gmc.printArray(intArray);
        gmc.printArray(wordArray);

        ArrayList<Double> array1 = new ArrayList<Double>();
        array1.add(25.5);
        array1.add(34.9);
        array1.add(45.7);
        gmc.printList(array1);

        ArrayList<Integer> array2 = new ArrayList<Integer>();
        array2.add(10);
        array2.add(20);
        array2.add(30);
        gmc.printList(array2);


        System.out.println(gmc.sumOfList(array1));
        System.out.println((int) gmc.sumOfList(array1));

        ArrayList<Integer> intArraye = new ArrayList<Integer>();
        gmc.addNumbers(intArraye);
        gmc.printList(intArraye);
    }// end psvm

}// end GMD