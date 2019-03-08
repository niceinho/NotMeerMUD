/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package meercode;

import meercode.*;
import meercode.ast.*;
public class MeerCode {

    public void readerTest()
    {
        AbstractSyntaxTree tree = new AbstractSyntaxTree(new Node("if", 'k'));
        tree.getHead().left = new Node("<", 'c');
        tree.getHead().left.left = new Node("x", 'v');
        tree.getHead().left.right = new Node("10", 'n');
        tree.getHead().middle = new Node("=", 'f');
        tree.getHead().middle.left = new Node("x", 'v');
        tree.getHead().middle.right = new Node("10", 'n');
        tree.getHead().right = new Node("if", 'k');
        tree.getHead().right.left = new Node("==", 'c');
        tree.getHead().right.left.right = new Node("0", 'n');
        tree.getHead().right.left.left = new Node("%", 'f');
        tree.getHead().right.left.left.left = new Node("x", 'v');
        tree.getHead().right.left.left.right = new Node("2", 'n');
        tree.getHead().right.middle = new Node("=", 'f');
        tree.getHead().right.middle.left = new Node("x", 'v');
        tree.getHead().right.middle.right = new Node("+", 'f');
        tree.getHead().right.middle.right.left = new Node("x", 'v');
        tree.getHead().right.middle.right.right = new Node("1", 'n');
        tree.getHead().right.right = new Node("=", 'f');
        tree.getHead().right.right.left = new Node("x", 'v');
        tree.getHead().right.right.right = new Node("*",'f');
        tree.getHead().right.right.right.left = new Node("x", 'v');
        tree.getHead().right.right.right.right = new Node("3", 'n');

        String output = "C:/Users/robin/Desktop/GitStuff/MeerCode/src/main/java/meercode/TestOutput.txt";
        try
        {
            System.out.println("Making reader");
           ASTReader.convertTo3AC(tree, output);
            
        }
        catch (Exception E)
        {
            System.out.println("IO Exception occured");
        }
    }
    public static void main(String[] args) {
    }
}
