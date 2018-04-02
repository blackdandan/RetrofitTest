package com.example.blackdandan.retrofittest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class Pools {
    private static final int MAX_CORE_POOL_SIZE = Math.max(2, Runtime.getRuntime().availableProcessors()-1);
    public static final ExecutorService SERVICE = Executors.newFixedThreadPool(MAX_CORE_POOL_SIZE);
    public static final Scheduler SCHEDULER = Schedulers.from(SERVICE);
    public static final Scheduler.Worker WORKER = SCHEDULER.createWorker();
    public static final Scheduler.Worker MAIN_WORKER = AndroidSchedulers.mainThread().createWorker();
}
