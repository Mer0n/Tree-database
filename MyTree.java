package MeresaMeron_Lab6;

import java.util.NoSuchElementException;

/**
 *
 * @author Mom and Dad
 * @param <E>
 */
public class MyTree<E extends Comparable<? super E>> implements BinaryTreee<E> {
 private MyTree<E> left, right, parent;  // children, can be null
 private E data;
 private <E> root;
 
  public MyTree(E data) {
    this.data = data;
    this.left = null;
    this.right = null;
    this.parent = null;
  }
   public MyTree(E data, MyTree<E> left, MyTree<E> right) {
    this.data = data;
    this.left = left;
    this.right = right;
  }
     public boolean isLeaf() {
    return left == null && right == null;
  }
  
  
  
    @Override
    public TreeNode<E, ?> rootNode() {
        if(parent == null){
  return root;
 }
 return parent.rootNode();
    }

    @Override
    public boolean has(E element) {
        return left != null && right != null ;
    }
     public boolean hasLeft() {
    return left != null;
  }
     public boolean hasRight() {
    return right != null;
  }

    @Override
    public E min() throws NoSuchElementException {
        if (root == null) {
    		return null;
    	}
    	MyNode<E> min = root;
        while (min.left != null) {
        	min = min.left;
        }
        return min.data;
    }

    @Override
    public E max() throws NoSuchElementException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(E element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remove(E element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        return 1 + (hasLeft() ? left.size() : 0) + (hasRight() ? right.size() : 0);
    }

 @Override
  public int height() {
    if (isLeaf()) 
      return 0;
    else
      return 1 + Math.max(hasLeft() ? left.height() : 0, hasRight() ? right.height() : 0);
  } 
    
}
