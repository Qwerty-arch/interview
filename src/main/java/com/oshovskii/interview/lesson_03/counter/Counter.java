package com.oshovskii.interview.lesson_03.counter;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    private int value;
    private final Lock lock;

    public Counter() {
        lock = new ReentrantLock();
    }

    public void increment(int amount) {
        lock.lock();
        value += amount;
        lock.unlock();
    }

    public void decrement(int amount) {
        lock.lock();
        value -= amount;
        lock.unlock();
    }

    public int getValue() {
        return value;
    }
}

// AtomicInteger value = new AtomicInteger(0)
/*
public ThreadSafeCounter(AtomicInteger value) {
    this.value = value;
}

public void increment() {
    value.incrementAndGet();
}

public void decrement() {
    value.decrementAndGet();
}

public AtomicInteger getValue() {
    return value;
}
 */