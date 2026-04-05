package com.example.flappybird.model;

public class Birb {
    private double x;
    private double y;
    private double velocityX;
    private double velocityY;

    private final double width;
    private final double height;

    public Birb(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.velocityX = 0;
        this.velocityY = 0;
    }

    public void jump() {
        velocityY = -0.4;
    }

    public void dashLeft() {
        velocityX = -0.5;
    }

    public void dashRight() { velocityX = 0.5; }

    public void update() {
        velocityY += 0.0004; // gravity
        if (velocityX < 0) {
            velocityX += 0.0001;
        } else if (velocityX > 0) {
            velocityX -= 0.0001;
        }
        x += velocityX;
        y += velocityY;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getVelocityY() {
        return velocityY;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setVelocityX(double x) { this.velocityX = x; }
}