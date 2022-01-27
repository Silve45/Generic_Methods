import java.util.*;

public class GenericMethodsClass {
    public <T> void printArray(T[] array){
        for (T arrayitem : array){
            System.out.println(arrayitem);
        }// end for
    }// end print array

    public void printList(List<?> list)  {
        for (Object elem: list)
            System.out.println(elem);
        System.out.println();
    }// end print list

    public double sumOfList(ArrayList<? extends Number> arrayList){
        double s = 0.0;
        for(Number n : arrayList)
            s += n.doubleValue();
            // end of for loop :)

        return s;
    }// end sum of list


    public void addNumbers(ArrayList<? super Integer> arrayList){
        for (int i = 1; i<= 10; i++){
            arrayList.add(i);
        }


    }// end of add Numbers
} //end GMC
