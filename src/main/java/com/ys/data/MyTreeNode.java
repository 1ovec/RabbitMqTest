package com.ys.data;

public class MyTreeNode {



    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }


        public void preOrderTraveral(TreeNode node) {
            if (node == null) {
                return;
            }
            System.out.println(node.val);
            preOrderTraveral(node.left);
            preOrderTraveral(node.right);
        }

        //中序遍历
        public void inOrderTraveral(TreeNode node) {
            if (node == null) {
                return;
            }
            inOrderTraveral(node.left);
            System.out.println(node.val);
            inOrderTraveral(node.right);
        }

        //后序遍历
        public void postOrderTraveral(TreeNode node) {
            if (node == null) {
                return;
            }
            postOrderTraveral(node.left);
            postOrderTraveral(node.right);
            System.out.println(node.val);
        }
    }




}
