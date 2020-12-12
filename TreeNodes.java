package MeresaMeron_Lab6;

/**
 *
 * @author Mom and Dad
 */
      public class TreeNodes<E>  {

            private E value;

            private TreeNodes<E> leftChild;

            private TreeNodes<E> rightChild;

            private TreeNodes<E> parent;

            public TreeNodes(E value) {

                  super();

                  this.value = value;

                  this.leftChild = null;

                  this.rightChild = null;

                  this.parent = null;

            }

            public TreeNodes(E value, TreeNodes<E> parent,

                        TreeNodes<E> leftChild, TreeNodes<E> rightChild) {

                  super();

                  this.value = value;

                  this.leftChild = leftChild;

                  this.rightChild = rightChild;

                  this.parent = parent;

            }

           

            public E getValue() {

                  return this.value;

            }

            public TreeNodes<E> getLeftChild() {

                  return leftChild;

            }
            
            

            public void setLeftChild(TreeNodes<E> leftChild) {

                  this.leftChild = leftChild;

            }

            public TreeNodes<E> getRightChild() {

                  return rightChild;

            }

            public void setRightChild(TreeNodes<E> rightChild) {

                  this.rightChild = rightChild;

            }

            public void setValue(E value) {

                  this.value = value;

            }

            public TreeNodes<E> getParent() {

                  return parent;

            }

            
            public void setParent(TreeNodes<E> parent) {

                  this.parent = parent;

            }

   

    
    public boolean isLeaf() {
        
        return; 
    }

   




      }
