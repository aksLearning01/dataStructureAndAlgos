        package edu.trees;

        public class BST {

            static class Node {
                Node left;
                Node right;
                int key;

                public Node(int key) {
                    this.left = null;
                    this.right = null;
                    this.key = key;
                }
            }

            private Node root;

            public BST() {
                this.root = null;
            }

            public void insert(int key) {
                root = insertUsingRec(root, key);

            }

            public Node insertUsingRec(Node root, int key) {
                //no element present in the tree
                if (root == null) {
                    root = new Node(key);
                    return root;
                }
                if (root.key > key) {
                    //left traversal
                    root.left = insertUsingRec(root.left, key);
                } else if (root.key < key) {
                    //right side sub tree traversal
                    root.right = insertUsingRec(root.right, key);
                }
                return root;
            }

            public Node search(int key){
                return searchUsingRec(root,key);
            }

            public Node searchUsingRec(Node root, int key) {
                if (root == null || root.key == key) {
                    return root;
                }
                if (root.key > key) {
                    return searchUsingRec(root.left, key);

                } else
                    return searchUsingRec(root.right, key);
            }

            void inorder() {
                inorder_Recursive(root);
            }

            // recursively traverse the BST
            void inorder_Recursive(Node root) {
                if (root != null) {
                    inorder_Recursive(root.left);
                    System.out.print(root.key + " ");
                    inorder_Recursive(root.right);
                }
            }

            public static void main(String[] args) {
                BST tree = new BST();
                tree.insert(40);
                tree.insert(20);
                tree.insert(70);
                tree.insert(90);
        //        tree.insert(20);
        //        tree.insert(10);
        //        tree.insert(5);
        //        tree.insert(3);
        //        tree.insert(8);
        //        tree.insert(15);
        //        tree.insert(25);
        //        tree.insert(23);
        //        tree.insert(22);
        //        tree.insert(24);
        //        tree.insert(80);
        //        tree.insert(70);
        //        tree.insert(60);
        //        tree.insert(75);
                tree.inorder();
                tree.delete(70);
                System.out.println("");
                tree.inorder();
            }

                //delete a specific node
 public void delete(int key){
				//search for the node
				Node nodeToDel=search(root,key);

				//find the parent node for the node to delete
				Node parentNode= findParent(root,nodeToDel);

				//find if the node is a leaf node
			   boolean isLeafNode= determineIfLeaf(nodeToDel);
		if(parentNode!=null) {
			if (isLeafNode) {
				deleteLeafNode(root, nodeToDel, parentNode);
				return;
			}

			//find if the node is having just one child
			boolean hasSingleChild = determineIfNodeHasOneChild(nodeToDel);
		}
			}

            public void deleteLeafNode(Node root,Node delNode,Node parent){
                while(true){
                    if(root.key==parent.key && delNode.key == parent.left.key){
                        //we need to point the left node to null from the parent
                        parent.left=null;
                        return;
                    }
                    else if(root.key==parent.key && delNode.key == parent.right.key){
                        //we need to point the left node to null from the parent
                        parent.right=null;
                        return;
                    }else if (root.key>parent.key){
                        deleteLeafNode(root.left,delNode,parent);
                    }else{
                        deleteLeafNode(root.right,delNode,parent);
                    }
                }
            }

            public Node search(Node node,int key){
                if(node.key==key || node==null){
                    return node;
                }
                 if(node.key>key){
                     return search(node.left,key);
                }else {
                      return  search(node.right,key);
                 }
            }

            public boolean determineIfLeaf(Node node){
                return (node.left==null && node.right==null);
            }

            public boolean determineIfNodeHasOneChild(Node node){
                return (node.left==null || node.right==null);
            }

            public Node findParent(Node root,Node curr){
                while(true){
                    if(root==null)return root;
                    if(root.left!=null && root.left.key== curr.key){
                        return root;
                    }
                    else if (root.right!=null &&root.right.key == curr.key){
                        return root;
                    }
                    else if(root.key>curr.key){
                        findParent(root.left,curr);
                    }else{
                        findParent(root.right,curr);
                    }
                }
            }
        }





