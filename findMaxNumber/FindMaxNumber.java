package findMaxNumber;


public class FindMaxNumber {

    int posicion;

    int sizeList;

    int m;

    public void size1(int[] list) {
        posicion = 0;
        m = list[0];
        this.sizeList = list.length;
        if (sizeList == 1) {
            System.out.println("the largest number is " + m);
            return;
        }
        compare(list);
        System.out.println("the largest number is " + m);
        return;

    }

    public void compare(int[] list) {

        if (posicion < sizeList - 1) {
            if (m < list[++posicion])
                m = list[posicion];
            compare(list);
        }


        return;


    }


}
