package HomeWork6;

public class TestTrees {
    private static void generateTreesAndCheckBalance(BinaryTree[] trees){
        for(int i =0;i<trees.length;i++){
            trees[i] = new BinaryTree();
            for(int j=0;j<64;j++){
                trees[i].add((int) (Math.random()*100+Math.random()*(-100)));
            }
            System.out.println(trees[i].isBalanced());
        }
    }
    public static void main(String[] args) {
        BinaryTree[] trees = new BinaryTree[20];
        generateTreesAndCheckBalance(trees);
    }
}
