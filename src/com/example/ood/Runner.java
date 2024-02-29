package com.example.ood;


/**
 * Write a description of class Runner here.
 *
 * @author (asifmanan)
 * @version (version 0)
 */
public class Runner
{
    public static void main(String[] args)
    {
        Family smiths;
        smiths = new Family("mary","fred");
        // create the children
        Person child1;
        child1 = new Person("anne",12);
        Person child2 = new Person("joe",16); // shortcut
        Person child3 = new Person("anil",14);

        Dog d1 = new Dog("Rex", "alsatian");

        // add the children to the array
        boolean childAddStatus = false; // $ Added a status flag which catches the return value of addChild to notify if operation was success or fail
        childAddStatus = smiths.addChild(child1);
        // $ Printing notification messages for operation success or failure
        if(childAddStatus) System.out.println("Child added successfully");
        else System.out.println("Failed to add child");

        childAddStatus = smiths.addChild(child2);
        if(childAddStatus) System.out.println("Child added successfully");
        else System.out.println("Failed to add child");
        // child3 ??
        childAddStatus = smiths.addChild (new Person("0lek", 7)); //shortcut using an anonymous object
        if(childAddStatus) System.out.println("Child added successfully");
        else System.out.println("Failed to add child");

        childAddStatus = smiths.addChild("ivan",6);  // alternative way to add a child - see Family code
        if(childAddStatus) System.out.println("Child added successfully");
        else System.out.println("Failed to add child");
        // display calling the mutator
        System.out.println("***** Using showAllChildren()");
        smiths.showAllChildren();

        // display calling the accessor
        System.out.println("***** Using getAllChildren()");
        String xx = smiths.getAllChildren();
        // client has control of what to do with the data
        System.out.println(xx);
        //OR shortcut :  System.out.println(smiths.getAllChildren());

        // different ways of adding a dog
        smiths.addDog(d1);
        smiths.addDog(new Dog("Loopy","Collie"));  // shortcut
        smiths.addDog("Fido", "Terrier");  // alternative way to add a dog in Family

        // how to display dog data ??

    }
}
