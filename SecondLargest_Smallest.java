import java.util.Scanner;
 class SecondLargest_Smallest
{
    public static void main(String[] args)
    {
        
        int num, temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array");
        num = s.nextInt();
        int a[] = new int[num];                 
        System.out.println("Enter all the elements:");
        
        for (int i = 0; i < num; i++)
        {
            a[i] = s.nextInt();        
        }
        for (int i = 0; i < num; i++)          
        {
            for (int j = i + 1; j < num; j++)           
            {
                if (a[i] > a[j])                        
                {
                    temp = a[i];                        
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Second Largest:"+a[num-2]);           
        System.out.println("Second Smallest:"+a[1]);              
    }
}
