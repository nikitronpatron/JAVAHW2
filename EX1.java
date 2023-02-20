// 1. Создать метод, который проверяет, является ли строка палиндромом.

import java.util.Scanner;

public class EX1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("Введите строку: ");
        String data = input.nextLine();
        int count = 0;
        for(int i = 0; i < data.length() - 1; i++)
        {
            if(data.charAt(i) == data.charAt(data.length() - i - 1))
            {
                count++;
            }
            else
            {
                continue;
            }
        }
        if(count == data.length() - 1)
        {
            System.out.printf("Строка %s является палиндомом ", data);
        }
        else
        {
            System.out.printf("Строка %s не является палиндомом ", data);
        }
        input.close();
    }
}
