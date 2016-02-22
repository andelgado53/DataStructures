package BinaryTree;


public class testBinaryTree {

	public static void main(String[] args) {
		
		
		BinaryTree bt2 = new BinaryTree();
		Integer[] num = {10,1,67,2,33,100,150};
		for(int i=0; i < num.length; i+=1){
			bt2.addNode(new Node(num[i]));
			
		}
		
		System.out.println("Traversing tree");
		bt2.traverseBT();
		System.out.println("*************");
		System.out.println("Max value in the tree is:");
		System.out.println(bt2.max());
		System.out.println("*************");
		System.out.println("Min value in the tree:");
		System.out.println(bt2.min());
		System.out.println("*************");
		System.out.println("Is value 20 in the tree?");
		System.out.println(bt2.contains(20));
		System.out.println("*************");
		System.out.println("Is value 10 in the tree?");
		System.out.println(bt2.contains(10));
		System.out.println("*************");
		System.out.println("Delete value 10 in the tree, the root Node.");
		bt2.delete(10);
		System.out.println("Traversing tree after removing 10");
		bt2.traverseBT();
		System.out.println("*************");
		System.out.println("Delete value 150 in the tree, the last Node.");
		bt2.delete(150);
		System.out.println("Traversing tree after removing 150");
		bt2.traverseBT();
		System.out.println("*************");
		System.out.println("Delete value 1 in the tree.");
		bt2.delete(1);
		System.out.println("Traversing tree after removing 1.");
		bt2.traverseBT();
				
		
	}

}
