package com.greatlearning.bsttoskewed;

import com.greatlearning.node.Node;

public class BSTtoSkewed {
	
public Node rightRoot = null;
	
	
	public Node BSTSkewed(Node root)
	{
		
		if(root == null) {
			return rightRoot;
		}else {
			BSTSkewed(root.left);
			rightRoot = createSkewedTree(rightRoot, root);
			BSTSkewed(root.right);

		}	
		return rightRoot;
	}

	
	public Node createSkewedTree(Node rightRoot, Node root) {
		Node n = new Node(root.value);
		if(rightRoot == null) {
			return n;
		}else {
			rightRoot.right = createSkewedTree(rightRoot.right, root);
		}
		return rightRoot;

	}
	
	
	public void traverseRightSkewed(Node root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.value + " ");
        traverseRightSkewed(root.right);       
    }
	

}
