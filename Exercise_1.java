class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
         //Write your code here
        if(top < 0)
            return true;
        else
            return false; 
    } 

    Stack() 
    { 
         //Initialize your constructor
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top >= (MAX-1)){
            System.out.println("Stack Overflow");
            return false;
        }
        //Write your code here
        else {
            top++;
            a[top] = x;
            System.out.println(x + "Pushed to Stack");
            return true;
        }   
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
         if(top < 0){
            System.out.println("Stack Underflow");
            return 0;
        }
        //Write your code here
        else{
            int x = a[top];
            top--;
            return x;
        }
    } 
  
    int peek() 
    { 
        //Write your code here
        if(top<0)
            return 0;
        //Write your code here
        else{
            return a[top];
        }
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
