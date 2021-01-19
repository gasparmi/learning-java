import java.util.Stack;

class GenericStuff {
    public static void main(String[] args){
        Stack<String> s1 = new Stack<String>();
        Stack<Integer> s2 = new Stack<Integer>();

        for(int i = 0; i < 10; i++){
            s1.push(String.valueOf(i) + String.valueOf(i));
            s2.push(new Integer(i * i));
        }
        
        System.out.println("Popping s1");
        while(!s1.empty()){
            System.out.println(s1.pop());
        }

        System.out.println("\nPopping s2");

        while(!s2.empty()){
            System.out.println(s2.pop());
        }
    }
}