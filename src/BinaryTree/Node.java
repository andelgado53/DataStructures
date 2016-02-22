package BinaryTree;

public class Node {
	private Node leftNode;
	private Node rightNode;
	private Integer data;
	
	public Node(Integer data){
		this.data = data;
	}
	
	public Integer getData(){
		return this.data;
	}
	public void setLeftNode(Node left){
		this.leftNode = left;
	}
	public void setRightNode(Node right){
		this.rightNode = right;
	}
	public Node getLeftNode(){
		return this.leftNode;
	}
	public Node getRightNode(){
		return this.rightNode;
	}
}
