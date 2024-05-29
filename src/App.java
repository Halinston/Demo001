public class App {


    public static void main(String[] args) throws Exception {

        int nums[] = {9, 3, 8, 2, 4};
        int size = nums.length;
        int temp = 0; 

        System.out.println("Before Sorting");
        for (int num : nums) {
            System.out.print(num);
        }


            for (int i = 0; <size; i++)
            {
                for( int j=0; j<size; j++ )
                {
                    if (nums[j] > nums[j+1])
                    {
                        temp = nums[j];
                        nums[j] = nums[j+1];
                        nums[j+1] = temp;
                    }
                }
            }


        System.out.println();
        System.out.println();
        System.out.println("After Sorting");
        for (int num : nums) {
            System.out.print(num);
        }

    }
}
