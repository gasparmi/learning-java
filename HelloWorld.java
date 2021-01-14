import java.time.LocalDateTime; // classes from the Java Class Library, JCL

class HelloWorld {
    public static void main(String[] args) {

        boolean b = true;
        char c = 'c';
        byte by = 8;
        short sh = 16;
        int i = 32; // 4 bytes or 32 bites
        long l = 64;
        float f = 32.0f;
        double d = 64.0;

        System.out.println("Hello, world!");

        // arrays
        int[] arr = new int[10];
        arr[0] = 0;
        // arr[1000] = 1000; // this gives a runtime Exception
        
        for(int j = 0; j < arr.length; j++)
            arr[j] = j*j;

        // an array is just a pointer :)
        int[] arr2 = arr;
        arr2[5] = 112233;

        System.out.println(arr);
        System.out.println(arr2);

        for(int elem : arr)
            System.out.println(elem);
        
        
        System.out.println("It is now: " + LocalDateTime.now());

    }
}