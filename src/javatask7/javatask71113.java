package javatask7;

import java.util.ArrayList;
import java.util.Scanner;

public class javatask71113
{
    public static void main(String [] args)
    {
        ArrayList<Integer> list = creatList();
        removeDuplicate(list);
        System.out.print("The distinct integers are ");
        for (int num : list )
        {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static ArrayList<Integer> creatList()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten integers: ");
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        while (count < 10)
        {
            list.add(new Integer(input.nextInt()));
            count++;
        }
        return list;
    }
    public static void removeDuplicate(ArrayList<Integer> list)
    {
        ArrayList<Integer> temp = new ArrayList<>();
        for (Integer element : list)
        {
            if (!temp.contains(element))
            {
                temp.add(element);
            }
        }

        int[] index = new int[list.size()];
        java.util.Arrays.fill(index, 0);
        for (int i = 0; i < temp.size(); i++)
        {
            index[list.indexOf(temp.get(i))] = 1;
        }
        for (int i = index.length - 1; i >= 0; i--)
        {
            if (index[i] == 0)
            {
                list.remove(i);
            }
        }
    }
}