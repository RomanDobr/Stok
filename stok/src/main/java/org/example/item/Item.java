package org.example.item;

public abstract class Item {
    public boolean isBroken = false;

    public boolean getIsBroken() {
        return isBroken;
    }

    public void setBroken(boolean broken) {
        isBroken = broken;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + this.isBroken;
    }
}
