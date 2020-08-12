package jianzhioffer;





import tools.TreeNode;

import java.util.Arrays;

import static tools.tools.printArrays;


/**
 * 输入某二叉树的前序遍历和中序遍历的结果，
 * 请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，
 * 则重建二叉树并返回。
 */

/**
 * 本题注意Arrays.copyOfRange的用法
 */
public class reConstructBinaryTree {
    public TreeNode reConstruct(int[] pre, int[] in) {

        if (pre.length == 0) {
            return null;
        }

        if (pre.length == 1) {
            return new TreeNode(pre[0]);
        }


        TreeNode root = new TreeNode(pre[0]);
        for (int i = 0; i < in.length; i++) {
            if (in[i] == pre[0]) {
                root.left = reConstruct(Arrays.copyOfRange(pre, 1, i + 1), Arrays.copyOfRange(in, 0, i));
                root.right = reConstruct(Arrays.copyOfRange(pre, i + 1, pre.length), Arrays.copyOfRange(in, i + 1, pre.length));
                break;
            }
        }
        return root;

    }

    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        printArrays(Arrays.copyOfRange(a,0,4));
    }


}
