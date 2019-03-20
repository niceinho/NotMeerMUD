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
        tree.getHead().mLeft = new Node("<", 'c');
        tree.getHead().mLeft.mLeft = new Node("x", 'v');
        tree.getHead().mLeft.mRight = new Node("10", 'n');
        tree.getHead().mMiddle = new Node("=", 'f');
        tree.getHead().mMiddle.mLeft = new Node("x", 'v');
        tree.getHead().mMiddle.mRight = new Node("10", 'n');
        tree.getHead().mRight = new Node("if", 'k');
        tree.getHead().mRight.mLeft = new Node("==", 'c');
        tree.getHead().mRight.mLeft.mRight = new Node("0", 'n');
        tree.getHead().mRight.mLeft.mLeft = new Node("%", 'f');
        tree.getHead().mRight.mLeft.mLeft.mLeft = new Node("x", 'v');
        tree.getHead().mRight.mLeft.mLeft.mRight = new Node("2", 'n');
        tree.getHead().mRight.mMiddle = new Node("=", 'f');
        tree.getHead().mRight.mMiddle.mLeft = new Node("x", 'v');
        tree.getHead().mRight.mMiddle.mRight = new Node("+", 'f');
        tree.getHead().mRight.mMiddle.mRight.mLeft = new Node("x", 'v');
        tree.getHead().mRight.mMiddle.mRight.mRight = new Node("1", 'n');
        tree.getHead().mRight.mRight = new Node("=", 'f');
        tree.getHead().mRight.mRight.mLeft = new Node("x", 'v');
        tree.getHead().mRight.mRight.mRight = new Node("*",'f');
        tree.getHead().mRight.mRight.mRight.mLeft = new Node("x", 'v');
        tree.getHead().mRight.mRight.mRight.mRight = new Node("3", 'n');

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
