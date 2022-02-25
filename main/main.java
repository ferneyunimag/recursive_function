package main;


import findMaxNumber.FindMaxNumber;

public class main {
    public static void main(String[] args) {

        FindMaxNumber findMaxNumber= new FindMaxNumber();

        int[] list = new int[] {0};
       findMaxNumber.size1(list);

       int []list1= new int[] {18};
       findMaxNumber.size1(list1);


        int []list2= new int[] {1,2};
        findMaxNumber.size1(list2);

        int []list3= new int[] {10,2,1,4,9,6,7,8};
        findMaxNumber.size1(list3);

        int []list4= new int[] {91,203,456,871,33,22,456,324};
        findMaxNumber.size1(list4);

        int []list5= new int[] {1,23,15,4,16,6,7,124};--set-upstream
        findMaxNumber.size1(list5);


    }
}
