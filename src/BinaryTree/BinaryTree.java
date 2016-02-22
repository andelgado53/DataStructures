package BinaryTree;

public class BinaryTree {
	public Node rootNode;
	
	public void addNode(Node node){
		if(node == null) return;
		if(rootNode == null) rootNode = node;
		else{
			Node temp = rootNode;
			boolean inserted = false;
			while(!inserted){
				if(node.getData() < temp.getData()){
					if(temp.getLeftNode() == null){
						temp.setLeftNode(node);
						inserted = true;
					}
					else temp = temp.getLeftNode();
						
					}
				else{
					if(temp.getRightNode() == null){
						temp.setRightNode(node);
						inserted = true;
					}
					else temp = temp.getRightNode();
				}
				}
			}
			
		}
	public void traverseBT(Node node){
		if(node == null) return;
		else{
			System.out.println(node.getData());
			this.traverseBT(node.getLeftNode());
			this.traverseBT(node.getRightNode());
		}
	}
	
	public void traverseBT(){
		Node node = this.rootNode;
		if(node == null) return;
		else{
			this.traverseBT(node);
		}
	}
	
	public Integer max(){
		Node temp = this.rootNode;
		Integer max = null;
		while(temp != null){
			max = temp.getData();
			temp = temp.getRightNode();
		}
		return max;
		
	}
	
	public Integer min(){
		Node temp = this.rootNode;
		Integer min = null;
		while(temp != null){
			min = temp.getData();
			temp = temp.getLeftNode();
		}
		return min;
		
	}
	
	public boolean contains(Node node, Integer number){
		if(node == null) return false;
		else if(node.getData().equals(number)) return true;
		else{
			if(number < node.getData()) return contains(node.getLeftNode(), number);
			else return contains(node.getRightNode(), number);
		}
		
	}
	
	public boolean contains(Integer number){
		Node node = this.rootNode;
		if(node == null) return false;
		else if(node.getData().equals(number)) return true;
		else{
			if(number < node.getData()) return contains(node.getLeftNode(), number);
			else return contains(node.getRightNode(), number);
		}
		
	}
	
	public Node findParentNode(Node node, Integer number){
		if(node == null) return null;
		else if((node.getRightNode() != null && node.getRightNode().getData().equals(number)) |
				(node.getLeftNode() != null && node.getLeftNode().getData().equals(number))){
			return node;
		}
		if(number < node.getData()) return findParentNode(node.getLeftNode(), number);
		else return findParentNode(node.getRightNode(), number);
		
	}
	
	public void delete(Integer number){
		Node temp = this.rootNode;
		if(temp == null) return;
		if(temp.getData().equals(number)){
			Node right = temp.getRightNode();
			Node left = temp.getLeftNode();
			this.rootNode = right;
			this.addNode(left);
			return;
		}
		else{
			Node parent = findParentNode(temp, number);
			if(parent != null){
				Node left = parent.getLeftNode();
				Node right = parent.getRightNode();
				if(left != null && left.getData().equals(number)){
					parent.setLeftNode(null);
					this.addNode(left.getLeftNode());
					this.addNode(left.getRightNode());
				}
				else if(right != null && right.getData().equals(number)){
					parent.setRightNode(null);
					this.addNode(right.getLeftNode());
					this.addNode(right.getRightNode());
				}
			}
		}
	}
	
	
	

}
