package stackBForAssignment;


import java.util.ArrayList;


public class StackB <T>{


   private ArrayList<T> items;


  


   public StackB() {

       items = new ArrayList<T>();
     


   }


  


   public void push(T item) {
   
       items.add(item);
        


   }


  


   public T top() {


       //if the Stack is empty, throw StackUnderFlowException


       //otherwise return a reference to the value that was most recently inserted into the ArrayList that StackB is managing
       if (items.isEmpty()) {
    	   throw new StackUnderFlowException();
       }
       else {
    	   return items.get(items.size() -1);
       }

    


   }


  


   public void pop() {


       //if the Stack is empty, throw StackUnderFlowExcewption


       //otherwise, remove the reference to the value that was most recently inserted into the ArrayList that StackB is managing
       if (items.isEmpty()) {
    	   throw new StackUnderFlowException();
       }
       items.remove(items.size()-1);
  
    


   }


  


   public boolean isFull() {

       //int maxNum = 2;
       // can StackB ever be filled to capacity, under which circumstance might this occur? 
       //if(items.size()>maxNum) {
    	   return false;
       }
    


  


   public boolean isEmpty() {


       //return true, if the ArrayList that StackB is managing is empty, otherwise return false
      return items.isEmpty();

  


   }


  


  


   public String toString() {


       //return the values that are referenced by the ArrayList in order that they would be removed when .pop() is invoked


      //Example: if the values  500, 600, 700 , 800 were inserted into StackB the toString() method should return


      //   [800, 700, 600, 500]


    


    StringBuilder str = new StringBuilder();


    str.append("[");


    


    int i= 0 ;


    for (i=items.size()-1; i> 0; i--) {


     str.append(items.get(i) + ", ");


    }


    str.append(items.get(0) + "]");


    return str.toString();


   }


}
