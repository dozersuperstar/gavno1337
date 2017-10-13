package com.company;

class Dick {
    private int amount=3;
    private int huge;
    private boolean pizda;

    public Dick(int amount,int huge) {
        this.amount=amount;
        this.huge=huge;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getHuge() {
        return huge;
    }

    public void setHuge(int huge) {
        this.huge = huge;
    }

    public boolean isPizda() {
        return pizda;
    }

    public void setPizda(boolean pizda) {
        this.pizda = pizda;
    }
}
