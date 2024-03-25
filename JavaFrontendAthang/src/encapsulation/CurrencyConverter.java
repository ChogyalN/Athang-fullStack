package encapsulation;

public class CurrencyConverter {
    private float amountInUSD;
    private final float RATE = 82.43f;
    private float commisionForUSD = 1.5f;
    private float amountInNu;

    protected void setAmountInUSD(float amountInUSD) {
        this.amountInUSD = amountInUSD;
        setAmountInNu();
    }
    protected float getAmountInNu() {
        return amountInNu;
    }
    private void setAmountInNu() {
        float commision = (float) amountInUSD * (1.5f/100);
        this.amountInNu = (amountInUSD - commision) * this.RATE;
    }
}
