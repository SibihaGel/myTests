package org.example;

public class RedBlackTree {

    public static void main(String[] args) {

int num = 0;

for (int i = 0; i < 100; i++) {
    num = num++;
}
        System.out.println(num); // 0 !!!!!!

        Tree tree = new Tree(20,
                new Tree(7,
                        new Tree(4,null, new Tree(6)), new Tree(9)),
                new Tree (35,
                        new Tree(31, new Tree(28), null),
                        new Tree(40, new Tree(38, null, null), new Tree(52,null,null))));
        System.out.println("Сумма дерева : " + tree.sum());
    }
    static class Tree  {
        int value;
        Tree left;
        Tree right;

        public Tree(int value, Tree left, Tree right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
         public Tree(int value) {
            this.value = value;
         }
         public int sum () {
            int sum = value;

            if(left!=null) {
                sum += left.sum();
            }
            if(right!=null) {
                sum += right.sum();
            }
            return sum;
        }
    }

}
