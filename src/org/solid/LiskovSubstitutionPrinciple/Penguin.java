package org.solid.LiskovSubstitutionPrinciple;

class Penguin extends Bird{

    @Override
    public void fly(){
//        throw new UnsupportedOperationException(); // violate LSP here
    }
}
