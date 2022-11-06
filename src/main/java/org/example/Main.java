package org.example;

import io.reactivex.rxjava3.core.Observable;

import java.util.*;


public class Main {


    public static void main(String[] args) throws InterruptedException {

        List<String>  arrayList = new ArrayList<>();
        Collections.addAll(arrayList, "tutorial for git version"+ "1.01");
        arrayList.forEach(System.out::println);



//String result;

//        Observable<String> observable = Observable.just("Hello, Mike")
//                .map(s->s +" OMG")
//                .map(i -> i.replace("Mike", "John"))
//                .map(u -> u + " HEY");
//
//        observable.subscribe();
//        Thread.sleep(1500);
//        observable.subscribe();




//        startFunc("Ben", "John");
    }

//    public static void startFunc(String ... args){
//        Flowable.fromArray(args).subscribe(s-> System.out.println("Hello "+ s+ "!"));
//    }
    public int testSynchronized(int testA) throws InterruptedException {
        Thread.sleep(1500);
        System.out.println("we in method!");
        return ++testA;
    }
}
