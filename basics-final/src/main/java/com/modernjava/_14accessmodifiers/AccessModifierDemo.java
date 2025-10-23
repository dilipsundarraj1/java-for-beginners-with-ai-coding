package com.modernjava._14accessmodifiers;

// Demonstrates access to various members from other classes in the same package
public class AccessModifierDemo {
    public static void main(String[] args) {
        PublicExample pub = new PublicExample();
        System.out.println(pub.publicField); // Accessible
        pub.publicMethod(); // Accessible

        ProtectedExample prot = new ProtectedExample();
        // System.out.println(prot.protectedField); // Accessible in same package
        // prot.protectedMethod(); // Accessible in same package
        System.out.println(prot.protectedField);
        prot.protectedMethod();

        DefaultExample def = new DefaultExample();
        System.out.println(def.defaultField); // Accessible in same package
        def.defaultMethod(); // Accessible in same package

        PrivateExample priv = new PrivateExample();
        // System.out.println(priv.privateField); // Not accessible
        // priv.privateMethod(); // Not accessible
        priv.showPrivateAccess(); // Accesses private members internally
    }
}

