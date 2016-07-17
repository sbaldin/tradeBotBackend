package com.github.fesswood.entity;



import javax.persistence.*;
import java.util.Date;

/**
 * Класс описывающий одну операцию с ценными бумагами в определенный момент времени за минуту
 * Created by fesswood on 18.66.16.
 */
@Entity(name = "candlestick")
public class Tick extends DomainObject {
    @Id
    @Column(name = "tickTimestamp", columnDefinition="DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    Date mTimestamp;
    @Column(name = "minPrice", nullable = false, precision=6, scale=6)
    double mMinPrice;
    @Column(name = "maxPrice", nullable = false, precision=6, scale=6)
    double mMaxPrice;
    @Column(name = "closingPrice", nullable = false, precision=6, scale=6)
    double mClosingPrice;
    @Column(name = "openingPrice", nullable = false, precision=6, scale=6)
    double mOpeningPrice;
    @Column(name = "partCount", nullable = false)
    int mPartCount;

    public Tick() {
    }

    public Tick(Date timestamp, double minPrice, double maxPrice, double closingPrice, double openingPrice, int partCount) {
        this.mTimestamp = timestamp;
        this.mMinPrice = minPrice;
        this.mMaxPrice = maxPrice;
        this.mClosingPrice = closingPrice;
        this.mOpeningPrice = openingPrice;
        this.mPartCount = partCount;
    }

    public Date getmTimestamp() {
        return mTimestamp;
    }

    public void setmTimestamp(Date mTimestamp) {
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

    public int getmPartCount() {
        return mPartCount;
    }

    public void setmPartCount(int mPartCount) {
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
