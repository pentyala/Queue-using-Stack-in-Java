/*  Author :        Aditya Kiran Pentyala
    Description:    The following code is implemented as follows. We consider two stacks. One stack is used only for pushing (Enqueueing) and the other stack is used only for popping (Dequeueing). Stack is a LIFO data structure. Queue is a FIFO data structure. 
*/

class Queue<T>
{
    Stack<Object> e=new Stack<Object>(),d=new Stack<Object>();
    //e. is for enqueue.
    //d. is for dequeue.
    //<description>
    //The following function is called by the function dequeue(Never call this function by using an object, It generates errors).
    //This function moves all the elements from stack e to d.
    //</description>
    public void run_trans()
    {
        while(!e.empty())
        {
            d.push(e.pop());
        }
    }
    
    //<description>
    //The elements are pushed into stack e.
    //</description>
    public void enqueue(T t)
    {
        if(t==null)
            return;
        e.push(t);
    }
    
    //<description>
    //The elements are popped from stack d.
    //</description>
    public T dequeue()
    {
        if(d.empty())
            run_trans();
        if(d.empty())
            return null;
        return (T)d.pop();
    }
    
    public T peek()
    {
        if(d.empty())
            run_trans();
        if(d.empty())
            return null;
        return (T)d.peek();
    }
    //The algorithm works as follows:
    //The elements are pushed in to the stack in a LIFO fashion.
    //But when these elements are moved to second stack all the elements are reversed, thus making the first inserted elements to be popped first. thus making the data structure a FIFo fashioned.
}
