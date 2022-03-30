import java.util.ArrayList;

public class ALStack<PANCAKE> implements Stack<PANCAKE>{
  private ArrayList<PANCAKE> _stack = new ArrayList<PANCAKE> ();
  private int _stackSize;

  // public ALStack() {
  //
  // }
  public boolean isEmpty() {
    if (_stack.size() == 0) {
      return true;
    }
    return false;
  }

  public PANCAKE peekTop() {
    return _stack.get(_stack.size() -1);
  }

  public PANCAKE pop() {
    PANCAKE retVal;
    if (isEmpty()) {
      return null;
    }
    retVal = _stack.get(_stack.size()-1);
    return retVal;
  }
  public void push(PANCAKE x) {
    _stack.set(_stack.size(), x);
  }
}
