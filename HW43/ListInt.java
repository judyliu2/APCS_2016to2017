//Team Titanium: Augie Murphy, Judy Liu
// APCS1 pd03
// HW#43 -- Array of Titanium
// 2016-12-11

public interface ListInt{

    
   /********* add() ***********
    adds newVal param after last significant value
    **************************/
    public abstract void add(int a);

   /******** add() ***********
    adds newVal param at index param
    **************************/
    public abstract void add(int a, int b);

   /******* remove() *********
    removes val at index param and scooches the values greater than the index over one
    **************************/
    public abstract void remove(int a);
    
    /******** size() *********
    accesses inst var _size aka number of sig vals
    **************************/
    public abstract int size();
}
