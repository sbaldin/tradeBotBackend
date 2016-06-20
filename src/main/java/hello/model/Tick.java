package hello.model;

import org.springframework.data.annotation.Id;

/**
 * Класс описывающий одну операцию с ценными бумагами в определенный момент времени за минуту
 * Created by fesswood on 18.06.16.
 */
public class Tick {
    @Id
    long mTimestamp;
    double mMinPrice;
    double mMaxPrice;
    double mClosingPrice;
    double mOpeningPrice;
    double mPartCount;

    public Tick() {
    }

    public Tick(long mTimestamp, double mMinPrice, double mMaxPrice, double mClosingPrice, double mOpeningPrice, double mPartCount) {
        this.mTimestamp = mTimestamp;
        this.mMinPrice = mMinPrice;
        this.mMaxPrice = mMaxPrice;
        this.mClosingPrice = mClosingPrice;
        this.mOpeningPrice = mOpeningPrice;
        this.mPartCount = mPartCount;
    }

    public long getmTimestamp() {
        return mTimestamp;
    }

    public void setmTimestamp(long mTimestamp) {
        this.mTimestamp = mTimestamp;
    }

    public double getmMinPrice() {
        return mMinPrice;
    }

    public void setmMinPrice(double mMinPrice) {
        this.mMinPrice = mMinPrice;
    }

    public double getmMaxPrice() {
        return mMaxPrice;
    }

    public void setmMaxPrice(double mMaxPrice) {
        this.mMaxPrice = mMaxPrice;
    }

    public double getmClosingPrice() {
        return mClosingPrice;
    }

    public void setmClosingPrice(double mClosingPrice) {
        this.mClosingPrice = mClosingPrice;
    }

    public double getmOpeningPrice() {
        return mOpeningPrice;
    }

    public void setmOpeningPrice(double mOpeningPrice) {
        this.mOpeningPrice = mOpeningPrice;
    }

    public double getmPartCount() {
        return mPartCount;
    }

    public void setmPartCount(double mPartCount) {
        this.mPartCount = mPartCount;
    }

    @Override
    public String toString() {
        return "Tick{" +
                "mTimestamp=" + mTimestamp +
                ", mMinPrice=" + mMinPrice +
                ", mMaxPrice=" + mMaxPrice +
                ", mClosingPrice=" + mClosingPrice +
                ", mOpeningPrice=" + mOpeningPrice +
                ", mPartCount=" + mPartCount +
                '}';
    }
}
